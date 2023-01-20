

public class EJ13 {
    public static void main(String[] args) {
       
        String[] paises = {"España", "Rusia", "Japón", "Australia"};
        
      
        int[][] estaturas = new int[4][10];
        
       
       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                estaturas[i][j] =(int)((Math.random()*141)+70);
            }
        }
        
        System.out.print("                                                " +"MED  MIN  MAX" );
        System.out.println();
        for (int i = 0; i < 4; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            System.out.print(paises[i]+": ");
            for (int j = 0; j < 10; j++) {
                int estatura = estaturas[i][j];
                min = Math.min(min, estatura);
                max = Math.max(max, estatura);
                sum += estatura;
                System.out.print(estatura+" ");
            }
            
            System.out.print("| "+ (sum / 10)+" "+min+" "+max);
            System.out.println();
            System.out.println();
        }
    }
}
