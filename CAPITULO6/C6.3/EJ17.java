import java.util.Scanner;
public class EJ17 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alto = s.nextInt();
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int ancho = s.nextInt();
    int posicion = 0;
    int posicionPez = (int)(Math.random()*(alto - 2)*(ancho - 2));
    // Pinta la parte superior /////////////////////////////////////////////////
    for(int i = 0; i < ancho; i++) {
    System.out.print("*");
    }
    System.out.println();
    // Pinta la parte central //////////////////////////////////////////////////
    for(int i = 2; i < alto; i++) {
    System.out.print("*"); // parte izquierda de la pecera
    for(int j = 2; j < ancho; j++) {
    if (posicion == posicionPez) {
    System.out.print("&");
    } else {
        System.out.print(" ");
    }
    posicion++;
    } // for j
    System.out.println("*"); // parte derecha de la pecera
    } // for i
    // Pinta la parte inferior /////////////////////////////////////////////////
    for(int i = 0; i < ancho; i++) {
    System.out.print("*");
    s.close();
    }
    }
    }
        