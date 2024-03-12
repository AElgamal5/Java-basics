import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));

        JOptionPane.showMessageDialog(null, "HI " + name + "\n your age is " + age);
    }
}
