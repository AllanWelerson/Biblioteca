package modelo.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Livro;
import modelo.bean.Setor;

public class LivroDAO {
    
    // acesso ao dao da class Setor
    SetorDAO setorDAO = new SetorDAO();
    
    
    public boolean create(Livro l){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        boolean check = false;
        String SQL = "INSERT INTO livros "
                + "(descricao_livro,codigo_livro,pag_livro,status_livro,setor_id_setor)"
                + " VALUES (?,?,?,?,?)";
        
        try{
            
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, l.getDescricao());
            stmt.setString(2, l.getCodigo());
            stmt.setInt(3, l.getPag());
            stmt.setString(4, l.getStatus());
            stmt.setInt(5, l.getSetor().getId());
            stmt.executeUpdate();
            
            check = true;
            
        }catch(SQLException ex){
            System.out.println("Erro = " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return check;
    }
    
    
    public List<Livro> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM livros";
        
        List<Livro> livros = new ArrayList<>();
        
        try{
            
            stmt = con.prepareStatement(SQL);
            rs = stmt.executeQuery();
            while(rs.next()){
                Livro livro = new Livro();
                livro.setId(rs.getInt("id_livro"));
                livro.setDescricao(rs.getString("descricao_livro"));
                livro.setCodigo(rs.getString("codigo_livro"));
                livro.setPag(rs.getInt("pag_livro"));
                livro.setStatus(rs.getString("status_livro"));                
                livro.setSetor(setorDAO.readForId(rs.getInt("setor_id_Setor")));      
                livros.add(livro);
            }
            
        }catch(SQLException ex){
            System.out.println("Erro = " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return livros;
        
    }
    
    
    public List<Livro> readForDesc(String desc){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        String SQL = "SELECT * FROM livros WHERE descricao_livro LIKE ? or codigo_livro = ?";
        
        List<Livro> livros = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, "%" + desc + "%");
            stmt.setString(2, desc);
            rs = stmt.executeQuery();
            
            while(rs.next()){
            Livro livro = new Livro();
            livro.setId(rs.getInt("id_livro"));
            livro.setDescricao(rs.getString("descricao_livro"));
            livro.setCodigo(rs.getString("codigo_livro"));
            livro.setPag(rs.getInt("pag_livro"));
            livro.setStatus(rs.getString("status_livro"));
            livro.setSetor(setorDAO.readForId(rs.getInt("setor_id_setor")));
            
            livros.add(livro);
            }
                  
            
        }catch(SQLException ex){
            System.out.println("Erro na pesquisa " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return livros;
        
    }
    
    
    public Livro readForCod(int cod){
        Livro livro = new Livro();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM livros WHERE id_livro = ?";
        
        try{
            stmt = con.prepareStatement(SQL);
            stmt.setInt(1, cod);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                livro = new Livro();
                livro.setId(rs.getInt("id_livro"));
                livro.setDescricao(rs.getString("descricao_livro"));
                livro.setCodigo(rs.getString("codigo_livro"));
                livro.setPag(rs.getInt("pag_livro"));
                livro.setStatus(rs.getString("status_livro"));
                livro.setSetor(setorDAO.readForId(rs.getInt("setor_id_setor")));
                
            }
            
        }catch(SQLException ex){
            System.out.println("Erro na pesquisa = " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        return livro;
    }
    
    
    public boolean update(Livro livro){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        boolean check = false;
        String SQL = "UPDATE livros SET"
                + " descricao_livro = ?,"
                + "codigo_livro = ?,"
                + "pag_livro = ?,"
                + "status_livro = ?,"
                + "setor_id_setor = ?"
                + " WHERE id_livro = ?";
        
        try{
            
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, livro.getDescricao());
            stmt.setString(2, livro.getCodigo());
            stmt.setInt(3, livro.getPag());
            stmt.setString(4, livro.getStatus());
            stmt.setInt(5, livro.getSetor().getId());
            stmt.setInt(6, livro.getId());
            stmt.executeUpdate();
                        
            stmt.executeUpdate();
            check = true;
            
        }catch(SQLException ex){
            System.out.println("Erro no update " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return check;
        
        
    }
    
    
    
}