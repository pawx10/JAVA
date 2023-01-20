import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
      int filas=4;
      int columnas=5;
        //Declarando el array de 4 filas y 5 columnas
        int[][] numeros = new int[4][5];
        //Declarando las variables para las sumas parciales
        int[] sumaFila = new int[4];
        int[] sumaColumna = new int[5];
        int sumaTotal = 0;
        //Creando un objeto Scanner para pedir los números al usuario
        Scanner scan = new Scanner(System.in);
        //Recorriendo el array para pedir números al usuario
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.println("Introduce un número:");
                numeros[i][j]=scan.nextInt();
            }
        }
        //Recorriendo el array para calcular las sumas parciales
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                sumaFila[i]+=numeros[i][j];
                sumaColumna[j]+=numeros[i][j];
            }
        }
        //Mostrando las sumas parciales
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(numeros[i][j]+"\t");
                sumaTotal+=numeros[i][j];
            }
            System.out.println("|"+sumaFila[i]);
        }
        for(int j=0;j<5;j++){
            System.out.print("--------");
        }
        System.out.println("\n"+sumaColumna[0]+"\t"+sumaColumna[1]+"\t"+sumaColumna[2]+"\t"+sumaColumna[3]+"\t"+sumaColumna[4]+"\t|"+sumaTotal);
    }
}
