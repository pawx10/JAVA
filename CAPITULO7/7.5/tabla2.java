public class tabla2 {
    public static void main(String[] args) {
        int aux=1;
        int [][] array=new int [4][6];
        int c=0;
        int f=0;
        for(int i=0;i<4;i++){
            for (int j=0;j<6;j++){
              array[i][j]=aux;
              aux++;
            }
        }
        for ( c=0;c<6;c++){
            for ( f=0;f<4;f++){
                System.out.printf("%10d",array[f][c]);
                
            }
            System.out.println();
        }
    }
}

