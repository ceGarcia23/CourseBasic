

public class StringManipulation2 {

    public static void main(String[] args) {

        String alumn1, alumn2;

        alumn1 = "David";
        alumn2 = "Carlos";

        System.out.println(alumn1.equals(alumn2));
        System.out.println(alumn1.equalsIgnoreCase(alumn2));

        String a = "Hello";
        String b = "helo";

        if (a.equalsIgnoreCase(b)) {
            System.out.println("Las cadenas sin iguales sin importar mayusculas");
        } else {
            System.out.println("Las cadenas son diferentes");
        }

    }
}
