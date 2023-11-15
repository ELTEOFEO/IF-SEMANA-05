package semana_05;
import java.util.Scanner;
public class EDAD_PARA_VOTAR {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su edad.");
        edad = teclado.nextInt();
        if (edad>=18)
            System.out.println("usted puede votar");
        else
            System.out.println("usted no puede votar");
           }
    
}
