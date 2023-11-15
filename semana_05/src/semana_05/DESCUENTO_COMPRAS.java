package semana_05;
import java.util.Scanner;
public class DESCUENTO_COMPRAS {
    public static void main(String[] args) {
        double precio,desc, precioF;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite el precio del producto, para verificar si entra en un descuento");
        precio = teclado.nextDouble();
        if (precio>100){
            desc = (precio*(0.1));
            precioF = precio-desc;
            System.out.println("usted tiene un descuento del 10%, se le descontara: "+desc);
            System.out.println("su precio final es de: "+precioF);
        }else
            System.out.println("no aplica para el descuento, su precio se mantiene: "+precio);      
    }         
}
