public class tablas_faci {
    public static void main(String[] args) {
        int filas=6;
        int columnas=4;
        int cont=1;
        int [][] tabla=new int [6][4];
        for(int c=0;c<columnas;c++){
           for(int f=0;f<filas;f++){
            tabla[f][c]=cont;
            cont+=1;
           } 
        }
    }
}
