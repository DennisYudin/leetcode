package dev.yudin.other.recusionExample;

public class RecursionExample {
    public static int depth = 0;

    public static void main(String[] args) {

        function(1);
    }

    public static void function(int x) {
        in(x);
        if (check(x)){
            function(2 * x);
        }
        out(x);
    }

    public static boolean check(int x) {
        spaces();
        System.out.println("(" + x + " < 15): " + (x < 15));
        return x < 15;
    }

    public static void in(int x) {
        spaces();
        System.out.println("(" + x + ")->");
        depth++;
    }

    public static void out(int x) {
        depth--;
        spaces();
        System.out.println("<-(" + x + ")");
    }

    public static void spaces() {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    }
}
