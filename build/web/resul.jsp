<%@page import="java.util.List"%>
<%@page import="Pessoas.Mulher"%>
<%@page import="produtoDao.produtoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Da Pesquisa</title>
    </head>
    <body>
        <form>
            <table align="center" border="1px" width="90%">
                <h1 align="center">Tabela De Dados Da Pesquisa</h1>
                <tr>
                    <th>Codigo</th>
                    <th>Nome</th>
                    <th>Idade</th>
                    <th>Data da ultima menstruação</th>
                    <th>Tipo de ciclo</th>
                    <th>Data da proxima menstruação</th>
                </tr>
                <%
                    produtoDao dao = new produtoDao();
                    List<Mulher> mulheres = dao.getLista();
                    for (Mulher mulher : mulheres) {
                %>
                <tr>
                    <td align="center"><%=mulher.getCodigo()%></td>
                    <td align="center"><%=mulher.getNome()%></td>
                    <td align="center"><%=mulher.getIdade()%></td>
                    <td align="center"><%=mulher.getData()%></td>
                    <td align="center"><%=mulher.getCiclo()%></td>
                    <td align="center"><%=mulher.getDataFinal()%></td>
                </tr>

                <%
                    }
                %>
            </table>
        </form>
        <input type="button" value="Voltar" onClick="history.go(-1)">
    </body>
</html>
