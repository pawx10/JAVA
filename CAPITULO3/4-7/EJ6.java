/**
* area triangulo
*
* @author Pablo Arroyo
*/

public class EJ6 {
    public static void main(String[]args){
        String area;
        System.out.print("Escribe la base ");
       area=System.console().readLine();
        int base;
        base= Integer.parseInt(area);
        System.out.print("Escribe la altura ");
        area=System.console().readLine();
        int altura;
        altura= Integer.parseInt(area);
        System.out.print("El area es: "+((base*altura)*2));
        

}
}
