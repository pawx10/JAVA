<%-- 
    Document   : index
    Created on : 9 may. 2023, 17:54:43
    Author     : arroy
--%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gatos con clase y bocadillos</title>
<link rel="stylesheet" type="text/css" href="estilos.css" />
</head>
<body>
<h1>Gatos con clase</h1>
<hr>
<%
Gato g1 = new Gato("Pepe", "gato.jpg");
Gato g2 = new Gato("Garfield", "garfield.jpg");
Gato g3 = new Gato("Tom", "tom.png");
out.println(g1);
out.println(g2);
out.println(g3);
out.println(g1.maulla());
out.println(g2.come("sardinas"));
%>
</body
>
</html
>






<%
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
return "<div class=\"acciongato\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"ar\
row_box\">&nbsp;Hola, soy " + nombre + "&nbsp;</div></div>";
}
public String maulla() {
return "<div class=\"acciongato\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"ar\
row_box\">&nbsp;Miauuuuuuuu&nbsp;</div></div>";
}
public String come(String comida) {
return "<div class=\"acciongato\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"ar\
row_box\">&nbsp;Estoy comiendo " + comida + "&nbsp;</div></div>";
}
}
%>