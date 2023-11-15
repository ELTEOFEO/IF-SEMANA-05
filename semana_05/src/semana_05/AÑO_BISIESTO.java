package semana_05;
import java.util.Scanner;
public class AÑO_BISIESTO {
    public static void main(String[] args) {
        double año;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su ano");
        año = teclado.nextDouble();
        if ((año % 400)==0)
            System.out.println("su ano es bisiesto");
        else 
            System.out.println("su ano no es bisiesto");
    }

}
