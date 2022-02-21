package dev.yudin.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EncodeDecodeTinyURL {

    public static void main(String[] args) {

        Codec codec = new Codec();

        System.out.println(codec.encode("www.google.com"));

        System.out.println(codec.encode("www.google.com"));
    }


}

class Codec {
    private static final String SYMBOLS_FOR_CHOOSE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int AMOUNT_SYMBOLS = 6;

    Map<String, String> tinyLinksData = new HashMap<>();
    Map<String, String> originalLinksData = new HashMap<>();

    //a URL to a shortened URL
    public String encode(String longUrl) {
        StringBuilder shortURL = new StringBuilder();
        Random random = new Random();

        if (originalLinksData.containsKey(longUrl)) {
            return originalLinksData.get(longUrl);
        } else {
            do {
                for (int i = 0; i < AMOUNT_SYMBOLS; i++) {
                    int symbolSampleSize = SYMBOLS_FOR_CHOOSE.length();
                    int randomSymbol = random.nextInt(symbolSampleSize);
                    char symbol = SYMBOLS_FOR_CHOOSE.charAt(randomSymbol);

                    shortURL.append(symbol);
                }
            } while (originalLinksData.containsValue(shortURL.toString()));
            originalLinksData.put(longUrl, shortURL.toString());
            tinyLinksData.put(shortURL.toString(), longUrl);
        }
        return originalLinksData.get(longUrl);
    }

    //a shortened URL to its original URL
    public String decode(String shortUrl) {
        return tinyLinksData.getOrDefault(shortUrl, "there is nothing found");
    }
}
