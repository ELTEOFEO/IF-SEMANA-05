package semana_05;
import java.util.Scanner;
public class notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        System.out.println("ingrese su nota");
        nota = teclado.nextInt();
        if (nota>=90)
            System.out.println("A");
        else 
            if (nota>=80)
                System.out.println("B");
            else 
                if (nota>=70)
                    System.out.println("C");
                else 
                    System.out.println("D");
    }
}
