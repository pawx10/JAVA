public class Prueba_animal {

    public static void main (String[] args) {
        Inventario inventario = new Inventario();
        
  
        inventario.insertarAnimal(new Perro("Juan"));
        inventario.insertarAnimal(new Gato("Michi"));
        inventario.insertarAnimal(new Loro("Jose"));
        inventario.insertarAnimal(new Canario("Piolin"));
        
     
        System.out.println("Lista de animales:");
        inventario.mostrarAnimales();
        System.out.println();

        Animal animal = new Perro("Fido");
        System.out.println("Datos del animal " + animal.getNombre() + ":");
        inventario.mostrarAnimal(animal);
        System.out.println();
        
    
        System.out.println("Datos de todos los animales:");
        inventario.mostrarTodosLosAnimales();
        System.out.println();

        System.out.println("Eliminando al perro Fido del inventario...");
        inventario.eliminarAnimal(animal);
        System.out.println();
        
 
        System.out.println("Lista de animales después de eliminar a Fido:");
        inventario.mostrarAnimales();
        System.out.println();
        

        System.out.println("Vaciar el inventario...");
        inventario.vaciarInventario();
        System.out.println();
        
      
        System.out.println("Lista de animales después de vaciar el inventario:");
        inventario.mostrarAnimales();
    }

}