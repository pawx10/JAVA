public class EJ5 {
    public static void main(String[] args) {
        int filas=6;
        int columnas=10;
       
       
        int [][] tabla=new int [6][10];
        
        for(int c=0;c<columnas;c++){
           for(int f=0;f<filas;f++){
            tabla[f][c]=(int)((Math.random()*1000));
           } 
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxF=0;
        int maxC=0;
        int minF=0;
        int minC=0;
        for (int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[i].length;j++){
                if(tabla[i][j]>max){
                    max=tabla[i][j];
                    maxF=i;
                    maxC=j;
                }
                if(tabla[i][j]<min){
                    min=tabla[i][j];
                    minF=i;
                    minC=j;
                }
            }
        }



        for(int f=0;f<filas;f++){
            for(int c=0;c<columnas;c++){
             System.out.printf("%10d",tabla[f][c]);
            } 
            System.out.println();
         }
         System.out.println();
        
         System.out.println(" El numero mayor es "+max+" y se encuentra en la fila "+(maxF+1)+" columna "+(maxC+1));
         System.out.println();
         System.out.println(" El numero menor es "+min+" y se encuentra en la fila "+(minF+1)+" columna "+(minC+1));
    }
}