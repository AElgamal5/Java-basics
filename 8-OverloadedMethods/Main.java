
public class Main {

    public static void main(String[] args) {
        /*
         * Overloaded methods
         * - methods have the same name but has different params
         * - method name + method params = method signature
         */

        System.out.println(add(3, 5));
        System.out.println(add(3.5, 5, 4));
    }

    static int add(int a, int b) {
        System.out.println("Method: 1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Method: 2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Method: 3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("Method: 4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("Method: 5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("Method: 6");
        return a + b + c + d;
    }
}
