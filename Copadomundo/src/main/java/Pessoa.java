/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo Duduchi
 */

import bancodados.DAO;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;
    //getters/setters
    public void inserir (){
        //1: Definir o comando SQL
        String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
        //2: Abrir uma conexão
        DAO factory = new DAO();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            //5: Executa o comando
            ps.execute();
        }
        catch (Exception e){
            e.printStackTrace();

        }    
    }    
    public void atualizar (){
        //1: Definir o comando SQL
        String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE codigo = ?";
        //2: Abrir uma conexão
        DAO factory = new DAO();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);
            //5: Executa o comando
            ps.execute();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }                   
    public void apagar (){
        //1: Definir o comando SQL
        String sql = "DELETE FROM tb_pessoa WHERE codigo = ?";
        //2: Abrir uma conexão
        DAO factory = new DAO();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setInt(1, codigo);
            //5: Executa o comando
            ps.execute();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void listar (){
        //1: Definir o comando SQL
        String sql = "SELECT * FROM tb_pessoa";
        //2: Abrir uma conexão
        DAO factory = new DAO();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Executa o comando e guarda
            //o resultado em um ResultSet
            ResultSet rs = ps.executeQuery();
            //5: itera sobre o resultado
            String aux = "";
            while (rs.next()){
                int sCodigo = rs.getInt("codigo");
                String sNome = rs.getString("nome");
                String sFone = rs.getString("fone");
                String sEmail = rs.getString("email");
                aux = aux + String.format("Código: %d, Nome: %s, Fone: %s, Email: %s", sCodigo, sNome, sFone, sEmail ) +"\n";
                //JOptionPane.showMessageDialog (null, aux);
            }
            JOptionPane.showMessageDialog (null, aux);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}