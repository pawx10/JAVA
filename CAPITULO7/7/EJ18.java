public class EJ18 {
    public static void main(String[] args) {
        int [] array=new int [10];
        int[] menores = new int[10];
        int[] mayores = new int[10];
        int cuentaMenores = 0;
        int cuentaMayores = 0;
        
        /*da valor array */
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*201);
        /*da valor */
        if (array[i] <= 100) {
            menores[cuentaMenores++] = array[i];
          } else {
            mayores[cuentaMayores++] = array[i];
          }
        }
      
      
      
        /*Crea indice */
        System.out.print(" Indice |");
        for(int i=0;i<10;i++){
            
            System.out.print((i)+"\t");
        }
       
       
       
        /*muestra tabla original */
        System.out.println();
        System.out.print(" Valor  |");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        /*muestra el resultado */
        int[] resultado = new int[10];
        int menoresColocados = 0;
        int mayoresColocados = 0;
        
        int j = 0;
        do {
          
          if (menoresColocados < cuentaMenores) {
            resultado[j++] = menores[menoresColocados++];
          }
          
          if (mayoresColocados < cuentaMayores) {
            resultado[j++] = mayores[mayoresColocados++];
          }
          
        } while (j < 10);
        System.out.println();
        System.out.println(" Resultado ");
        System.out.println();
        System.out.print("Indice  |");
        for(int i=0;i<10;i++){
            System.out.print (i+"\t");
        }
        System.out.println();
        System.out.print("Valor   |");
        for (int i = 0; i < 10; i++) {
            System.out.print( resultado[i]+"\t");
          }

    }

    
}
