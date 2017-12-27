package modelo.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Cliente;
import modelo.bean.Emprestimo;
import modelo.bean.Livro;

public class EmprestimoDAO {
 
    
    public boolean create(Emprestimo emprestimo, Livro l){
        
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        boolean check = false;
        
        String SQL = "INSERT INTO emprestimo "
                + " (data_inicio_emprestimo,data_fim_emprestimo,clientes_id_cliente,livros_id_livros,status_emprestimo)"
                + " VALUES (?,?,?,?,'ativo') ";
        
        try{
            stmt = con.prepareStatement(SQL);
            
            stmt.setString(1, emprestimo.getData_inicio_sql());
            stmt.setString(2, emprestimo.getData_fim_sql());
            stmt.setInt(3, emprestimo.getCliente().getId());
            stmt.setInt(4, emprestimo.getLivro().getId());
            
            LivroDAO ldao = new LivroDAO();
            l.setStatus("emprestado");
            ldao.update(l);
                        
            stmt.executeUpdate();
            check = true;
            
        }catch(SQLException e){
            System.out.println("Erro = " + e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return check;
    }
    
    
    public List<Emprestimo> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM emprestimo";
                
        List<Emprestimo> emprestimos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement(SQL);
            rs = stmt.executeQuery();
            while(rs.next()){
                Emprestimo em = new Emprestimo();
                em.setId_emprestimo(rs.getInt("id_emprestimo"));
                em.setData_inicio_fromSql(rs.getString("data_inicio_emprestimo"));
                em.setData_fim_fromSql(rs.getString("data_fim_emprestimo"));
                //cliente
                Cliente c = new Cliente();
                ClienteDAO cdao = new ClienteDAO();
                c = cdao.readForId(rs.getInt("clientes_id_cliente"));
                em.setCliente(c);
                //livro
                Livro l = new Livro();
                LivroDAO ldao = new LivroDAO();
                l = ldao.readForCod(rs.getInt("livros_id_livros"));
                em.setLivro(l);   
                
                em.setStatus(rs.getString("status_emprestimo"));
                
                emprestimos.add(em);
            }
            
            
        }catch(SQLException e){
            System.out.println("Erro = " + e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return emprestimos;
    }
    
    
    
    public Emprestimo readForLivro(int id_livro){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM emprestimo WHERE livros_id_livros = ?";
                
        Emprestimo em = new Emprestimo();
        
        try{
            stmt = con.prepareStatement(SQL);
            stmt.setInt(1, id_livro);
            rs = stmt.executeQuery();
            while(rs.next()){
                
                em.setId_emprestimo(rs.getInt("id_emprestimo"));
                em.setData_inicio_fromSql(rs.getString("data_inicio_emprestimo"));
                em.setData_fim_fromSql(rs.getString("data_fim_emprestimo"));
                //cliente
                Cliente c = new Cliente();
                ClienteDAO cdao = new ClienteDAO();
                c = cdao.readForId(rs.getInt("clientes_id_cliente"));
                em.setCliente(c);
                //livro
                Livro l = new Livro();
                LivroDAO ldao = new LivroDAO();
                l = ldao.readForCod(rs.getInt("livros_id_livros"));
                em.setLivro(l);        
                
                
            }
            
            
        }catch(SQLException e){
            System.out.println("Erro = " + e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return em;
    }
    
    
    public Emprestimo readForId(int id){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM emprestimo WHERE id_emprestimo = ?";
                
        Emprestimo em = new Emprestimo();
        
        try{
            stmt = con.prepareStatement(SQL);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while(rs.next()){
                
                em.setId_emprestimo(rs.getInt("id_emprestimo"));
                em.setData_inicio_fromSql(rs.getString("data_inicio_emprestimo"));
                em.setData_fim_fromSql(rs.getString("data_fim_emprestimo"));
                //cliente
                Cliente c = new Cliente();
                ClienteDAO cdao = new ClienteDAO();
                c = cdao.readForId(rs.getInt("clientes_id_cliente"));
                em.setCliente(c);
                //livro
                Livro l = new Livro();
                LivroDAO ldao = new LivroDAO();
                l = ldao.readForCod(rs.getInt("livros_id_livros"));
                em.setLivro(l);        
                
                
            }
            
            
        }catch(SQLException e){
            System.out.println("Erro = " + e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return em;
    }
    
    
    
    public boolean update(Emprestimo em){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String SQL = "UPDATE emprestimo SET "
                + " data_inicio_emprestimo = ?,"
                + " data_fim_emprestimo = ?,"
                + " clientes_id_cliente = ?, "
                + " livros_id_livros = ? "
                + " WHERE id_emprestimo = ?";               
        boolean check = false;
        
        try{
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, em.getData_inicio_sql());
            stmt.setString(2, em.getData_fim_sql());
            stmt.setInt(3, em.getCliente().getId());
            stmt.setInt(4, em.getLivro().getId());
            stmt.executeUpdate();
            check = true;
        }catch(SQLException e){
            System.out.println("Erro = " + e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
        return check;
    }
    
    public boolean fimEmprestimo(Emprestimo em){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String SQL = "UPDATE emprestimo SET "
                + " status_emprestimo = ?"
                + " WHERE livros_id_livros = ?";               
        boolean check = false;
        
        try{
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, em.getStatus());
            stmt.setInt(2, em.getLivro().getId());
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