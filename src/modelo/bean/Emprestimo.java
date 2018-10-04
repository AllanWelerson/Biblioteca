/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bean;

/**
 *
 * @author allan
 */
public class Emprestimo {
    
    private int id_emprestimo;
    private String data_inicio;
    private String data_fim;
    private Cliente cliente;
    private Livro livro;
    private String Status;

    

    public Emprestimo(int id_emprestimo, String data_inicio, String data_fim, Cliente cliente, Livro livro) {
        this.id_emprestimo = id_emprestimo;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.cliente = cliente;
        this.livro = livro;
    }
    
    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Emprestimo() {
    }
    

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public String getData_inicio_sql(){
        
        String day = data_inicio.substring(0, 2); 
        String month = data_inicio.substring(3, 5);
        String year = data_inicio.substring(6);
        
        
        this.data_inicio = year + "-" + month + "-" + day;
        return data_inicio;
    }
    
    public String getData_fim_sql(){
        
        String day = data_fim.substring(0, 2); 
        String month = data_fim.substring(3, 5);
        String year = data_fim.substring(6);
        
        
        this.data_fim = year + "-" + month + "-" + day;
        return data_fim;
    }
    
    public void setData_inicio_fromSql(String date){
        
        String year = date.substring(0, 4); 
        String month = date.substring(5, 7);
        String day = date.substring(8);
        
        
        this.data_inicio = day + "/" + month + "/" + year;
    
      
    }
    
    public void setData_fim_fromSql(String date){
        
        String year = date.substring(0, 4); 
        String month = date.substring(5, 7);
        String day = date.substring(8);
        
        
        this.data_fim = day + "/" + month + "/" + year;
        
    }
    
    
}
