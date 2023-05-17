<%-- 
    Document   : index
    Created on : 17 may. 2023, 15:26:07
    Author     : arroy
--%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tres en raya</title>
<link rel="stylesheet" type="text/css" href="estilo.css">
<style>
td {
    border: lightgray solid 1px;
    width: 100px;
    height: 100px;
    text-align: center;
}

img {
    width: 80px;
    height: 80px;
    padding: 10px;
}
</style>
</head>
<body>
<table>
<%
String[][] n = new String[3][3];
int circulos = 0;
int cruces = 0;
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        n[i][j] = "vacio";
    }
}

while (circulos < 3) {
    int i = (int) (Math.random() * 3);
    int j = (int) (Math.random() * 3);
    if (n[i][j].equals("vacio")) {
        n[i][j] = "circulo";
        circulos++;
    }
}

while (cruces < 3) {
    int i = (int) (Math.random() * 3);
    int j = (int) (Math.random() * 3);
    if (n[i][j].equals("vacio")) {
        n[i][j] = "cruz";
        cruces++;
    }
}

for (int i = 0; i < 3; i++) {
%>
    <tr>
    <%
    for (int j = 0; j < 3; j++) {
    %>
        <td><img src="img/<%= n[i][j] %>.jpg"></td>
    <%
    }
    }
%>
    </tr>
</table>
</body>
</html>


