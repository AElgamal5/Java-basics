import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car1 = new Car("BMW", 2023);
        Car car2 = new Car("Dodge", 2018);

        garage.park(car1);
        garage.park(car2);

        System.out.println(garage);

    }

}

class Car {
    static int id = 0;
    String model;
    int year;
    int num;

    Car(String model, int year) {
        id++;
        this.model = model;
        this.year = year;
        this.num = id;
    }

    // override the default method
    @Override
    public String toString() {
        return "{\nmodel: " + model + "\nyear: " + year + "\nID: " + this.num + "}";
    }
}

class Garage {

    // Car[] cars = new Car[];
    ArrayList<Car> cars = new ArrayList<Car>();

    void park(Car car) {
        this.cars.add(car);
        System.out.println(car.model + " is Parked");
    }

    @Override
    public String toString() {
        return cars.toString();
    }
}
