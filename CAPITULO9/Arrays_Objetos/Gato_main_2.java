import java.util.Scanner;

public class Gato_main_2 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in); 
        Gato_clase_2[] gato=new Gato_clase_2[4];
       int i;

        gato[1] = new Gato_clase_2("Josefina", "gris", "hembra");
        gato[0] = new Gato_clase_2("Garfield", "naranja", "macho");
        gato[2] = new Gato_clase_2("Melendi", "blanco", "macho");
        gato[3] = new Gato_clase_2("Bunbury", "negro", "macho");

        System.out.println("Los gatos son estos: ");
        System.out.println("---------------------------------");

        for( i=0;i<4;i++){
            System.out.println("Gato "+(1+i));
            System.out.println("Nombre "+gato[i].getNombre());
            System.out.println("Sexo "+gato[i].getSexo());
            System.out.println("Color "+gato[i].getColor());
            System.out.println("---------------------------------");
        }
    }
}