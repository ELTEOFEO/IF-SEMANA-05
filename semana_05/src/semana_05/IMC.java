
package semana_05;
import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         double alt, pes, imc, alt2;
         System.out.println("ingrese su altura en ´m´");
         alt = teclado.nextDouble();
         System.out.println("ingrese su peso en ´Kg´");
         pes = teclado.nextDouble();
         alt2 = alt*alt;
         imc = (pes/alt2);         
         if (imc<16.9)
             System.out.println("bajo de peso");
         else 
             if (imc<24.9)
                 System.out.println("peso normal");
             else 
                 if (imc<=29.2)
                     System.out.println("sobre peso");
                 else 
                     if (imc>29.2)
                         System.out.println("obesidad");
    }
}
