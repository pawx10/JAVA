import java.util.Scanner;
public class piedrapapel {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.print(" J1 ");
        String J1=s.nextLine();
        System.out.print(" J2 ");
        String J2=s.nextLine();
        if (J1.equals(J2)) {
            System.out.println("Empate");
            } else {
            int ganador = 2;
            switch(J1) {
            case "piedra":
            if (J2.equals("tijera")) {
            ganador = 1;
            }
            break;
            case "papel":
            if (J2.equals("piedra")) {
            ganador = 1;
            }
            break;
            case "tijera":
            if (J2.equals("papel")) {
            ganador = 1;
            }
            break;
            default:
        }
        System.out.println("Gana el jugador " + ganador);
        }
        }
        }            