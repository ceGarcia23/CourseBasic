import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce la edad");
        int edad = entrada.nextInt();

        if (edad>=18){
            System.out.println("Edad correcta");
        }
        else{
            System.out.println("Es mejor de edad");
        }
    }
}
