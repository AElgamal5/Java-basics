
public class Main {

    public static void main(String[] args) {
        /*
         * Constructor: special methods called when object is instantiated aka created
         * 
         * we use constructor when created any object although it didn't have one
         * 
         * constructor name is the name of a class
         * 
         * 'this' keyword is referring to current object
         * 
         * constructor like any method can be overloaded
         */

        Human h1 = new Human();
        Human h2 = new Human("Ahmed");
        Human h3 = new Human("Elgamal", 24);
        Human h4 = new Human(24);

        h1.card();
        h2.card();
        h3.card();
        h4.card();

    }

}

class Human {
    String name;
    int age;

    Human() {
        this.name = "Undefined";
        this.age = -1;
    }

    Human(String name) {
        this.name = name;
        this.age = -1;
    }

    Human(int age) {
        this.name = "Undefined";
        this.age = age;
    }

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void card() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + (this.age < 0 ? "Undefined" : this.age));
        System.out.println();
    }
}
