
public class Main {

    public static void main(String[] args) {

        String name = "Ahmed";

        System.out.println(name.equals("Ahmed"));
        System.out.println(name.equalsIgnoreCase("aHMED"));
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('m'));
        System.out.println(name.indexOf('z'));
        System.out.println(name.isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("   123   ".trim());
        System.out.println(name.replace('e', 'a'));
        System.out.println(name.repeat(3));
        System.out.println(name.startsWith("Ah"));
        System.out.println(name.endsWith("ed"));

    }
}
