import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Random int: " + random.nextInt());
        System.out.println("Random boolean: " + random.nextBoolean());
        System.out.println("Random double: " + random.nextDouble()); // 0 -> 1
        System.out.println("Random int from 1 to 6: " + (random.nextInt(6) + 1));
    }
}
