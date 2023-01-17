/**
 * @author Pablo Arroyo
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
 */

public class EJ11 {
    public static void main(String[] args) {
        int notas=0;
        int cont=0;
        int suspenso=0;
        int sufi=0;
        int bien=0;
        int notable=0;
        int sobre=0;
        while(cont<20){
            cont++;
           notas=((int)(Math.random()*11)); //crea nota
           
        
        switch (notas) {
            case 0,1,2,3,4: //suspensos
            System.out.println(" "+notas+ " suspenso");
            suspenso++;
            break;
           
            case 5: //sufi
            System.out.println(" "+notas+ " suficiente");
            sufi++;
            break;
            case 6: //bien
            System.out.println(" "+notas+ " bien");
            bien++;
            break;
            case 7,8: //notables
            System.out.println(" "+notas+ " notable");
            notable++;
            break;
            
            case 9,10: //sobresalientes
            System.out.println(" "+notas+ " sobresaliente");
            sobre++;
            break;
            
        
            default:
                break;
        }
        
        }
        System.out.println(" \n Se han suspendido "+suspenso+ " examenes");
        System.out.println(" Se han sacado "+sufi+ " suficientes");
        System.out.println(" Se han sacado "+bien+ " bien");
        System.out.println(" Se han sacado "+notable+ " notables");
        System.out.println(" Se han sacado "+sobre+ " sobresalientes");
    }
    
}
