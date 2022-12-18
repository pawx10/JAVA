import java.util.Scanner;
public class EJ37 {
    public static void main (String[] args) {
        Scanner s=new Scanner (System.in);
    long num;
    do {
    System.out.print("Introduce un número entero positivo: ");
    num = s.nextLong();
    } while (num < 1);
    System.out.print(num + " = ");
    // Cuenta los números y calcula el reves
    long aux = num;
    long numDig = 0;
    long numReves = 0;
    while (aux > 0){
    numReves = ((numReves*10) + (aux % 10));
    aux /=10;
    numDig++;
    }
    long cifra = 0;
    // Separa las cifras y escribe los palitos
    for (long i = 0; i < numDig; i++){
    cifra = numReves%10;
    numReves /= 10;
    for (int j = 0; j < cifra; j++){
    System.out.print("|");
    }
    if (i < numDig-1){
    System.out.print("-");
    }
    }
    }
    }