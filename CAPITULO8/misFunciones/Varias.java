package misFunciones;
/**
* En este programa se utiliza el bucle while donde se introduce un número entero y se muestra por pantalla
* el número al reves
* @author Pablo Arroyo
*/
public class Varias {
/** /////////////BIBLIOTECA DE FUNCIONES///////////////*/
  public static int voltea(int x) {
/** Voltea el número entero.
 * Dejando el último dígito el primero y sucesivamente con los siguientes
 * 
 * @return volteado al terminar la operación con el número ya volteado
 */
  int volteado = 0;
    //Mediante el siguiente while damos la vuelta al número y lo guardamos en la variable volteado
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x /=10;
    }
    return volteado;
  }

  public static boolean esPrimo(int x) {
/** Comprueba si un númerro entero positivo es primo o no.
 * Teniendo en cuenta que un número es primo únicamente cuando es divisible
 * entre él mismo y la unidad.
 * 
 * @param x un número entero positivo
 * @return true si el número es primo
 * @return false si el número no es primo
 */
  int i;
  
  for (i = 2; i < x; i++){
    if ((x % i) == 0) {
      return false;
    }
  }
  return true;
}

  public static int sigPrimo(int x) {
/** Comprueba el siguiente primo a un número dado y lo muestra.
 * 
 * @return x con el siguiente número primo a un número dado
 */
    x++;
    while (!esPrimo(x)) {
      x++;
    }
    return x;
  }

  public static boolean esCapicua(int x) {
/** Comprueba si un número dado es capicua
 * Teniendo en cuenta que un número es caopicua
 * cuando se puede leer igual de izquierda a derecha que 
 * de derecha a izquierda
 * 
 *@return true si el número es capicua
 * @return false si el número no es capicua
 */
    int volteado = voltea(x);
    if (x == volteado) {
      return true;
    }else {
      return false;
    }
  }

  public static int potencia(int base, int exponente) {
/** Dada una base y un exponente calcula la potencia
 * 
 * @return resultado calculando base^exponente.
 */
    int resultado = 1;
    int i;
    
    for (i = 0; i < exponente; i++) {
      resultado *= base;
    }
    return resultado;
  }
  
  public static int numDigitos(int x) {
/** Cuenta la cantidad de digitos que tiene "x"
 * 
 * @return digitos con la cantidad de digitos que tiene
 */
    int digitos = 1;
    
    while (x >= 10) {
      x /= 10;
      digitos++;
    }
    
    return digitos;
  }
  
  public static int digitoN(int x, int n) {
/** Devuelve el dígito que esta en la posición "n" de un número entero
 * "x". Se empieza contando por el 0 y de izquierda a derecha.
 * 
 * return x devuelve el digito que se quería saber
 */
    x = voltea(x);
    int i;
    
    for (i = 0; i < n; i++) {
      x /= 10;
    }
    return x % 10;
  }
    
  public static int posDeDigito(int x, int d) {
/** Recibe un número "x" en busca de un digito "d"
 *  y luego devuelve la posición de ese digito "i".
 *  Devuelve -1 si el número "d" no es encontrado en "x".
 *  
 * @return i diciendo la posición del digito
 * @return -1 si no se encuentra ese digito
 */
    int i;
    
    for (i = 0; i < numDigitos(x); i++){
      if (digitoN(x, i) == d) {
        return i;
      }
    }
    return -1;
  }
  /*mutiplicar */

  public static double mutiplicar(double a, double b){
    double resultado=a*b;
    return resultado;
  }
/*es mayor de edad */
  public static boolean esMayorEdad(int edad){

    if(edad<18){
      return false;
      
    }else{return true;}

  }
/*minimo  */
 
public static int minimo (int a , int b){
  if(a<b){
   return a;
  }else{
    return b;
  }
  
}

/*positivo negativo o 0 */
public static int  dimeSigno (int a){
  if(a<0){
    a= -1;
   
  }
  if(a>0){
    a= 1;
    
  }
  if (a==0){
    a= 0;
    
  }
  return a;
}


/*area y perimetro rectangulo apartir de ancho y alto  */

public static double areaRectangulo (double ancho, double alto){

  double area= ancho*alto;
  return area;

}

public static double perimetroRectangulo (double ancho, double alto){

  double perimetro= (ancho*2)+(alto*2);
  return perimetro;

}

public static int mayorDeDos (int a , int b){
  if(a>b)
  {return a;}else{return b;}

}

/*tabla de multiplicar */
public static int tablaMultiplicar (int a){
int n=0;
  for (int i=1;i<10;i++){
     n=a*i;
     
     
    
  }
  return n;
}

/*piramide con caracter y num lineas */
}