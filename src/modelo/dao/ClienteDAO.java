package modelo.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.bean.Cliente;

public class ClienteDAO {
    
    
    
    public boolean creat (Cliente cliente){
        
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        boolean check = false;
        String SQL = "INSERT INTO clientes "
                + "(nome_cliente,cpf_cliente,telefone_cliente,senha_cliente,login_cliente,status_cliente)"
                + " VALUES (?,?,?,?,?,?)";
        
        
        try{
            
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getSenha());
            stmt.setString(5, cliente.getLogin());
            stmt.setString(6, cliente.getStatus());
            
            stmt.executeUpdate();
            check = true;
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Salvar", "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
      
        return check;
          
    }
    
    
    public List<Cliente> read(){
        
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM clientes";
        
        List<Cliente> clientes = new ArrayList<>();
        
        try{
            
            stmt = con.prepareStatement(SQL);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome_cliente"));
                cliente.setCpf(rs.getString("cpf_cliente"));
                cliente.setLogin(rs.getString("login_cliente"));
                cliente.setSenha(rs.getString("senha_cliente"));
                cliente.setStatus(rs.getString("status_cliente"));
                cliente.setTelefone(rs.getString("telefone_cliente"));
                clientes.add(cliente);
            }
            
        }catch(SQLException ex){
            System.out.println("Erro na leitura dos dados " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return clientes;
        
    }
    
    
    public List<Cliente> readForDesc(String desc){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM clientes where nome_cliente LIKE ? or cpf_cliente LIKE ? or status_cliente LIKE ? ";
        
        List<Cliente> clientes = new ArrayList<>();
        
        try{
            
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, "%" + desc + "%");
            stmt.setString(2, "%" + desc + "%");
            stmt.setString(3, "%" + desc + "%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome_cliente"));
                cliente.setCpf(rs.getString("cpf_cliente"));
                cliente.setLogin(rs.getString("login_cliente"));
                cliente.setSenha(rs.getString("senha_cliente"));
                cliente.setStatus(rs.getString("status_cliente"));
                cliente.setTelefone(rs.getString("telefone_cliente"));
                clientes.add(cliente);
            }
            
        }catch(SQLException ex){
            System.out.println("Erro " + ex);
        }
        
        
        return clientes;
    }
    
    
    public boolean update(Cliente cliente){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        boolean result = false;
        
        String SQL = "UPDATE clientes SET "
                + "nome_cliente = ?,"
                + "cpf_cliente = ?,"
                + "telefone_cliente = ?,"
                + "senha_cliente = ?,"
                + "login_cliente = ?,"
                + "status_cliente = ?"
                + "WHERE id_cliente = ? ";
        
        try{
            
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getSenha());
            stmt.setString(5, cliente.getLogin());
            stmt.setString(6, cliente.getStatus());
            stmt.setInt(7, cliente.getId());
            stmt.executeUpdate();
            
            result = true;
            
            
        }catch(SQLException ex){
            System.out.println("Erro " + ex);
        }
        
        return result;
    } 
    
    
}