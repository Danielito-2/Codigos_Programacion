import java.util.Scanner;

public class ExpresionesMatematicas {
    public static void main(String[] args) {
       
        double a = 4, b = 7, C = 3, y = 3.5, x = 2.0, z = 5.0, w = 1.5;


        double resultado1 = (a * b) / 2 + 1;
        double resultado2 = C / Math.pow(y, 2);
        double resultado3 = (z / x) + b * w * ((C - b) / a);

       
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    }
}
