package semana_05;
import java.util.Scanner;
public class DIA_DE_LA_SEMAN {
    public static void main(String[] args) {
        int dia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero de su dia");
        dia = teclado.nextInt();
        if (dia==1)
            System.out.println("es lunes");
        else
            if (dia==2)
                System.out.println("es martes");
            else
                if (dia==3)
                    System.out.println("es miercoles");
                else 
                    if(dia==4)
                        System.out.println("es jueves");
                    else 
                        if (dia==5)
                            System.out.println("es viernes");
                        else 
                            if (dia==6)
                                System.out.println("es sabado");
                            else 
                                if (dia==7)
                                    System.out.println("es domingo");
                                else 
                                    System.out.println("ingrese un numero dentro 1...7, por favor");
                    
    }
    
}
