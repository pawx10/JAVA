/**
 * 
 * @author
 *  Programa que calcule y muestre por pantalla, la suma y el producto de los 10 primeros números naturales.
 */
public class EJJ3 {
    public static void main(String[]args){
       int suma;
       suma=0;
       int producto;
       producto=1;
       System.out.println("La suma es: ");
        for (int i=0;i<=10;i++){
        suma=suma+i;
        System.out.println("    "+suma);
         }
        
        
         System.out.println("El producto es: ");
        for (int i=1;i<10;i++){
        producto=producto*i;
        System.out.println("    "   +producto);
    }
   
}
    
}
