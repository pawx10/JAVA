import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Funciones {

  public static String obtenerNombreArchivo(String[] args) {
    boolean argumentoFEncontrado = false; // Indica si se ha encontrado el argumento -f
    String archivo = ""; // Almacena el nombre del archivo especificado después del argumento -f

    // Recorre el array de argumentos
    for (String arg : args) {
      if (arg.equals("-f")) {
        // Si se encuentra el argumento -f, establece la variable argumentoFEncontrado a
        // true
        argumentoFEncontrado = true;
      } else if (argumentoFEncontrado) {
        // Si se ha encontrado el argumento -f y se encuentra un argumento que no es -f,
        // asume que ese argumento es el nombre del archivo y lo almacena en la variable
        // archivo
        archivo = arg;
        break;
      }
    }

    // Comprueba si se ha encontrado el argumento -f y si se ha especificado un
    // nombre de archivo
    if (!argumentoFEncontrado) {
      // Si no se ha encontrado el argumento -f, muestra un mensaje de error y
      // devuelve null
      System.out.print(
          "Error: no se ha especificado el nombre del archivo. Utiliza -f para especificar el nombre del archivo. Ejemplo: java Palabras -f <Archivo>");
      return null;
    } else if (archivo.isEmpty()) {
      // Si no se ha especificado un nombre de archivo después del argumento -f,
      // muestra un mensaje de error y devuelve null
      System.out.print(
          "Error: no se ha especificado el nombre del archivo después del argumento -f. Especifica el nombre del archivo. Ejemplo: java Palabras -f <Archivo>");
      return null;
    }

    // Si se ha encontrado el argumento -f y se ha especificado un nombre de
    // archivo,
    // devuelve ese nombre de archivo
    return archivo;
  }

  public static ArrayList<String> leerArchivo(String archivo) throws IOException {
    ArrayList<String> palabras = new ArrayList<String>();
    Scanner s = new Scanner(new File(archivo));

    // Mientras haya más líneas por leer en el archivo
    while (s.hasNextLine()) {
      String linea = s.nextLine(); // Lee la siguiente línea del archivo
      String[] palabrasLinea = linea.split(" "); // Separa la línea en palabras utilizando el método split

      // Recorre el array de palabras y agrega cada palabra al ArrayList de palabras
      for (String palabra : palabrasLinea) {
        palabras.add(palabra.toLowerCase()); // Convierte la palabra a minúsculas antes de agregarla al ArrayList
      }
      palabras.add("\n"); // Agrega un salto de línea al ArrayList después de leer cada línea
    }
    s.close();
    return palabras; // Devuelve el ArrayList de palabras
  }

  public static void realizarAcciones(String[] args, ArrayList<String> palabras, String archivo) {
    // Recorre los argumentos de consola
    for (int i = 0; i < args.length; i++) {
      // Usa una estructura switch para manejar las diferentes opciones
      switch (args[i]) {
        case "-c":
          // Toma el siguiente argumento como la palabra a buscar
          String palabra = args[i + 1];
          // Inicializa un contador en cero
          int contador = 0;
          // Recorre el ArrayList de palabras
          for (String p : palabras) {
            // Si la palabra actual es igual a la palabra a buscar
            if (p.equals(palabra)) {
              // Incrementa el contador
              contador++;
            }
          }
          // Imprime el resultado
          System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces en el archivo.");
          break;
        case "-a":
          // Crea un ArrayList para almacenar las palabras únicas
          ArrayList<String> palabrasUnicas = new ArrayList<>();
          // Crea un ArrayList para almacenar el número de apariciones de cada palabra
          ArrayList<Integer> contadorPalabras = new ArrayList<>();
          // Recorre el ArrayList de palabras
          for (String p : palabras) {
            // Busca la palabra en el ArrayList de palabras únicas
            int index = palabrasUnicas.indexOf(p);
            // Si la palabra ya está en el ArrayList de palabras únicas
            if (index != -1) {
              // Incrementa el contador correspondiente en el ArrayList de contadores
              contadorPalabras.set(index, contadorPalabras.get(index) + 1);
            } else {
              // Si la palabra no está en el ArrayList de palabras únicas, la agrega
              palabrasUnicas.add(p);
              // Agrega un nuevo contador en el ArrayList de contadores
              contadorPalabras.add(1);
            }
          }
          // Ordena las listas por el número de apariciones
          for (int j = 0; j < palabrasUnicas.size(); j++) {
            for (int k = 0 + 1; j < palabrasUnicas.size(); k++) {
              if (contadorPalabras.get(j) < contadorPalabras.get(k)) {
                // Intercambia las palabras y los contadores
                String palabraTemporal = palabrasUnicas.get(j);
                int contadorTemporal = contadorPalabras.get(j);
                palabrasUnicas.set(j, palabrasUnicas.get(k));
                contadorPalabras.set(j, contadorPalabras.get(k));
                palabrasUnicas.set(k, palabraTemporal);
                contadorPalabras.set(k, contadorTemporal);
              }
            }
          }
          // Imprime el resultado
          for (int j = 0; j < palabrasUnicas.size(); j++) {
            System.out.println(palabrasUnicas.get(j) + ": " + contadorPalabras.get(j));
          }
          break;
        case "-A":
          // Crea un ArrayList para almacenar las palabras únicas
          ArrayList<String> palabrasUnicas2 = new ArrayList<>();
          // Crea un ArrayList para almacenar el número de apariciones de cada palabra
          ArrayList<Integer> contadorPalabras2 = new ArrayList<>();
          // Recorre el ArrayList de palabras
          for (String p : palabras) {
            // Busca la palabra en el ArrayList de palabras únicas
            int index = palabrasUnicas2.indexOf(p);
            // Si la palabra ya está en el ArrayList de palabras únicas
            if (index != -1) {
              // Incrementa el contador correspondiente en el ArrayList de contadores
              contadorPalabras2.set(index, contadorPalabras2.get(index) + 1);
            } else {
              // Si la palabra no está en el ArrayList de palabras únicas, la agrega
              palabrasUnicas2.add(p);
              // Agrega un nuevo contador en el ArrayList de contadores
              contadorPalabras2.add(1);
            }
          }
          // Ordena las listas alfabéticamente
          for (int j = 0; j < palabrasUnicas2.size(); j++) {
            for (int k = j + 1; k < palabrasUnicas2.size(); k++) {
              if (palabrasUnicas2.get(j).compareTo(palabrasUnicas2.get(k)) > 0) {
                // Intercambia las palabras y los contadores
                String palabraTemporal = palabrasUnicas2.get(j);
                int contadorTemporal = contadorPalabras2.get(j);
                palabrasUnicas2.set(j, palabrasUnicas2.get(k));
                contadorPalabras2.set(j, contadorPalabras2.get(k));
                palabrasUnicas2.set(k, palabraTemporal);
                contadorPalabras2.set(k, contadorTemporal);
              }
            }
          }
          // Imprime el resultado
          for (int j = 0; j < palabrasUnicas2.size(); j++) {
            System.out.println(palabrasUnicas2.get(j) + ": " + contadorPalabras2.get(j));
          }
          break;
        case "-p":
          // Toma el siguiente argumento como la palabra a buscar
          String palabra2 = args[i + 1];
          // Crea un ArrayList para almacenar las posiciones
          ArrayList<Integer> posiciones = new ArrayList<>();
          // Recorre el ArrayList de palabras
          for (int j = 0; j < palabras.size(); j++) {
            // Si la palabra actual es igual a la palabra a buscar
            if (palabras.get(j).equals(palabra2)) {
              // Agrega la posición a la lista de posiciones
              posiciones.add(j);
            }
          }
          // Imprime el resultado
          System.out.print("La palabra '" + palabra2 + "' aparece en las posiciones: ");
          for (int j = 0; j < posiciones.size(); j++) {
            System.out.print(posiciones.get(j));
            if (j < posiciones.size() - 1) {
              System.out.print(", ");
            }
          }
          System.out.println();
          break;
        case "-l":
          // Obtiene la palabra a buscar en el archivo
          String palabra3 = args[i + 1];
          // Declara una lista de cadenas para almacenar las líneas del archivo
          ArrayList<String> lineas = null;
          try {
            // Intenta leer el archivo y almacenar sus líneas en la lista de cadenas
            lineas = Funciones.leerArchivoPorLineas(archivo);
          } catch (FileNotFoundException e) {
            // Si el archivo no se encuentra, muestra un mensaje de error
            System.out.println("No se ha encontrado el archivo.");
          } catch (IOException e) {
            // Si hay un error al leer el archivo, muestra un mensaje de error
            System.out.println("Error al leer el archivo.");
          }
          // Si la lista de cadenas no es nula (es decir, si se ha leído correctamente el
          // archivo)
          if (lineas != null) {
            // Imprime un mensaje indicando en qué líneas aparece la palabra buscada
            System.out.print("La palabra '" + palabra3 + "' aparece en las líneas: ");
            // Recorre la lista de cadenas (líneas del archivo)
            for (int j = 0; j < lineas.size(); j++) {
              // Obtiene la línea actual
              String linea = lineas.get(j);
              // Si la línea contiene la palabra buscada
              if (linea.contains(palabra3)) {
                // Imprime el número de línea (j + 1)
                System.out.print((j + 1) + " ");
              }
            }
            // Salto de línea
            System.out.println();
          }
          break;


          
        case "-r":
          // Lee el archivo y almacena las líneas en un ArrayList
          ArrayList<String> lineas2 = null;
          try {
            lineas = Funciones.leerArchivoPorLineas(archivo);
          } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo.");
          } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
          }

          break;
        case "-R":
          // Desordenar aleatoriamente las palabras en el archivo
          desordenarPalabras(archivo);
          // Muestra un mensaje en la consola indicando que se han desordenado las
          // palabras
          System.out.println("Se han desordenado las palabras aleatoriamente.");
          break;
        case "-m":
          // Convierte todo el texto a minúsculas
          convertirTextoAMinusculas(archivo);
          System.out.println("Se ha convertido todo el texto a minúsculas.");
          break;
        case "-M":
          // Convierte todo el texto a mayúsculas
          convertirTextoAMayusculas(archivo);
          System.out.println("Se ha convertido todo el texto a mayúsculas.");
          break;
        case "-b":
          // Obtiene la palabra a borrar
          String borrarPalabra = args[i + 1];
          int n = -1;
          // Si hay un argumento -n después del argumento -b, obtiene el valor de n del
          // argumento siguiente al argumento -n
          if (i + 2 < args.length && args[i + 2].equals("-n")) {
            n = Integer.parseInt(args[i + 3]);
            i += 2;
          }
          // Borra la palabra especificada
          borrarPalabra(archivo, borrarPalabra, n);
          if (n == -1) {
            System.out.println("Se ha borrado cada aparición de la palabra '" + borrarPalabra + "'.");
          } else {
            System.out.println("Se ha borrado la aparición " + n + " de la palabra '" + borrarPalabra + "'.");
          }
          break;
        case "-o":
          // Restaura el texto a su estado original
          restaurarTexto(archivo);
          System.out.println("Se ha restaurado el texto a su estado original.");
          break;
        case "-w":
          // Obtiene el nombre del archivo de salida del argumento siguiente al argumento
          // -w
          String archivoSalida = args[i + 1];
          try (BufferedReader br = new BufferedReader(new FileReader(archivo));
              BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {
            // Lee el contenido del archivo original línea por línea
            String linea;
            while ((linea = br.readLine()) != null) {
              // Escribe cada línea en el archivo de salida
              bw.write(linea);
              bw.newLine();
            }
          } catch (IOException e) {
            // Si hay un error al copiar el archivo, muestra un mensaje de error
            System.out.println("Error al copiar el archivo.");
          }
          break;
      }
    }
  }

  private static void restaurarTexto(String archivo) {
    ArrayList<String> lineas = new ArrayList<>();
    
    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
      String linea;
      while ((linea = br.readLine()) != null) {
        lineas.add(linea);
      }
    } catch (IOException e) {
      System.out.println("Error al leer el archivo.");
      return;
    }
    
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
      for (String linea : lineas) {
        bw.write(linea);
        bw.newLine();
      }
      
      System.out.println("Se ha restaurado el texto a su estado original.");
    } catch (IOException e) {
      System.out.println("Error al escribir en el archivo.");
    }
  }

  private static void borrarPalabra(String archivo, String borrarPalabra, int n) {
    ArrayList<String> lineas = new ArrayList<>();
    
    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
      String linea;
      while ((linea = br.readLine()) != null) {
        lineas.add(linea);
      }
    } catch (IOException e) {
      System.out.println("Error al leer el archivo.");
      return;
    }
    
    int apariciones = 0;
    
    for (int i = 0; i < lineas.size(); i++) {
      String linea = lineas.get(i);
      String[] palabras = linea.split("\\s+");
      StringBuilder sb = new StringBuilder();
      
      for (String palabra : palabras) {
        if (palabra.equals(borrarPalabra)) {
          apariciones++;
          
          if (n == -1 || apariciones != n) {
            continue;
          }
        }
        
        sb.append(palabra).append(" ");
      }
      
      lineas.set(i, sb.toString().trim());
    }
    
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
      for (String linea : lineas) {
        bw.write(linea);
        bw.newLine();
      }
      
      if (n == -1) {
        System.out.println("Se ha borrado cada aparición de la palabra '" + borrarPalabra + "'.");
      } else {
        System.out.println("Se ha borrado la aparición " + n + " de la palabra '" + borrarPalabra + "'.");
      }
    } catch (IOException e) {
      System.out.println("Error al escribir en el archivo.");
    }
  }

  private static void convertirTextoAMayusculas(String archivo) {
    try (BufferedReader br = new BufferedReader(new FileReader(archivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
      String linea;
      while ((linea = br.readLine()) != null) {
        linea = linea.toUpperCase(); // Convierte la línea a mayúsculas
        bw.write(linea);
        bw.newLine();
      }
      System.out.println("Se ha convertido todo el texto a mayúsculas.");
    } catch (IOException e) {
      System.out.println("Error al convertir el texto a mayúsculas.");
    }
  }

  private static void convertirTextoAMinusculas(String archivo) {
    try (BufferedReader br = new BufferedReader(new FileReader(archivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
      String linea;
      while ((linea = br.readLine()) != null) {
        linea = linea.toLowerCase(); // Convierte la línea a minúsculas
        bw.write(linea);
        bw.newLine();
      }
      System.out.println("Se ha convertido todo el texto a minúsculas.");
    } catch (IOException e) {
      System.out.println("Error al convertir el texto a minúsculas.");
    }
  }
  

  private static void desordenarPalabras(String archivo) {
  }

  private static void escribirArchivoPorLineas(String archivo, ArrayList<String> lineas) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
      // Iterate over each line and write it to the file
      for (String linea : lineas) {
        bw.write(linea);
        bw.newLine();
      }
      System.out.println("Se ha escrito el archivo exitosamente.");
    } catch (IOException e) {
      System.out.println("Error al escribir el archivo.");
    }
  }

  public static ArrayList<String> leerArchivoPorLineas(String archivo) throws FileNotFoundException, IOException {
    // Crea un ArrayList para almacenar las líneas del archivo
    ArrayList<String> lineas = new ArrayList<>();
    // Crea un BufferedReader para leer el archivo
    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
      String linea;
      // Lee el archivo línea por línea
      while ((linea = br.readLine()) != null) {
        // Agrega cada línea al ArrayList
        lineas.add(linea);
      }
    }
    // Devuelve el ArrayList con las líneas del archivo
    return lineas;

    
  }
  
  
}



