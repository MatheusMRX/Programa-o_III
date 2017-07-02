package produtoDao;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Pessoas.Mulher;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class produtoDao {

    public void Criar(Mulher a) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("INSERT INTO resultado(nome,idade,data,ciclo,data_final)VALUES(?,?,?,?,?)");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getIdade());
            stmt.setString(3, a.getData());
            stmt.setString(4, a.getCiclo());
            stmt.setString(5, a.getDataFinal());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao Grava" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Mulher> getLista() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Mulher> mulheres = new ArrayList<>();

        try {
            
            stmt = con.prepareStatement("SELECT * FROM resultado");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Mulher mulher = new Mulher();
                
                mulher.setCodigo(rs.getString("codigo"));
                mulher.setNome(rs.getString("nome"));
                mulher.setIdade(rs.getString("idade"));
                mulher.setData(rs.getString("data"));
                mulher.setCiclo(rs.getString("ciclo"));
                mulher.setDataFinal(rs.getString("data_final"));              
                mulheres.add(mulher);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(produtoDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return mulheres;

    }
}
