import java.util.Scanner;
public class Expocoches {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      Zona principal = new Zona(1000);
      Zona compraVenta = new Zona(200);
      Zona vip = new Zona(25);
      
      String opcion = "";
      String opcion2 = "";
      int opcionNum=0;
      int opcionNum2=0;
      int nNum=0;
      String n = "";


      boolean datoValido=false;
      boolean datoValido2=false;
      boolean datoValido3=false;
      
      while (opcionNum < 3) {
        System.out.println("\nEXPOCOCHES MÁLAGA");
        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
        

        do{

          try{
            System.out.println("Elige una opcion [1-3]");
            opcion = s.nextLine();
            opcionNum=Integer.parseInt(opcion);
            datoValido=true;
          }catch (Exception e){
            opcionNum=0;
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println("Opcion no valida");
            datoValido=false;
          }

          }while(!datoValido);
        
        if (opcionNum == 1) {
          System.out.println("\nEn la zona principal hay " + principal.getEntradasPorVender());
          System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
          System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
        }
        
        
        if (opcionNum == 2) {
          System.out.println("\n1. Principal");
          System.out.println("2. Compra-venta");
          System.out.println("3. Vip");
          
          
          do{

            try{
              System.out.print("Elige la zona para la que quieres comprar las entradas: ");
              opcion2 = s.nextLine();
              opcionNum2=Integer.parseInt(opcion);
              datoValido2=true;
            }catch (Exception e){
              opcionNum=0;
              System.out.println(e.getClass());
              System.out.println(e.getMessage());
              System.out.println("Opcion no valida");
              datoValido2=false;
            }
            }while(!datoValido2);
            

            do{

              try{
                System.out.print("¿Cuántas entradas quieres? ");
                n = s.nextLine();
                nNum=Integer.parseInt(opcion);
                datoValido3=true;
              }catch (Exception e){
                nNum=0;
                System.out.println(e.getClass());
                System.out.println(e.getMessage());
                System.out.println("Opcion no valida");
                datoValido3=false;
              }
              }while(!datoValido3);
          
         
          switch (opcionNum2) {
            case 1:
              principal.vender(nNum);
              break;
            case 2:
              compraVenta.vender(nNum);
              break;
            case 3:
              vip.vender(nNum);
              break;
            default:
          }
           
          }
        }
      
      } // menú principal
    
}


