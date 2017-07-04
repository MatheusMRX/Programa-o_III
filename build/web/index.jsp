<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <div id="conteiner">
            <h1 align="center">Cadastro</h1>
            <form action="MyServlet" method="POST" align="center">
                <table align="center">
                    <tr>
                        <td align="left">Nome:</td>
                        <td align="left"><input type="text" name="nome"/></td>
                    </tr>
                    <tr>
                        <td align="left">Idade:</td>
                        <td align="left"><input type="number" name="idade" max="120" min="1"/></td>
                    </tr>
                    <tr>
                        <td align="left">Tipo de ciclo:</td>
                        <td align="left">
                            <select name="tipo">
                                <option value="Regular">Regular</option>
                                <option value="Irregular">Irregular</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td align="left">Data da ultima mestruação:</td>
                        <td align="left"><input type="date" name="data"/></td>
                    </tr>

                </table>
                <br><input type="submit" value="Gravar"/>
            </form>
            <form action="resul.jsp" align="center">
                <input type="submit" value="Resultados" />
            </form>
            <footer><br><br>Matheus</footer>
        </div>
    </body>
</html>
