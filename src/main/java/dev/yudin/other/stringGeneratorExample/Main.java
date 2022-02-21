package dev.yudin.other.stringGeneratorExample;

public class Main {

    public static void main(String[] args) {

        GeneratorTest test = new GeneratorTest();

        StringGenerator generator = new StringGeneratorImpl();

        String result = test.getResult(generator);
        System.out.println(result);

        String result2 = test.getResult(new StringGenerator() {
            @Override
            public String generate() {
                return "result2";
            }
        });
        System.out.println(result2);

        String result3 = test.getResult(() -> "hey result3");
        System.out.println(result3);

        String result4 = test.getResult(generator::generate);
        System.out.println(result4);
    }
}
