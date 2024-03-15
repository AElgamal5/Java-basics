
public class Main {

    public static void main(String[] args) {
        /*
         * Object: instance of a class that have attributes and methods
         */

        Car myCar = new Car();

        // read attributes
        System.out.println(myCar.make);
        System.out.println(myCar.year);
        System.out.println(myCar.color);

        // use methods
        myCar.drive();
        myCar.brake();

        // update attributes
        myCar.year = 2024;
        System.out.println(myCar.year);
    }

}

class Car {
    // attributes
    String make = "Dodge";
    int year = 2023;
    String color = "Black";
    double price = 12345.678;

    // methods
    void drive() {
        System.out.println("Drive the car");
    }

    void brake() {
        System.out.println("Brake the car");
    }
}