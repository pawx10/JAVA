import java.util.Scanner;
public class EJ41 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = s.nextLong();
    long n = numeroIntroducido;
    int cuentaPares = 0;
    int cuentaImpares = 0;
    while (n > 0) {
    if ((n % 10) % 2 == 0) {
    cuentaPares++;
    } else {
    cuentaImpares++;
    }
    n /= 10;
    }
    System.out.print("El " + numeroIntroducido + " contiene " + cuentaPares + " dígitos pares y " + cuentaImpares + " dígitos impares.");
    }
    }