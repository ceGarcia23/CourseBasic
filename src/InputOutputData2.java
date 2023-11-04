import javax.swing.*;

public class InputOutputData2 {
    public static void main(String[] args) {

        String nameUser = JOptionPane.showInputDialog("Introduce el nombre");

        String age = JOptionPane.showInputDialog("introduce la edad");

        int userAge = Integer.parseInt(age);

        userAge++;

        System.out.println("Hola " + nameUser + " Tiene " + userAge+ " años");
    }
}
