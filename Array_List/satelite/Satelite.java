public class Satelite {
    
    String nombre;
    double masa,diametro, rotacion, traslacion, distancia;
       

        public Satelite(String nombre,double masa, double diametro, double rotacion,double traslacion, double distancia){
            this.nombre=nombre;
            this.masa=masa;
            this.diametro=diametro;
            this.rotacion=rotacion;
            this.traslacion= traslacion;
            this.distancia=distancia;
        }
        Satelite(){

        }
    
       String getNombre(){
        return this.nombre;
       }
    
       double getMasa(){
        return this.masa;
       }
    
       double getDiametro(){
        return this.diametro;
       }

       double getRotacion(){
        return this.rotacion;
       }

       double getTrasacion(){
        return this.traslacion;
       }

       double getDistancia(){
        return this.distancia;
       }
    
       public void setNombre(String nombre){
        this.nombre=nombre;
       }
    
       public void setMasa(double masa){
        this.masa=masa;
       }
    
       public void setDiametro(double diametro){
        this.diametro=diametro;
       }

       public void setRotacion(double rotacion){
        this.rotacion=rotacion;
       }

       public void setTraslacion(double traslacion){
        this.traslacion=traslacion;
       }

       public void setDistancia(double distancia){
        this.distancia=distancia;
        
       }
       @Override
    public String toString() {
    return "Satelite: " + nombre + ", Masa: " + masa + ", Diametro: " + diametro + ", Rotacion: " + rotacion + ", Traslacion: " + traslacion + ", Distancia: " + distancia;
}

    
}
