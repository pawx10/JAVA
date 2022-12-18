import java.util.Scanner;
public class EJ39 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
    int numeroIntroducido;
    System.out.print("Por favor, introduzca un número entero positivo: ");
    numeroIntroducido = s.nextInt();
    for (int n = 1; n <= numeroIntroducido; n++) {
    int factorial = n;
    for (int i = 1; i < n; i++) {
        factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
        }
        }
        }