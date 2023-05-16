import java.util.Scanner;
import java.util.Random;
public class EJ5_Array_bi {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner s=new Scanner(System.in);

         numero=0;
        int f=6;
        int c=10;
        int[][] array=new int [f][c];

        for(int i=0;i<f;i++){
            for (int j=0;j<c;j++){
                array[i][j]=random.nextInt(1000);
                numero[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<f;i++){
            for (int j=0;j<c;j++){
                System.out.println(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
