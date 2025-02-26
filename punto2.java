public class ExpresionesLogicas {
    public static void main(String[] args) {
    
        int a = 4, b = 5, C = 1;

    
        boolean x = (b <= 100) && (a > 5);
        boolean y = (b == 5) || (C == 30) && !(a == 10);
        boolean z = ((b + 20) > (C - 1)) || ((a + 5) <= 50);

        
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        System.out.println("Valor de z: " + z);
    }
}
