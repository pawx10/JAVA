public class EJ15 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in); 
        
        System.out.println("Array");
        int[] myArray = FunciArrays.generaArrayInt(100, 0, 100); 

        System.out.println ("La suma total  es: " + FuncionesArray.sumaArray(myArray));            
        System.out.println ("La media de los números es: " +FuncionesArray.mediaArray(myArray));
    s.close();
    }
}

