/**
 * @author Pablo Arroyo
 * Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.

 */
public class EJ15 {
    public static void main(String[] args) {

        int notas = 4 * (int)(Math.random() * 7 + 1);
        String nota = "";
        String primeraNota = "";
    
        for (int contN= 1; contN<= notas; contN++) {
          switch((int)(Math.random() * 7)) {
            case 0:
              nota = "do";
              break;
            case 1:
              nota = "re";
              break;
            case 2:
              nota = "mi";
              break;
            case 3:
              nota = "fa";
              break;
            case 4:
              nota = "sol";
              break;
            case 5:
              nota = "la";
              break;
            case 6:
              nota = "si";
              break;
            default:
          }
    
          if (contN== 1) {
            primeraNota = nota;
          }
    
          if (contN== notas) {
            nota = primeraNota;
          }
    
          System.out.print(nota + " ");
    
          if ( contN== notas ) {
            System.out.print("||");
          } else if ( contN% 4 == 0 ) {
            System.out.print("| ");
          }
          
        } // for
        

    }
    
}
