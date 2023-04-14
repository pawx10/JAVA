import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class EJ3 {
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = mostrarMenuAleatorio();
            try {
                switch (opcion) {
                    case 1:
                        funcion1();
                        break;
                    case 2:
                        funcion2();
                        break;
                    case 3:
                        funcion3();
                        break;
                    case 4:
                        funcion4();
                        break;
                    case 5:
                        funcion5();
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida, intente de nuevo.");
                        break;
                }
            } catch (StackOverflowError e) {
                System.out.println("Se ha producido un StackOverflowError: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Se ha producido un NumberFormatException: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Se ha producido un ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (FileNotFoundException e) {
                System.out.println("Se ha producido un FileNotFoundException: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Se ha producido un ArithmeticException: " + e.getMessage());
            }
        } while (opcion != 6);
    }

    private static int mostrarMenuAleatorio() {
        Random random = new Random();
        int opcion = random.nextInt(6) + 1;
        System.out.println("Menú:");
        System.out.println("1. Provocar StackOverflowError");
        System.out.println("2. Provocar NumberFormatException");
        System.out.println("3. Provocar ArrayIndexOutOfBoundsException");
        System.out.println("4. Provocar FileNotFoundException");
        System.out.println("5. Provocar ArithmeticException");
        System.out.println("6. Salir");
        System.out.println("Opción aleatoria: " + opcion);
        return opcion;
    }

    private static void funcion1() {
        funcion1();
    }

    private static void funcion2() {
        String numero = "texto";
        int entero = Integer.parseInt(numero);
    }

    private static void funcion3() {
        int[] arreglo = {1, 2, 3};
        int elemento = arreglo[10];
    }

    private static void funcion4() throws FileNotFoundException {
        File archivo = new File("archivo.txt");
        java.util.Scanner scanner = new java.util.Scanner(archivo);
    }

    private static void funcion5() {
        int a = 5;
        int b = 0;
        int division = a / b;
    }
}
