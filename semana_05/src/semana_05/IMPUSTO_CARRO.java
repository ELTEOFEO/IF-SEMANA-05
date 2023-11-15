
package semana_05;
import java.util.Scanner;
public class IMPUSTO_CARRO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dat1, dat2;
        double costo, resp;
        System.out.println("Coloque los datos de su automovil:");
        System.out.println("-Ingresa la marca de su atomovil");
        dat1 = teclado.nextLine();
        System.out.println("-Ingresa el pais de origen de su automovil");
        dat2 = teclado.nextLine();
        System.out.println("-Ingresa el costo de su aoutomovil");
        costo = teclado.nextDouble();
        if (dat2.equals("Alemania")){
            resp = costo * 0.2;
            costo = costo + resp;
            System.out.println("Impuesto " + dat1 + ": " + resp);
            System.out.println("TOTAL: " + costo);
        }    
        else { 
            if (dat2.equals("Japon")){
                resp = costo * 0.3;
                costo = costo + resp;
                System.out.println("Impuesto " + dat1 + ": " + resp);
                System.out.println("TOTAL: " + costo);
            }
            else {
                if (dat2.equals("Italia")){
                    resp = costo * 0.15;
                    costo = costo + resp;
                    System.out.println("Impuesto " + dat1 + ": " + resp);
                    System.out.println("TOTAL: " + costo);
                }    
                else {
                    if (dat2.equals("USA")){
                        resp = costo * 0.08;
                        costo = costo + resp;
                        System.out.println("Impuesto " + dat1 + ": " + resp);
                        System.out.println("TOTAL: " + costo);
                    }    
                }
            }
        }
    }   
}

