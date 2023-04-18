import java.util.ArrayList;
import java.util.Scanner;

public class Gestimal_prueba {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();

        while (true) {
            System.out.println("Menú GESTISIMAL:");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");

            int opcion = s.nextInt();
            s.nextLine();

            switch (opcion) {
                case 1:
                    // Listado
                    System.out.println("Listado de artículos:");
                    for (Articulo a : articulos) {
                        System.out.println(a);
                    }
                    break;

                case 2:
                    // Alta
                    System.out.println("Introduce el código:");
                    String codigo = s.nextLine();
                    System.out.println("Introduce la descripción:");
                    String descripcion = s.nextLine();
                    System.out.println("Introduce el precio de compra:");
                    double precioCompra = s.nextDouble();
                    s.nextLine();
                    System.out.println("Introduce el precio de venta:");
                    double precioVenta = s.nextDouble();
                    s.nextLine();
                    System.out.println("Introduce la cantidad en stock:");
                    int cantidadStock = s.nextInt();
                    s.nextLine();
                    Articulo nuevoArticulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, cantidadStock);
                    articulos.add(nuevoArticulo);
                    break;

                case 3:
                    // Baja
                    System.out.println("Introduce el código del artículo a eliminar:");
                    String codigoAEliminar = s.nextLine();
                    for (Articulo a : articulos) {
                        if (a.getCodigo().equals(codigoAEliminar)) {
                            articulos.remove(a);
                            System.out.println("Artículo eliminado.");
                            break;
                        }
                    }
                    break;

                case 4:
                    // Modificación
                    System.out.println("Introduce el código del artículo a modificar:");
                    String codigoAModificar = s.nextLine();
                    for (Articulo a : articulos) {
                        if (a.getCodigo().equals(codigoAModificar)) {
                            System.out.println("Introduce la nueva descripción:");
                            String nuevaDescripcion = s.nextLine();
                            a.setDescripcion(nuevaDescripcion);
                            System.out.println("Introduce el nuevo precio de compra:");
                            double nuevoPrecioCompra = s.nextDouble();
                            s.nextLine();
                            a.setPrecioCompra(nuevoPrecioCompra);
                            System.out.println("Introduce el nuevo precio de venta:");
                            double nuevoPrecioVenta = s.nextDouble();
                            s.nextLine();
                            a.setPrecioVenta(nuevoPrecioVenta);
                            System.out.println("Introduce la nueva cantidad en stock:");
                            int nuevaCantidadStock = s.nextInt();
                            s.nextLine();
                            a.setCantidadStock(nuevaCantidadStock);
                            System.out.println("Artículo modificado.");
                            break;
                        }
                    }
                    break;

                case 5:
                  // Entrada de mercancía
// Entrada de mercancía
System.out.println("\nENTRADA DE MERCANCÍA");
System.out.print("Introduce el código del artículo: ");
String codigoEntrada = s.nextLine();

// Buscar el artículo en el almacén
Articulo articuloEntrada = null;
for (Articulo articulo : articulos) {
    if (articulo.getCodigo().equals(codigoEntrada)) {
        articuloEntrada = articulo;
        break;
    }
}


// Comprobar si el artículo existe
if (articuloEntrada != null) {
    System.out.print("Introduce la cantidad de unidades que entran: ");
    int cantidadEntrada = s.nextInt();
    s.nextLine(); // Consumir el salto de línea

    // Incrementar el stock del artículo
    articuloEntrada.setCantidadStock(articuloEntrada.getCantidadStock() + cantidadEntrada);

    System.out.println("Entrada de mercancía registrada correctamente.");
} else {
    System.out.println("El artículo con código " + codigoEntrada + " no existe en el almacén.");
}
break;
            }
          }
        }
      }

