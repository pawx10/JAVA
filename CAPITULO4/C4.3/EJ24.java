import java.util.Scanner;
public class EJ24 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int cargo = s.nextInt();
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int diasVisita = s.nextInt();
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = s.nextInt();
    double sueldoBase = 0;
    switch(cargo) {
    case 1: // Programador junior
    sueldoBase = 950;
    break;
    case 2: // Programador senior
    sueldoBase = 1200;
    break;
    case 3: // jefe de proyecto
    sueldoBase = 1600;
    break;
    default:
    System.out.println("No ha elegido correctamente el sueldo base.");
    }
    double sueldoDietas = diasVisita * 30;
    double sueldoBruto = sueldoBase + sueldoDietas;
    double irpf = 0;
    if (estadoCivil == 1) { // Soltero
    irpf = 25;
    } else if (estadoCivil == 2) { // Casado
    irpf = 20;
    } else {
    System.out.println("No ha elegido correctamente el estado civil.");
    }
    double cuantiaIrpf = (sueldoBruto * irpf) / 100;
    // Muestra la nómina desglosada
    System.out.println(sueldoBase);
    System.out.printf(" (%2d viajes)%7.2f ",diasVisita,  sueldoDietas);
    System.out.println(sueldoBruto);
    System.out.printf("%7.2f " ,irpf,cuantiaIrpf);
    System.out.println(sueldoBruto-cuantiaIrpf  );

}
}
        