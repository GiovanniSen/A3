
package bancodados;

import java.sql.*;

public class DAO {
    private String usuario = "root";
    private String senha = "root";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "bdcopa";
    public Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd+"?useTimezone=true&serverTimezone=UTC", usuario, senha);
            System.out.println("Banco Conectado com Sucesso!!!!");
            return c;
        }
        catch (Exception e){
            System.out.println("Banco NAO Conectado!!!!");
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String [] args)
    {
       DAO factory = new DAO();
       factory.obtemConexao();
    }
}
