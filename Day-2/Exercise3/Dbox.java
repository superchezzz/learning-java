import javax.swing.JOptionPane;

public class Dbox{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Welcome to\nJava Programming 2");
        String name= JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello "+ name + "! Welcome to this mini program!", "Welcome", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}