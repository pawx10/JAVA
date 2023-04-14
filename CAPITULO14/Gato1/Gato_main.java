import java.util.Scanner;

public class Gato_main {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in); 
        Gato_clase[] gato=new Gato_clase[3];
        String nombreintroducido,colorintroducido;
        int sexoIntroducido;

        Gato garfield = new Gato("Garfield", Sexo.MACHO);
    Gato lisa = new Gato("Lisa", Sexo.HEMBRA);
    Gato tom = new Gato("Tom", Sexo.MACHO);

    try {
        Gato cria1 = garfield.apareaCon(lisa);
        Gato cria2 = garfield.apareaCon(tom);
    } catch (ExcepcionApareamientoImposible e) {
        System.out.println(e.getMessage());
    }

    for (int i = 0; i < 3; i++) {
        System.out.println("Gato " + i);
        System.out.println("Nombre: ");
        nombreIntroducido = s.nextLine();
        System.out.println("Color ");
        colorIntroducido = s.nextLine();
        System.out.println("Seleccione el sexo (1 para macho, 2 para hembra): ");
        sexoIntroducido = s.nextInt();
        s.nextLine(); // Limpia el buffer de entrada

        if (sexoIntroducido == 1) {
            gatos[i] = new Gato(nombreIntroducido, Sexo.MACHO);
        } else if (sexoIntroducido == 2) {
            gatos[i] = new Gato(nombreIntroducido, Sexo.HEMBRA);
        } else {
            System.out.println("Selección de sexo inválida. Introduzca 1 para macho o 2 para hembra.");
            i--; // Repite la iteración para este gato
            continue;
        }
        gatos[i].setColor(colorIntroducido);
    }

    System.out.println("Los gatos son estos: ");

    for (int i = 0; i < 3; i++) {
        System.out.println("Gato " + i);
        System.out.println("Nombre " + gatos[i].getNombre());
        System.out.println("Sexo " + gatos[i].getSexo());
        System.out.println("Color " + gatos[i].getColor());
        System.out.println("---------------------------------");
    }

    System.out.println("Comenzando el reparto de sardinas...");

    // Se reparten las sardinas entre los gatos
    int sardinas = 10;
    for (int i = 0; i < 3; i++) {
        System.out.println("Gato " + gatos[i].getNombre() + " está comiendo...");
        int sardinasQueCome = s.nextInt();
        s.nextLine();
        gatos[i].come(sardinasQueCome);
        sardinas -= sardinasQueCome;
        if (sardinas <= 0) {
            System.out.println("Ya no hay sardinas");
            break;
        }
    }

    // Se intenta aparear dos gatos
    System.out.println("Intentando aparear dos gatos...");
    System.out.println("Elija el primer gato (0, 1 o 2):");
    int gato1 = s.nextInt();
    s.nextLine();
    System.out.println("Elija el segundo gato (0, 1 o 2):");
    int gato2 = s.nextInt();
    s.nextLine();

    try {
        Gato_clase cria = gato[gato1].apareaCon(gato[gato2]);
        System.out.println("¡Enhorabuena, han tenido un nuevo gato! Su nombre es " + cria.getNombre() + ".");
    } catch (ExcepcionApareamientoImposible e) {
        System.out.println("No se puede aparear");
    }

    System.out.println("Los gatos son estos: ");

    for(int i=0;i<3;i++){
        System.out.println("Gato "+i);
        System.out.println("Nombre "+gato[i].getNombre());
        System.out.println("Sexo "+gato[i].getSexo());
        System.out.println("Color "+gato[i].getColor());
        System.out.println("---------------------------------");
    }

    // Apareamiento de gatos
    System.out.println("Introduce el índice del primer gato: ");
    int index1 = s.nextInt();
    s.nextLine();
    System.out.println("Introduce el índice del segundo gato: ");
    int index2 = s.nextInt();
    s.nextLine();

    try {
        Gato_clase cria = gato[index1].apareaCon(gato[index2]);
        System.out.println("Se ha generado una nueva cría: ");
        System.out.println("Nombre: " + cria.getNombre());
        System.out.println("Sexo: " + cria.getSexo());
        System.out.println("Color: " + cria.getColor());
    } catch (ExcepcionApareamientoImposible e) {
        System.out.println("Error: " + e.getMessage());
    }

    // Reparto de sardinas entre los gatos
    System.out.println("Comenzando el reparto de sardinas...");
    int sardinas2 = 10;
    for (int i = 0; i < 3; i++) {
        System.out.println("Gato " + gato[i].getNombre() + " está comiendo...");
        int sardinasQueCome = s.nextInt();
        s.nextLine(); 
        gato[i].come(sardinasQueCome);
        sardinas2 -= sardinasQueCome;
        if (sardinas2 <= 0) {
            System.out.println("Ya no hay sardinas");
            break;
        }
    }

}
}

class Gato_clase {
private String nombre;
private String sexo;
private String color;
private int sardinasComidas;

typescript
Copy code
public Gato_clase(String nombre, String sexo) {
    this.nombre = nombre;
    this.sexo = sexo;
    this.sardinasComidas = 0;
}

public String getNombre() {
    return this.nombre;
}

public String getSexo() {
    return this.sexo;
}

public String getColor() {
    return this.color;
}

public void setColor(String color) {
    this.color = color;
}

public int getSardinasComidas() {
    return this.sardinasComidas;
}

public void come(int cantidad) {
    this.sardinasComidas += cantidad;
    System.out.println("Gato " + this.nombre);

}
}