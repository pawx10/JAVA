public class Gato_clase_2 {
     
        String color,raza, sexo, nombre;
        int edad;
        double peso;

        public Gato_clase_2(String nombre, String color, String sexo){
            this.nombre=nombre;
            this.color=color;
            this.sexo=sexo;
        }
    
       String getSexo(){
        return this.sexo;
       }
    
       String getNombre(){
        return this.nombre;
       }
    
       String getColor(){
        return this.color;
       }
    
       public void setNombre(String nombre){
        this.nombre=nombre;
       }
    
       public void setSexo(String sexo){
        this.sexo=sexo;
       }
    
       public void setColor(String color){
        this.color=color;
       }
    
    
    
    }
    

