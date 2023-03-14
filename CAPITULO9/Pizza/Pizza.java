

public class Pizza {
    private static int TotalPedidas=0;
    private static int TotalServidas=0;

    private String size;
    private String tipo;
    private String estado;

    public Pizza(String tipo, String size){
        this.tipo=tipo;
        this.size=size;
        this.estado="pedida";
        Pizza.TotalPedidas++;
    }
    public String toString(){
        return "pizza" + this.tipo+ ""+this.size+","+this.estado;
    }

    public static int getTotalPedidas(){
        return Pizza.TotalPedidas;
    }

    public static int getTotalServidas(){
        return Pizza.TotalServidas;
    }

    public void sirve(){
        if (this.estado.equals("pedida")){
            this.estado="servida";
            Pizza.TotalServidas++;
        }else{
            System.out.println("pizza ya servida");
        }
    }
}
