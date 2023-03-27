import java.util.ArrayList;
import java.util.Iterator;


class Animal {
    protected String tipo;
    protected String nombre;
    
    public Animal(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getNombre() {
        return nombre;
    }
}


class Perro extends Animal {
    public Perro(String nombre) {
        super("perro", nombre);
    }
}


class Gato extends Animal {
    public Gato(String nombre) {
        super("gato", nombre);
    }
}


class Loro extends Animal {
    public Loro(String nombre) {
        super("loro", nombre);
    }
}


class Canario extends Animal {
    public Canario(String nombre) {
        super("canario", nombre);
    }
}


class Inventario {
    private ArrayList<Animal> animales;
    
    public Inventario() {
        animales = new ArrayList<>();
    }
    
   
    public void mostrarAnimales() {
        Iterator<Animal> iterador = animales.iterator();
        while (iterador.hasNext()) {
            Animal animal = iterador.next();
            System.out.println(animal.getTipo() + ": " + animal.getNombre());
        }
    }
    

    public void mostrarAnimal(Animal animal) {
        System.out.println("Tipo: " + animal.getTipo());
        System.out.println("Nombre: " + animal.getNombre());
    }
    

    public void mostrarTodosLosAnimales() {
        Iterator<Animal> iterador = animales.iterator();
        while (iterador.hasNext()) {
            Animal animal = iterador.next();
            mostrarAnimal(animal);
            System.out.println();
        }
    }
    

    public void insertarAnimal(Animal animal) {
        animales.add(animal);
    }
    

    public void eliminarAnimal(Animal animal) {
        animales.remove(animal);
    }
    

    public void vaciarInventario() {
        animales.clear();
    }
}