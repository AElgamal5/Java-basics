public class Main {
    public static void main(String[] args) {
        double x = 3.14;
        double y = 2.71;

        System.out.println("The max is: " + Math.max(x, y));
        System.out.println("The min is: " + Math.min(x, y));
        System.out.println("The absolute value of '-5.3': " + Math.abs(-5.3));
        System.out.println("The square root of 9 is: " + Math.sqrt(9));
        System.out.println("The closest int to 3.14 is: " + Math.round(x));
        System.out.println("The next int number to 3.14 is: " + Math.ceil(x));
        System.out.println("The down next int number to 2.71 is: " + Math.floor(y));
    }
}
