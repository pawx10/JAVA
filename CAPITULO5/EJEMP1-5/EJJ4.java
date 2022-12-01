/**
 * 
 * @author
 * 
 * Programa que calcule y muestre por pantalla, independientemente la suma de los números pares 
 * y la suma de impares de los números comprendidos entre 100 y 200.
 */
public class EJJ4 {
    public static void main(String[]args){
        int par;
        par=0;
        int imp;
        imp=0;
        System.out.println("La suma de los pares es: ");
         for (int i=100;i<=200;i++){
            if (i %2==0){
                par=par+i; 
                System.out.println("    "+par);
            }
         
        
          }
         
         
          System.out.println("La suma de los impares es: ");
         for (int i=1;i<10;i++){
            if (i %2 !=0){
              imp=imp*i;  
               System.out.println("    "   +imp);
            }
         
        
     }
    
 }
     
 }
     


    