
import java.util.Scanner;
/**
 * 2. Crea la clase Vehiculo , así como las clases Bicicleta y Coche
 *    como subclases de la primera. Para la clase Vehiculo , crea los
 *    atributos de clase vehiculosCreados y kilometrosTotales , así como
 *    el atributo de instancia kilometrosRecorridos . Crea también algún
 *    método específico para cada una de las subclases. Prueba las
 *    clases creadas mediante un programa con un menú como el que se
 *    muestra a continuación:
 *    VEHÍCULOS
 *    =========
 *    1. Anda con la bicicleta
 *    2. Haz el caballito con la bicicleta
 *    3. Anda con el coche
 *    4. Quema rueda con el coche
 *    5. Ver kilometraje de la bicicleta
 *    6. Ver kilometraje del coche
 *    7. Ver kilometraje total
 *    8. Salir
 *    Elige una opción (1-8):
 * 
 * @author Luis José Sánchez
 */
public class Prueba_Vehiculos {

  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String opcion= " " ;
    int km;
    int opcionNum=0;
    Bicicleta bhSpeedrom = new Bicicleta(9);
    Coche C15 = new Coche(1900);
    
    while (opcionNum != 9) {
      System.out.println("\n1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Derrapa");
      System.out.println("9. Salir");
      System.out.println("Elige una opción (1-9): ");
      
      opcion = s.nextLine();
      if(Vehiculo.esNumerico(opcion)){
        opcionNum=Integer.parseInt(opcion);
        
      }else{
        opcionNum=0;
      }
      
      switch (opcionNum) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = s.nextInt();
          bhSpeedrom.recorre(km);
          break;
        case 2:
          bhSpeedrom.hazCaballito();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = s.nextInt();
          C15.recorre(km);
          break;
        case 4:
          C15.quemaRueda();
          break;
        case 5:
          System.out.print("La bicicleta lleva recorridos ");
          System.out.println(bhSpeedrom.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.print("El coche lleva recorridos ");
          System.out.println(C15.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.print("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
          break;
          case 8:
          C15.Derrapehevi();
        default:
        System.out.print("Opcion no valida ");
      } // switch
    } // while
  }
}