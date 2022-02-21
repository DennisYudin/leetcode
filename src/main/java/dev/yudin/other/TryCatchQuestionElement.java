package dev.yudin.other;

public class TryCatchQuestionElement {

    public static void main(String[] args) {
        foo();
    }

    public static void foo() {
        try {
            foo();
        } finally {
            foo();
        }
    }
}
