import java.util.Scanner;
public class EJ1 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String num="";
       int nNum=0;
       boolean numValido=false;
       int maximo=Integer.MIN_VALUE;

       System.out.println("Introduzca 6 numeros") ;
       for(int i=1;i<7;i++){
        System.out.println("Introduzca Numero "+i);
        
       
        do{
            try{
                
                num=s.nextLine();
                nNum=Integer.parseInt(num);
                numValido=true;
            }catch(Exception e){
                nNum=0;
                System.out.println("Introduzca un numero, por favor");
                numValido=false;

            

            }
        }while(!numValido);
        if (nNum>maximo){
            maximo=nNum;
        }
        }
       
        System.out.println("El numero maximo es : "+maximo);
    }
}

