/**
 *
 * @author Pablo Arroyo
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres.
 */

public class EJ10 {
    public static void main(String[] args) {
        int linea=0;
        int longlin;
        String relleno="  ";

        while(linea<10){linea++;
        longlin= (int)(Math.random() * 40) + 1;
        int caracteres=(int)(Math.random()*6);
        
        switch (caracteres) {
                case 0:
                 relleno=" * ";
                
                break;
                case 1:
                relleno=" - ";
                    
                break;
                case 2:
                relleno=" = ";
                    
                break;
                case 3:
                relleno=" . ";
                    
                break;
                case 4:
                relleno=" | ";
                case 5:
                relleno=" @ ";
                
                break;
                
                    
                
            
                
        
            default:
                break;
                
        }
        for(int l = 1; l <= longlin; l++) {
            System.out.print(relleno);
          }
          System.out.println();
     }

    }
    
}
