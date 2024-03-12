import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // to fix problem reading new line after nextInt()
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        scanner.nextLine(); // to fix problem reading new line after nextDouble()
        System.out.print("Enter your gender m or f: ");
        char gender = (scanner.nextLine()).charAt(0);

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
        System.out.println("Your gender is: " + gender);

        scanner.close();
    }
}
