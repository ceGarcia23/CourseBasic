import javax.swing.*;

public class IdealWeight {
    public static void main(String[] args) {

        String genero = "";

        do {
            genero = JOptionPane.showInputDialog("Introduce el Genero: Hombre o Mujer");

        } while (genero.equalsIgnoreCase("Hombre") == false && genero.equalsIgnoreCase("Mujer") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));

        int IdealPeso = 0;

        if (genero.equalsIgnoreCase("Hombre")){
            IdealPeso = altura-110;
        } else if (genero.equalsIgnoreCase("Mujer")) {
            IdealPeso = altura-120;
        }

        System.out.println("Tu peso ideal es: " + IdealPeso);
    }
}
