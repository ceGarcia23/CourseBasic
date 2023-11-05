import javax.swing.*;
import java.util.Scanner;

public class Conditionals2 {
    public static void main(String[] args) {
        // Areas
        Scanner entrada = new Scanner(System.in);

        System.out.println("Eligue la opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
         int figura = entrada.nextInt();

         switch (figura){

             case 1:
                 int lado = Integer.parseInt(JOptionPane.showInputDialog("introduce el lado: "));
                 System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
                 break;

             case 2:
                 int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
                 int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
                 System.out.println("El area del rectangulo es: " + base*altura);
                 break;

             case 3:

                 base = Integer.parseInt(JOptionPane.showInputDialog("base"));
                 altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
                 int baseTriantulo = (base*altura/2);
                 System.out.println("El area del tringulo es: " + baseTriantulo);

             case 4:

                 int radio = Integer.parseInt(JOptionPane.showInputDialog("Introdce el radio"));
                 System.out.println("El área del cirtuclo es: ");

                 System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));

                 break;

             default:
                 System.out.println("la opcion es incorrecta");


         }
    }
}
