package semana_05;
import java.util.Scanner;
public class costo_pedido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cant, precN, preT, desc, preTD;
        System.out.println("ingrese la cantidad de articulos que comprara: ");
         cant = teclado.nextDouble();
         System.out.println("ingrese el precio unitario del producto");
          precN = teclado.nextDouble();
          preT = precN * cant;
          if (cant>50){
              desc = (preT * 0.15);
              preTD = preT-desc;
              System.out.println("tiene un descuento del 15% lo que equivale a: "+desc);
              System.out.println("su total a pagar es de: "+preTD);
          }else
             System.out.println("su total a pagar es de: "+preT);         
    }
}
