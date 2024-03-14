
public class Main {

    public static void main(String[] args) {
        /*
         * printf: an optional method to control, format and display text rto console
         * has two args:
         * 1- string format
         * 2- data want to display (optional)
         * 
         * Format : %[Flags][Precision][Width][Character conversion]
         * 
         * Character conversion:
         * %d => decimal numbers
         * %f => double or float numbers
         * %b => boolean
         * %c => character
         * %s => string
         * 
         * Width:
         * %10s => 10 chars for printing string if less add spaces
         * 
         * Precision
         * %.2f => show two digits after the floating-point
         * 
         * Flags:
         * %-10s => the same but '-' make it left justify and spaces is after the string
         * %010d => min 10 digits for decimal and padded with zeros
         * %+d => adding '+' sign to the number if it number > 0
         * %,d => adding ',' after 3 digits
         */

        System.out.printf("hi from printf \n");

        // Decimal num
        System.out.printf("This is my decimal number %d\n", 5320);

        // double
        System.out.printf("This is my double %f\n", 53.20);

        // boolean
        System.out.printf("This boolean value %b\n", true);

        // char
        System.out.printf("This is my char %c\n", '!');

        // string
        System.out.printf("This is my string %s\n", "LOL");

        // string with min width 5
        System.out.printf("%5s\n", "LOL");
        System.out.printf("%5s\n", "LOL LOL");
        // left justify
        System.out.printf("%-5s FOL\n", "LOL");

        // show 2 digits after floating point
        System.out.printf("%.2f \n", 53.202325);

        // min 10 digits for decimal and padded with zeros
        System.out.printf("value %010d\n", 12345);

        // adding '+' to a number
        System.out.printf("%+d\n", 123);
        System.out.printf("%+f\n", 123.456);
        // adding '+' to a negative number
        System.out.printf("%+d\n", -123); // does not effect

        // adding ',' after each 3 digits
        System.out.printf("%,d\n", 123456798);
        System.out.printf("%,f\n", 123456798.321654);

    }

}
