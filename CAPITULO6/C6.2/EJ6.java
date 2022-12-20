/**
 * Escribe un programa que piense un número al azar entre 0 y 100.
 *  El usuario debe adivinarlo y tiene para ello 5 oportunidades.
 *  Después de cada intento fallido,el programa dirá cuántas oportunidades quedan 
 * y si el número introducido es menor o mayor que el número secreto.
@author Pablo Arroyo
 */
    import java.util.Scanner;
    public class EJ6{
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
         int opor=5; // numero oportunidades, es 5 para que vaya restando y poder mostrar las oportunidades que quedan
         int num;// numero generado
         int numint;// numero introducido
         boolean acertado=false;
         num=(int)(Math.random()*101);  // crea num
           
         while(opor>=1 && !acertado){//numero oportunidades
            System.out.print("\nIntroduce el numero:  ");
            numint=s.nextInt(); // se guarda el numero
            
            if(numint>num){
                System.out.print(" \nEl numero es menor,");
                opor--; //resta oportunidades
                System.out.print(" te quedan "+opor+" oportunidades\n");
            }
            if (numint<num){
                System.out.print("\nEl numero es mayor,");
                opor--;
                System.out.print(" te quedan "+opor+" oportunidades\n");
            }
            if(numint==num){
                acertado=true;
                System.out.println(" Has acertado");
    
            }
           
       
             
           
            
             
            }
            if (opor==0 && !acertado) { //fuera del while y con el boolean en falso
                System.out.println("\nNo has acertado " );
                System.out.println("El numero era "+num);
         }
           s.close();
        }
    }