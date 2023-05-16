<%-- 
    Document   : index
    Created on : 16 may. 2023, 19:19:41
    Author     : arroy
--%>

<%@ page import="EJ2.Jugador" %>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Piedra, Papel o Tijera</title>
    <link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>
    <h1>Piedra, Papel o Tijera</h1>

    <%
        Jugador cruzcampo = new Jugador("Cruzcampo");
        Jugador victoria = new Jugador("Victoria");
        Random random = new Random();

        while (cruzcampo.getPuntos() < 5 && victoria.getPuntos() < 5) {
            int cruzcampoJugada = random.nextInt(3);
            int victoriaJugada = random.nextInt(3);

            String cruzcampoJugadaStr = "";
            String victoriaJugadaStr = "";

            switch (cruzcampoJugada) {
                case 0:
                    cruzcampoJugadaStr = "Piedra";
                    break;
                case 1:
                    cruzcampoJugadaStr = "Papel";
                    break;
                case 2:
                    cruzcampoJugadaStr = "Tijeras";
                    break;
            }

            switch (victoriaJugada) {
                case 0:
                    victoriaJugadaStr = "Piedra";
                    break;
                case 1:
                    victoriaJugadaStr = "Papel";
                    break;
                case 2:
                    victoriaJugadaStr = "Tijeras";
                    break;
            }

            String resultado = "";

            if (cruzcampoJugada == victoriaJugada) {
                resultado = "Empate";
            } else if ((cruzcampoJugada == 0 && victoriaJugada == 2) ||
                       (cruzcampoJugada == 1 && victoriaJugada == 0) ||
                       (cruzcampoJugada == 2 && victoriaJugada == 1)) {
                resultado = cruzcampo.getNombre() + " gana";
                cruzcampo.incrementarPuntos();
            } else {
                resultado = victoria.getNombre() + " gana";
                victoria.incrementarPuntos();
            }

            out.println("<div class=\"jugada\">");
            out.println("<div class=\"jugador\"><img src=\"cruzcampo.jpg\" alt=\"Cruzcampo\"></div>");
             out.println("<div class=\"resultado\">" + cruzcampo.getNombre() + ": " + cruzcampoJugadaStr +
                    " vs " + victoria.getNombre() + ": " + victoriaJugadaStr + "</div>");
            out.println("<div class=\"jugador\"><img src=\"victoria.jpg\" alt=\"Victoria\"></div>");
           
            out.println("<div class=\"resultado\">" + resultado + "</div>");
            out.println("</div>");
        }

        if (cruzcampo.getPuntos() == 5) {
    out.println("<h2 class=\"ganador\">" + cruzcampo.getNombre() + " es el ganador!</h2>");
    out.println("<img class=\"celebracion\" src=\"cruzcampo.jpg\" alt=\"Cruzcampo\">");
} else {
    out.println("<h2 class=\"ganador\">" + victoria.getNombre() + " es la ganadora!</h2>");
    out.println("<img class=\"celebracion\" src=\"victoria.jpg\" alt=\"Victoria\">");
}
%>

</body>
</html>





