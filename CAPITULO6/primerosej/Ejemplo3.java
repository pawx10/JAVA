package primerosej;

public class Ejemplo3 {
    public static void main(String[] args) {
        System.out.println("15 números aleatorios entre 0 y 15 (sin decimales):");
for (int i = 1; i <= 20; i++) {
System.out.print((int)(Math.random()*10) + " ");
}
System.out.println();
    }
    
}
