/**
* area rectangulo
*
* @author Pablo Arroyo
*/

public class EJ5 {
    public static void main(String[] args) {
        String area;
        System.out.print("Introduce la base:  ");
        area=  System.console().readLine();
        int base;
        base = Integer.parseInt(area);
        System.out.print("Introduce la altura: ");
        area=System.console().readLine();
        int altura;
        altura= Integer.parseInt(area);
        System.out.println("El area es: "+(base*altura));

        
    }
}
