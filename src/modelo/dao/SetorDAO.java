package modelo.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Setor;

public class SetorDAO {
    
    
    public boolean Create (Setor setor){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        boolean check = false;
        String SQL = "INSERT INTO setor (descricao_setor) VALUES (?)";
        
        try{
            
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, setor.getDescricao());
            stmt.executeUpdate();
            
            check = true;
            
        }catch(SQLException ex){
            System.out.println("Erro ao salvar = " + ex);
        }   finally{
            ConnectionFactory.closeConnection(con, stmt);
        }    
        
        
        return check;
    }
    
    
    
    public List<Setor> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM setor";
        
        List<Setor> setores = new ArrayList<>();
        
        
        try{
            
            stmt = con.prepareStatement(SQL);
            rs = stmt.executeQuery();
            while(rs.next()){
             
                Setor setor = new Setor();
                setor.setId(rs.getInt("id_setor"));
                setor.setDescricao(rs.getString("descricao_setor"));
                setores.add(setor);
                
            }            
            
        }catch(SQLException ex){
            System.out.println("Erro ao pesquisar = " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return setores;
        
    }
    
    public List<Setor> readForDesc(String desc){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM setor WHERE descricao_setor LIKE ?";
        
        List<Setor> setores = new ArrayList<>();
        
        try{
            
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while(rs.next()){
                Setor setor = new Setor();
                setor.setId(rs.getInt("id_setor"));
                setor.setDescricao(rs.getString("descricao_Setor"));
                setores.add(setor);
            }
            
        }catch(SQLException ex){
            System.out.println("Erro ao pesquisar = " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return setores;
        
    }
    
    
     
    
    public Setor readForId(int id){
        Setor setor = new Setor();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM setor WHERE id_setor = ?";
        
        
        
        try{
            
            stmt = con.prepareStatement(SQL);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while(rs.next()){
                setor = new Setor();
                setor.setId(rs.getInt("id_setor"));
                setor.setDescricao(rs.getString("descricao_setor"));
                
            }
            
        }catch(SQLException ex){
            System.out.println("Erro ao pesquisar = " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return setor;
        
    }
    public boolean update(Setor setor){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        boolean check = false;
        String SQL = "UPDATE setor SET "
                + "descricao_setor = ?"
                + "WHERE id_setor = ?";
        
        
        try{
            
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, setor.getDescricao());
            stmt.setInt(2, setor.getId());
            stmt.executeUpdate();
            
            check = true;
            
        }catch(SQLException ex){
            System.out.println("Erro ao Atualizar = " + ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
        }
        
        return check;
        
    }
    
    
    
}