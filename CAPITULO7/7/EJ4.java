public class EJ4 {
    public static void main(String[] args) {
        int [] num=new int [20];
        int [] cuadrado= new int [20];
        int [] cubo= new int [20];

        for( int i=0;i<20;i++){
            cuadrado[i]=(int)(Math.pow((num[i]),2));
        }
        for (int i=0;i<20;i++){
            cubo[i]=(int)(Math.pow(num[i],3));
        }
        for (int i=0;i<20;i++){
            System.out.println(num[i]+"   "+cuadrado[i]+"   "+cubo[i]);
        }
        
    }
    
}
