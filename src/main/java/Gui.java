import javax.swing.*;

public class Gui {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null, "Hello " + name + "\n" + "You are " + age + "years old");
        JOptionPane.showConfirmDialog(null, "are you sure", "Click yes or no ", JOptionPane.YES_NO_CANCEL_OPTION);
    }
}
