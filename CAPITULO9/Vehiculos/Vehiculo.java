    public class Vehiculo {

    private static int kilometrosTotales=0;
    private static int vehiculosCreados=0;

    private int kilometrosReccorridos;

    public Vehiculo(){
    this.kilometrosReccorridos=0;
    }
    public int getKilometrosRecorridos(){
    return this.kilometrosReccorridos;
    }
    public static int getKilometrosTotales(){
    return Vehiculo.kilometrosTotales;
    }

    public void recorre(int k) {
    this.kilometrosReccorridos+=k;
    Vehiculo.kilometrosTotales+=k;

    }
    }
