package semana_05;
import java.util.Scanner;
public class hosteria_loja {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numD, precD;
        double desc, total, totalD;
        System.out.println("ingrese los dias que desea hospedarse: ");
        numD = teclado.nextInt();
        System.out.println("ingrese la tarifa del hospedaje por dia: ");
        precD = teclado.nextInt();
        total = numD * precD;
        if (numD > 15) {
            desc = (total * 0.2);
            totalD = total - desc;
            System.out.println("subtotal a pagar: " + total);
            System.out.println("recive un descuento del 20%: " + desc);
            System.out.println("total a pagar: " + totalD);
        } else {
            if (numD > 10) {
                desc = (total * 0.15);
                totalD = total - desc;
                System.out.println("subtotal a pagar: " + total);
                System.out.println("recive un descuento del 15%: " + desc);
                System.out.println("total a pagar: " + totalD);
            } else {
                if (numD > 5) {
                    desc = (total * 0.1);
                    totalD = total - desc;
                    System.out.println("subtotal a pagar: " + total);
                    System.out.println("recive un descuento del 10%: " + desc);
                    System.out.println("total a pagar: " + totalD);
                } else {
                    System.out.println("total a pagar: " + total);
                }
            }
        }
    }
}
