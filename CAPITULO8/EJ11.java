import java.util.Scanner;
public class EJ11 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.print("Introduce un numero: "); 
       int a=s.nextInt();
       
       int tabla=(misFunciones.Varias.tablaMultiplicar(a));
       for(int i=1;i<10;i++){
        System.out.println(""+tabla+" * "+i);
       
       }
    }
}
