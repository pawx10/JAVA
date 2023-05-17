<%-- 
    Document   : dialogo
    Created on : 15 may. 2023, 20:57:04
    Author     : arroy
--%>

<%@page import="daw1.Gato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Aguas con clase y sin bocadillos</title>
    <link rel="stylesheet" type="text/css" href="estilos.css" />
    <link rel="stylesheet" type="text/css" href="text-styles.css" />
</head>
<body>
<%
String nombre1 = request.getParameter("nombre1");
String nombre2 = request.getParameter("nombre2");
String nombre3 = request.getParameter("nombre3");

Gato g1 = new Gato(nombre1, "lanjaron.jpg");
Gato g2 = new Gato(nombre2, "cruzcampo.jpg");
Gato g3 = new Gato(nombre3, "bezoya.jpg");

String[] bocadillos = {
    "¡Hola a todos!",
    "¡Cruzcampo > Victoria!",
    "¿Alguien quiere beber?",
    "¡Me encanta el agua!"
};

out.println(g1);
out.println(g2);
out.println(g3);
out.println(g1.habla());
out.println(g2.bebe("agua"));
out.println(g3.habla());

for (int i = 0; i < 3; i++) {
    Gato gatoAleatorio = null;
    String gatoClass = ""; // Variable para almacenar la clase CSS del gato
    
    int numeroAleatorio = (int) (Math.random() * 3) + 1;
    
    switch (numeroAleatorio) {
        case 1:
            gatoAleatorio = g1;
            gatoClass = "gato1"; // Clase CSS para el primer gato
            break;
        case 2:
            gatoAleatorio = g2;
            gatoClass = "gato2"; // Clase CSS para el segundo gato
            break;
        case 3:
            gatoAleatorio = g3;
            gatoClass = "gato3"; // Clase CSS para el tercer gato
            break;
    }

    out.println("<div class=\"accionmarca\">");
    out.println("<img src=\"" + gatoAleatorio.getImagen() + "\" width=\"80\">");
    out.println("<div class=\"arow_box " + gatoClass + "\">&nbsp;" + bocadillos[(int) (Math.random() * bocadillos.length)] + "&nbsp;</div>");
    out.println("</div>");
}

%>
</body>
</html>




