import  java.util.Scanner;
public class EJ7 {
    public static void main(String[] args) {
     Scanner s =new Scanner (System.in);
     System.out.println("Introduce el ancho y el alto del rectangulo");
     System.out.println("Ancho= ");
     double ancho=s.nextDouble();
     System.out.println("Alto= ");
     double alto=s.nextDouble(); 

     double area=(misFunciones.Varias.areaRectangulo(ancho, alto));
     System.out.println(" El area del rectangulo es= " +area);

     double perimetro=(misFunciones.Varias.perimetroRectangulo(ancho, alto));
     System.out.println(" El perimetro del rectangulo es= " +perimetro);
    }
}
