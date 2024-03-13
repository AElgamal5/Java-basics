import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i >= 1; i--) {
            System.out.println("\t" + i);
            TimeUnit.SECONDS.sleep(1); // Delay for 1 second
        }
        System.out.println("Happy new year");
    }
}
