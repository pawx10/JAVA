/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1;

public class Gato {
    private String nombre;
    private String imagen;

    public Gato(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return "<div class=\"accionmarca\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"ar\row_box\">&nbsp;Hola, soy " + nombre + "&nbsp;</div></div>";
    }

    public String habla() {
        return "<div class=\"accionmarca\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"ar\row_box\">&nbsp;GLUPGLUP&nbsp;</div></div>";
    }

    public String bebe(String bebida) {
        return "<div class=\"accionmarca\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"ar\row_box\">&nbsp;Estoy bebiendo " + bebida + "&nbsp;</div></div>";
    }
}




