import java.util.ArrayList;

import java.io.IOException;
import java.io.FileNotFoundException;

public class Palabras {
  public static void main(String[] args) {
    // Comprueba si se ha especificado un archivo
    String archivo = Funciones.obtenerNombreArchivo(args);
    if (archivo != null) {
      ArrayList<String> palabras = null;
      try {
        // Lee el archivo y almacena las palabras en un ArrayList
        palabras = Funciones.leerArchivo(archivo);
        // Maneja los argumentos de consola y realiza las acciones correspondientes
        Funciones.realizarAcciones(args, palabras, archivo);
      } catch (FileNotFoundException e) {
        // Si el archivo no se encuentra, muestra un mensaje de error
        System.out.println("No se ha encontrado el archivo.");
      } catch (IOException e) {
        // Si hay un error al leer el archivo, muestra un mensaje de error
        System.out.println("Error al leer el archivo.");
      }
    } else {
      // Si no se ha especificado un archivo, termina el programa
      return;
    }
  }
}