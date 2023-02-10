package misFunciones;
import java.util.Scanner;

public class FuncionesArray{


   /*genera array donde se indica minimo y maximo */ 


    public static int[] generaArray(int n) {
        Scanner s=new Scanner (System.in);
        int[] array = new int[n];
        System.out.println(" Introduce el minimo y el maximo");
       int min=s.nextInt();
       int max=s.nextInt();
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * max+min);
        }
        return array;
    }
    /*saca el minimo del array anterior */
    public static int minimoArray(int[] array) {
        
        int min = array[0];/*asigna el valor minimo a la primera posicion del array */
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /*saca el maximo del array */
    public static int maximoArray(int[]array){

        int max=array[0];
        for (int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    /*saca la media */

    public static double mediaArray(int[]array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=+array[i];
        }
        double media= sum/array.length;
        return media;
    }
    
 /*dice si un numero esta en el array */
    public static boolean estaArray(int[]array){

        Scanner s=new Scanner (System.in);
        System.out.println("Introduce el numero para saber si esta en el array");
        int num=s.nextInt();
        for(int i=0;i<array.length;i++){
            if(num==array[i]){
                return true;
            }
        }
        return false;
    }


    /*devuelve la posicion de un numero en el array */
    public static int posicionEnArray(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }
    

    public static void volteaArrayInt(int[] array) {
        int temp, length = array.length;
        for (int i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }

    public static void rotaDerechaArrayInt(int[] array, int n) {
        int length = array.length;
        int[] arrayCopy = array.clone();
        for (int i = 0; i < length; i++) {
            array[(i + n) % length] = arrayCopy[i];
        }
}


    public static void main(String[] args) {
        
       int[] array= generaArray(10);
       for(int i=0;i<array.length;i++){
        System.out.print(" "+array[i]);
       }
    }
}
