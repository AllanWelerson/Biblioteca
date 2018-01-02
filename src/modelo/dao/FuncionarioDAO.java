/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Funcionario;

/**
 *
 * @author allan
 */
public class FuncionarioDAO {
    
    
    public boolean creat(Funcionario func){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String SQL = "INSERT INTO funcionario (nome_funcionario,login_funcionario,senha_funcionario) VALUES (?,?,?)";
        boolean check = false;
        
        try{
            
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, func.getNome());
            stmt.setString(2, func.getLogin());
            stmt.setString(3, func.getSenha());
            stmt.executeUpdate();
            check = true;
            
        }catch(SQLException e){
            System.out.println("Erro = " + e );
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
        
        
        return check;
        
    }
    
    
    public List<Funcionario> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        String SQL = "SELECT * FROM funcionario";
        
        List<Funcionario> funcionarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement(SQL);
            rs = stmt.executeQuery();
            while(rs.next()){
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome_funcionario"));
                f.setLogin(rs.getString("login_funcionario"));
              //f.setSenha(rs.getString("senha_funcionario"));
                funcionarios.add(f);
            }
            
            
        }catch(SQLException e){
            System.out.println("Erro = " + e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return funcionarios;
    }
    
   public Funcionario readUm(Funcionario func){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        String SQL = "SELECT * FROM funcionario WHERE login_funcionario = ? or id_funcionario = ?";
        
        Funcionario f = new Funcionario();
        
        try{
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, func.getLogin());
            stmt.setInt(2, func.getId());
            rs = stmt.executeQuery();
            while(rs.next()){
                
                f.setId(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome_funcionario"));
                f.setLogin(rs.getString("login_funcionario"));
                f.setSenha(rs.getString("senha_funcionario"));
                
            }
            
            
        }catch(SQLException e){
            System.out.println("Erro = " + e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return f;
        
    }
    
    
    public boolean update(Funcionario f){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        String SQL = "UPDATE funcionario SET "
                + " nome_funcionario = ?, "
                + " login_funcionario = ?, "
                + " senha_funcionario = ? "
                + " WHERE id_funcionario = ?";
        boolean check = false;
        
        
        try{
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getLogin());
            stmt.setString(3, f.getSenha());
            stmt.setInt(4, f.getId());
            stmt.executeUpdate();
            check = true;
                       
        }catch(SQLException e){
            System.out.println("Erro = " + e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return check;
        
    }
    
}
