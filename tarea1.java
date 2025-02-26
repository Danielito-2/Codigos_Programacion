import java.util.Scanner;

public class CalculadoraExpresiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        double p = 6, q = 8, r = 4, s = 2.5, t = 3.0, u = 6.0, v = 2.0;

        
        double resultado1 = p * q / 2 + 1;
        double resultado2 = r / Math.pow(s, 2);
        double resultado3 = (u / t) + q * v * (r - q) / p;

  
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);

        scanner.close();
    }
}
