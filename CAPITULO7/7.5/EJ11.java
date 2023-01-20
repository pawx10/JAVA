/*Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 200 y 300. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.
 */
public class EJ11 {
    public static void main(String[] args) {
        int [][] tabla=new int [10][10];
        int filas=10;
        int columnas=10;

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                tabla[i][j]=(int)((Math.random()*101)+200);
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
for (int i = 0; i < 10; i++) {
    int num = tabla[i][i];
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


    