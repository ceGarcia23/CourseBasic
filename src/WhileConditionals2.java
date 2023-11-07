import java.util.Scanner;

public class WhileConditionals2 {
    public static void main(String[] args) {

        int aletoreo = (int)(Math.random()*100);

        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        int intentos = 0;

        while(numero!=aletoreo){
            intentos++;

            System.out.println("Introdoce un número, por consola");

            numero = entrada.nextInt();

            if(aletoreo<numero){

                System.out.println("Mas bajo");
            }

            else if(aletoreo>numero){
                System.out.println("Mas alto");
            }
        }

        System.out.println("Correcto " + " intentos: " + intentos);

    }
}
