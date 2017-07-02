package servlet;

import produtoDao.produtoDao;
import java.io.IOException;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Pessoas.Mulher;

@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");
        String ciclo = request.getParameter("tipo");
        String data = request.getParameter("data");
        
        Mulher a = new Mulher();
        
        a.setNome(nome);
        a.setIdade(idade);
        a.setData(data);
        a.setCiclo(ciclo);
        a.setDataFinal(data);

        produtoDao dao = new produtoDao();
        dao.Criar(a);

        //Metodo tranformar data
        Integer ano = new Integer(data.substring(0, 4));
        Integer mes = new Integer(data.substring(5, 7));
        Integer dia = new Integer(data.substring(8, 10));

        Calendar calendario = Calendar.getInstance();
        calendario.set(ano, mes, dia);
        String dataFinal = null;
        
        if (a.getCiclo().equals("Regular")) {
            calendario.add(calendario.DATE, 28);
            int Ano = calendario.get(Calendar.YEAR);
            int Mes = calendario.get(Calendar.MONTH);
            int Dia = calendario.get(Calendar.DAY_OF_MONTH);

            dataFinal = (Dia + "/" + Mes + "/" + Ano);

        }

        a.setDataFinal(dataFinal);
        if(ciclo.equals("Irregular")) { 
            calendario.add(calendario.DATE, 26);
            int Ano = calendario.get(Calendar.YEAR);
            int Mes = calendario.get(Calendar.MONTH);
            int Dia = calendario.get(Calendar.DAY_OF_MONTH);
            
            dataFinal = (Dia + "/" + Mes + "/" + Ano);
        }
        
        System.out.println("Gravado");

    }

}
