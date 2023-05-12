import java.io.*;
import java.util.ArrayList;

public class Palabras2 {
    
    private ArrayList<String> leerArchivo(String archivo) throws IOException {
        // se verifica si existe el archivo y si se puede leer
        File file = new File(archivo);
        if (!file.exists()) {
            System.err.println("El archivo no existe: " + archivo);
            System.exit(1);
        }
        if (!file.isFile()) {
            System.err.println("No es un archivo: " + archivo);
            System.exit(1);
        }
        if (!file.canRead()) {
            System.err.println("No se puede leer el archivo: " + archivo);
            System.exit(1);
        }
        
        // Lee el archivo y devuelve una lista de palabras
        ArrayList<String> palabras = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                for (String p : partes) {
                    palabras.add(p.toLowerCase());
                }
            }
        }
        return palabras;
    }
    
    private int contarPalabras(ArrayList<String> palabras, String palabra) {
        int contador = 0;
        for (String p : palabras) {
            if (p.contains(palabra)) {
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.err.println("Se requieren 2 argumentos: <archivo> <palabra>");
            System.exit(1);
        }
        
        // aqui se obtienen los argumentos
        String archivo = args[0];
        String palabra = args[1].toLowerCase();
        
        Palabras2 p = new Palabras2();
        ArrayList<String> palabras;
        try {
            palabras = p.leerArchivo(archivo);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + archivo);
            System.exit(1);
            return;
        }
        
        // cuenta la cantidad de veces que se encuentra la palabra en el archivo
        int contador = p.contarPalabras(palabras, palabra);
        
        // dice si se ha encontrado la palabra y cuantas veces
        if (contador == 0) {
            System.out.println("La palabra \"" + args[1] + "\" no se encuentra en el archivo.");
        } else {
            System.out.println("La palabra \"" + args[1] + "\" se encontró " + contador + " veces en el archivo.");
        }
    }
}


