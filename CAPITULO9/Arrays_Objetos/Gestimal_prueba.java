import java.util.ArrayList;
import java.util.Scanner;

public class Gestimal_prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

            int opcion = scanner.nextInt();
            scanner.nextLine();

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
                    String codigo = scanner.nextLine();
                    System.out.println("Introduce la descripción:");
                    String descripcion = scanner.nextLine();
                    System.out.println("Introduce el precio de compra:");
                    double precioCompra = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Introduce el precio de venta:");
                    double precioVenta = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Introduce la cantidad en stock:");
                    int cantidadStock = scanner.nextInt();
                    scanner.nextLine();
                    Articulo nuevoArticulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, cantidadStock);
                    articulos.add(nuevoArticulo);
                    break;

                case 3:
                    // Baja
                    System.out.println("Introduce el código del artículo a eliminar:");
                    String codigoAEliminar = scanner.nextLine();
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
                    String codigoAModificar = scanner.nextLine();
                    for (Articulo a : articulos) {
                        if (a.getCodigo().equals(codigoAModificar)) {
                            System.out.println("Introduce la nueva descripción:");
                            String nuevaDescripcion = scanner.nextLine();
                            a.setDescripcion(nuevaDescripcion);
                            System.out.println("Introduce el nuevo precio de compra:");
                            double nuevoPrecioCompra = scanner.nextDouble();
                            scanner.nextLine();
                            a.setPrecioCompra(nuevoPrecioCompra);
                            System.out.println("Introduce el nuevo precio de venta:");
                            double nuevoPrecioVenta = scanner.nextDouble();
                            scanner.nextLine();
                            a.setPrecioVenta(nuevoPrecioVenta);
                            System.out.println("Introduce la nueva cantidad en stock:");
                            int nuevaCantidadStock = scanner.nextInt();
                            scanner.nextLine();
                            a.setCantidadStock(nuevaCantidadStock);
                            System.out.println("Artículo modificado.");
                            break;
                        }
                    }
                    break;

                case 5:
                   // Entrada de mercancía
                          System.out.println("\nENTRADA DE MERCANCÍA");
                          System.out.print("Introduce el código del artículo: ");
                          String codigoEntrada = scanner.nextLine();

                          // Buscar el artículo en el almacén
Articulo articuloEntrada = null;
for (Articulo articulo : almacen) {
    if (articulo.getCodigo().equals(codigoEntrada)) {
        articuloEntrada = articulo;
        break;
    }
}

// Comprobar si el artículo existe
if (articuloEntrada != null) {
    System.out.print("Introduce la cantidad de unidades que entran: ");
    int cantidadEntrada = scanner.nextInt();
    scanner.nextLine(); // Consumir el salto de línea

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

