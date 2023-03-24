public class Gato_clase {
    String color,raza, sexo, nombre;
    int edad;
    double peso;

   Gato_clase(String nombre,String sexo){
   this.nombre=nombre;
   this.sexo=sexo;
   }
   Gato_clase(){

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
