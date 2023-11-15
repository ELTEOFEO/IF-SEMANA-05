package semana_05;
import java.util.Scanner;
public class PLANILLA_LUZ {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         double kilohora, consumoM, edad, totalP, totalD;
        System.out.println("ingrese su consumo de este mes:");
          consumoM = teclado.nextDouble();
        System.out.println("ingrese el precio kilobaltio/hora: ");
          kilohora = teclado.nextDouble();
        System.out.println("ingrese su edad: ");
          edad = teclado.nextDouble();
            totalP = consumoM*kilohora;
            totalD = totalP*0.1;
            if (edad>65)
                System.out.println("total a pagar: "+totalD);
            else
                System.out.println("total a pagar: "+totalP);           
    }
    
}
