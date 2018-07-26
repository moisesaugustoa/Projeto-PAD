
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FabricaConexao {
    public static Connection conexao(){
        Connection con = null;
        try {
            //fazendo a chamada para carregar o drive do MySql
            Class.forName("com.mysql.jdbc.Driver");
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String url = ("jdbc:mysql://192.168.15.6/biblioteca");
            //estabelecendo conexão com o caminho, usuário e senha
            con = DriverManager.getConnection(url, "root", "admpmoises");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
