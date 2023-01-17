/**
 * @author Pablo Arroyo
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
 */
 public class EJ16{
    public static void main(String[] args) {
        int cont=0;
        int figuras;
        int figura1=0;
        int figura2=0;
        int figura3=0;

        while (cont<3){cont++;
            figuras=(int)(Math.random()*5);
            switch (figuras) {
                case 0:
                    System.out.print(" corazon ");
                break;
                case 1:
                    System.out.print(" diamante ");
                break;
                case 2:
                    System.out.print(" herradura ");
                break;
                case 3:
                    System.out.print(" campana ");
                break;
                case 4:
                    System.out.print(" limon ");
                break;
            
                default:
                    break;
            }
            

        
        switch(cont) {
            case 0:
              figura1 = figuras;
              break;
            case 1:
              figura2 = figuras;
            break;
            case 2:
              figura3 = figuras;
            break;
            default:
          }
    }
    
        if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
          System.out.println("\nLo siento, ha perdido.");
        } else if ((figura1 == figura2) && (figura2 == figura3)) {
          System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
        } else {
          System.out.println("\nBien, ha recuperado su moneda.");
        }
    }
}
