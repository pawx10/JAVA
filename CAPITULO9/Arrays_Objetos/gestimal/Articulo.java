public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int cantidadStock;
  
    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int cantidadStock) {
      this.codigo = codigo;
      this.descripcion = descripcion;
      this.precioCompra = precioCompra;
      this.precioVenta = precioVenta;
      this.cantidadStock = cantidadStock;
    }
  
    public String getCodigo() {
      return codigo;
    }
  
    public void setCodigo(String codigo) {
      this.codigo = codigo;
    }
  
    public String getDescripcion() {
      return descripcion;
    }
  
    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }
  
    public double getPrecioCompra() {
      return precioCompra;
    }
  
    public void setPrecioCompra(double precioCompra) {
      this.precioCompra = precioCompra;
    }
  
    public double getPrecioVenta() {
      return precioVenta;
    }
  
    public void setPrecioVenta(double precioVenta) {
      this.precioVenta = precioVenta;
    }
  
    public int getCantidadStock() {
      return cantidadStock;
    }
  
    public void setCantidadStock(int cantidadStock) {
      this.cantidadStock = cantidadStock;
    }
  
    public String toString() {
      return "Código: " + this.codigo +
        "\nDescripción: " + this.descripcion +
        "\nPrecio de compra: " + this.precioCompra +
        "\nPrecio de venta: " + this.precioVenta +
        "\nCantidad en stock: " + this.cantidadStock + "\n";
    }
  }
  