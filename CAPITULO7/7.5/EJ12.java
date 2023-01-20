public class EJ12 {
    public static void main(String[] args) {
        int [][] tabla=new int [10][10];
        int filas=10;
        int columnas=10;

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                tabla[i][j]=(int)((Math.random()*501)+900);
            }
        }
      
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
               System.out.print(tabla[i][j]+"\t"); 

    }
    System.out.println();
}
    System.out.println();
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;
int sum = 0;
for (int i = 9; i >= 0; i--) {
    int num = tabla[i][9-i];
    System.out.print(num + " ");
    min = Math.min(min, num);
    max = Math.max(max, num);
    sum += num;
}
System.out.println();

// Muestra el máximo, el mínimo y la media de los números de la diagonal principal
System.out.println("Máximo: " + max);
System.out.println("Mínimo: " + min);
System.out.println("Media: " + (double)sum / 10);
}
}