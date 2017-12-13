/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import javax.swing.JOptionPane;
import modelo.bean.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author allan
 */
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
    }

    @Test
    @Ignore
    public void testSomeMethod() {
    }
    
    
    @Test
    public void creat(){
        Cliente cliente  = new Cliente("Ichigo", "12312312312", "1212121212", "1", "ichigo", "ativo");
        ClienteDAO dao = new ClienteDAO();
       
        for(Cliente c: dao.read() ){
            System.out.println("nome " + c.getNome() + "status " + c.getStatus());
        }
        
    }
    
}
