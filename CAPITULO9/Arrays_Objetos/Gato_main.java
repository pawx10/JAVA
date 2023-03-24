import java.util.Scanner;

public class Gato_main {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in); 
        Gato_clase[] gato=new Gato_clase[3];
        String nombreintroducido,colorintroducido;
        int sexoIntroducido;

        for(int i=0;i<3;i++){
            System.out.println("Gato "+i);
            System.out.println("Nombre: ");
            nombreintroducido=s.nextLine();
            System.out.println("Color ");
            colorintroducido=s.nextLine();
            System.out.println("Seleccione el sexo (1 para macho, 2 para hembra): ");
            sexoIntroducido = s.nextInt();
            s.nextLine(); // Limpia el buffer de entrada

            if (sexoIntroducido == 1) {
                gato[i] = new Gato_clase(nombreintroducido, "macho");
            } else if (sexoIntroducido == 2) {
                gato[i] = new Gato_clase(nombreintroducido, "hembra");
            } else {
                System.out.println("Selección de sexo inválida. Introduzca 1 para macho o 2 para hembra.");
                i--; // Repite la iteración para este gato
                continue;
            }
            gato[i].setColor(colorintroducido);
        }

        System.out.println("Los gatos son estos: ");

        for(int i=0;i<3;i++){
            System.out.println("Gato "+i);
            System.out.println("Nombre "+gato[i].getNombre());
            System.out.println("Sexo "+gato[i].getSexo());
            System.out.println("Color "+gato[i].getColor());
            System.out.println("---------------------------------");

            System.out.println("Comenzando el reparto de sardinas...");
        
        // Se reparten las sardinas entre los gatos
        int sardinas = 10;
        for ( i = 0; i < 3; i++) {
            System.out.println("Gato " + gato[i].getNombre() + " está comiendo...");
            int sardinasQueCome = s.nextInt();
            s.nextLine(); 
            gato[i].come(sardinasQueCome);
            sardinas -= sardinasQueCome;
            if (sardinas <= 0) {
                System.out.println("Ya no hay sardinas");
                break;
            }
        }
    }
}
}