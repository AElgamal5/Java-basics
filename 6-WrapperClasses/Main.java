
public class Main {

    public static void main(String[] args) {
        // wrapper class => way to use primitive data types as reference data types
        // provide useful methods
        // reference data types is slower in accessing the data compare to primitive

        // primitive : wrapper
        // int : Integer
        // boolean : Boolean
        // char : Character
        // double : Double
        // ------- : String

        // autoboxing: automatic conversion form primitive to corresponding wrapper
        // autoboxing done automatic by java compiler
        // unboxing: reverse of 'autoboxing', we can use them as the primitive ones

        // autoboxing
        Boolean b = true;
        Character c = 'a';
        Integer i = 5320;
        Double d = 53.20;
        String s = "Ahmed";

        // unboxing
        if (b) {
            System.out.println("b is true");
        }

    }
}
