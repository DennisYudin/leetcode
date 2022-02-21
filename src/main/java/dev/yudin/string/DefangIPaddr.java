package dev.yudin.string;

public class DefangIPaddr {

    public static void main(String[] args) {

        String input = "1.1.1.1";
        System.out.println(defangIPaddr(input));
    }

    public static String defangIPaddr(String address) {

        StringBuilder result = new StringBuilder();

        String[] symbols = address.split("");

        for (String symbol : symbols) {
            if (symbol.equals(".")) {
                String defangedSymbol = "[" + symbol + "]";
                result.append(defangedSymbol);
            } else {
                result.append(symbol);
            }
        }
        return result.toString();
    }
}
