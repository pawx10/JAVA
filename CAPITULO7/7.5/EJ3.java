public class EJ3 {
    public static void main(String[] args) {
        int filas=4;
        int columnas=5;
        int [][] tabla=new int [4][5];
        
        int []sumafila=new int[4];
        int []sumacolum=new int[5];
        int sumatotal=0;
        for (int f=0;f<filas;f++){
            for (int c=0;c<columnas;c++){
                tabla[f][c]=(int)((Math.random()*899)+100);
            }
            
        }
        for(int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                sumafila[i]+=tabla[i][j];
                sumacolum[j]+=tabla[i][j];
            }
            
        }
         for(int i=0;i<filas;i++){/*mostrar tabla */
            for (int j=0;j<columnas;j++){
                System.out.print(tabla[i][j]+"\t");
                sumatotal+=sumacolum[j]+sumafila[i];
            }
           
            System.out.println(" | "+sumafila[i]);
          
        }
        for(int j=0;j<5;j++){
            System.out.print("--------");
        }
        System.out.println("\n"+sumacolum[0]+"\t"+sumacolum[1]+"\t"+sumacolum[2]+"\t"+sumacolum[3]+"\t"+sumacolum[4]+"\t |"+sumatotal);
       
    }
    
}
