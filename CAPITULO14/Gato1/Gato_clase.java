public class Gato_clase {
    String color, raza, sexo, nombre;
    int edad;
    double peso;
    static int sardinas = 10;

    Gato_clase(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    Gato_clase() {

    }

    String getSexo() {
        return this.sexo;
    }

    String getNombre() {
        return this.nombre;
    }

    String getColor() {
        return this.color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void come(int s) {
        if (sardinas == 0) {
            System.out.println("Ya no hay sardinas");
            return;
        }
        System.out.print(this.nombre + ": ");
        for (int i = 1; i <= s && sardinas > 0; i++) {
            System.out.print("Ñam...");
            sardinas--;
        }
        System.out.println();
    }

    public Gato_clase apareaCon(Gato_clase otroGato) throws ExcepcionApareamientoImposible {
        if (this.sexo.equalsIgnoreCase(otroGato.getSexo())) {
            throw new ExcepcionApareamientoImposible("No se pueden aparear gatos del mismo sexo");
        } else {
            String nombreCria = this.nombre.substring(0, this.nombre.length() / 2) + otroGato.getNombre().substring(otroGato.getNombre().length() / 2);
            Gato_clase cria = new Gato_clase(nombreCria, Math.random() > 0.5 ? "macho" : "hembra");
            System.out.println("¡Ha nacido una nueva criatura llamada " + cria.getNombre() + "!");
            return cria;
        }
    }
}

