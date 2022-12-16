import java.util.Scanner;

public class EJ32{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce un número, por favor");
    
    int num;
    num = sc.nextInt();
    
    while(num<= 0){
	  System.out.println("Lo siento, ese número es negativo. Introduzca un número mayor que 0.");
	  num = sc.nextInt();
	}
    
    int sumatorioPar;
    sumatorioPar = 0;
    
    int cifra;
    cifra = 0;
    
    String numPares;
    numPares = "";
    
    while (num > 0){
	  if(num%2==0){
	    cifra = num%10;
	    sumatorioPar = sumatorioPar + cifra;
	    numPares = cifra + ", " + numPares;
	  }
	  num = num/10;
	}
    System.out.println("Sumatorio: " + sumatorioPar);
	System.out.println("Números pares: " + numPares);
  }
}
