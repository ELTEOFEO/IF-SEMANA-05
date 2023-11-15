package semana_05;
import java.util.Scanner;
public class MAYOR_3_NUMEROS {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        num1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = teclado.nextInt();
        System.out.println("ingrese el tercer numero");
        num3 = teclado.nextInt();
        if (num1 > num2) 
            if (num1 > num3) 
                System.out.println("el mayor es: " + num1);
             else 
                if (num3 > num2) 
                System.out.println("el mayor es: " + num3);
             else 
                System.out.println("el mayor es: " + num2);
                else
                    if (num2 > num3) 
            System.out.println("el mayor es: " + num2);
                    else 
                        if (num2 > num1) 
            System.out.println("el mayor es: " + num1);
                        else 
            System.out.println("el mayor es: " + num3);        
    }

}
