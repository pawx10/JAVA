package primerosej;

public class Ejemplo4 {
    public static void main(String[] args) {
        System.out.println("15 números aleatorios entre 15 y 25 (sin decimales):");
        for (int i = 1; i <= 20; i++) {
        System.out.print(((int)(Math.random()*11) + 50 ) + " ");
        }
        System.out.println();
        
    }
    
}
