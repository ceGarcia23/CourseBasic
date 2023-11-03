public class StringManipulation {

    public static void main(String[] args) {

        String name = "Juan";

        System.out.println("My name is: " + name);

        System.out.println("My name is: " + name.length() + " letras. ");

        System.out.println("La primer letra de mi nombre es: " + name.charAt(2));

        int ultimaLetra;

        ultimaLetra = name.length();

        System.out.println("La ultima letra es: " + name.charAt(ultimaLetra-1));

    }
}
