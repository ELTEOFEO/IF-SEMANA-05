package semana_05;
import java.util.Scanner;
import java.util.Arrays;
public class orden_3_num {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, numert;
        System.out.println("ingrese el primer numero");
        num1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = teclado.nextInt();
        System.out.println("ingrese el tercer numero");
        num3 = teclado.nextInt();
        int[] numeros = {num1, num2, num3}; // Tus números aquí
        Arrays.sort(numeros);
        System.out.println("numeros ordenados: " + Arrays.toString(numeros));
    }

}
