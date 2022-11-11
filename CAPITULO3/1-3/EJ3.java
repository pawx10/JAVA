/**PST A EUR
 * 
 * @author Pablo Arroyo
 */
public class EJ3 {
    public static void main(String[] args) {
      System.out.print("Por favor, introduzca la cantidad de euros que quiere convertir: ");
      double euros = Double.parseDouble(System.console().readLine());
  
      int pesetas = (int) (euros * 166.386);
      
      System.out.printf("%.2f euros son %d pesetas.", euros, pesetas);
    }
  }