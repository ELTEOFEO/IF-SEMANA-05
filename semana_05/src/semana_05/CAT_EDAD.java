package semana_05;
import java.util.Scanner;
public class CAT_EDAD {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("ingrese su edad");
        edad = teclado.nextInt();
       if (edad>=65)
            System.out.println("adulto");
       else 
           if (edad>=18) 
           System.out.println("adolecente");
           else 
               System.out.println("niño");                  
    }
}
