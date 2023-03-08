<%-- 
    Document   : index
    Created on : 06-mar-2023, 20:33:27
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ciudades</title>
    </head>
    <body>
        <h1>Hola!</h1>
        <form action="ServerControlador">
            Busca una ciudad:
            <input type="text" name="nombreCiudad" id="nombreCiudad" value="${nombreCiudad}" required/>
            <input type="submit" value="Buscar"/>
            <input type="hidden" value="buscarCiudad" name="operacion"/>
        </form>
   <!-- <c:if test="${listadoCiudades.size()!=null}">
        <div>
            <h1>Información</h1>
            <table>
                <tr>
                    <td>Id</td>
                    <td>Nombre</td>
                    <td>Codigo del pais</td>
                    <td>Habitantes</td>
                    <td>Distrito</td>
                </tr>
                <tr>
                    <td><c:out value="${ciudad.getId}"></c:out></td>
                    <td><c:out value="${ciudad.getName}"></c:out></td>
                    <td><c:out value="${ciudad.getCountrycode}"></c:out></td>
                    <td><c:out value="${ciudad.getPopulation}"></c:out></td>
                    <td><c:out value="${ciudad.getDistrict}"></c:out></td>
                </tr>
            </table>
        </div>
    </c:if>-->
</body>
</html>
