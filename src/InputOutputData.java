import java.util.Scanner;

public class InputOutputData {
    public static void main(String[] args) {


        Scanner entrance = new Scanner(System.in);

        System.out.println("Escriba su nombre:");

        String  nombre_usuario = entrance.nextLine();

        System.out.println("Escriba la edad");

        int age = entrance.nextInt();

        System.out.println("Su nombre es: " + nombre_usuario + " El año es: " + age);
    }
}
