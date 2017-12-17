/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Cliente;
import modelo.dao.ClienteDAO;

/**
 *
 * @author allan
 */
public class ListaCliente extends javax.swing.JDialog {

    /**
     * Creates new form CadastrarLivro
     */
    public ListaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        readTable();
        txtId.setEnabled(false);
        //desabilitaCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jbPesquisa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JComboBox<>();
        jbEditarCliente = new javax.swing.JButton();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Livro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Clientes");

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Login", "Status", "telefone", "cpf", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtClienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        jLabel6.setText("Nome");

        jLabel7.setText("CPF");

        jLabel8.setText("Telefone");

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        jbPesquisa.setText("Pesquisar");
        jbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisaActionPerformed(evt);
            }
        });

        jLabel2.setText("Login");

        jLabel3.setText("Senha Antiga ou Nova");

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jLabel4.setText("Status");

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        jbEditarCliente.setText("Salvar Alterações");
        jbEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarClienteActionPerformed(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbPesquisa)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(439, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEditarCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(txtCpf)
                                    .addComponent(txtTelefone))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLogin)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisa))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEditarCliente)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaActionPerformed
        
        readTableForDesc(txtPesquisa.getText());
        
    }//GEN-LAST:event_jbPesquisaActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        
        
        
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            readTableForDesc(txtPesquisa.getText());
        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
        moveDates();
    }//GEN-LAST:event_jtClienteMouseClicked

    private void jtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtClienteKeyReleased
        moveDates();
    }//GEN-LAST:event_jtClienteKeyReleased

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void jbEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarClienteActionPerformed
       
        
        //=====================
        //=====================
        //=====================
        
       if(verificaCampos()){
           
           Cliente cliente = new Cliente();
           cliente.setNome(txtNome.getText());
           cliente.setCpf(trataCampos(txtCpf.getText()));
           cliente.setTelefone(trataCampos(txtTelefone.getText()));
           cliente.setLogin(txtLogin.getText());
           cliente.setId(Integer.parseInt(txtId.getText()));
           cliente.setSenha(new String(txtSenha.getPassword()));
           cliente.setStatus((String)txtStatus.getSelectedItem());
           
           System.out.println(cliente.getNome());
           
           ClienteDAO dao = new ClienteDAO();
           if(dao.update(cliente)){
               JOptionPane.showMessageDialog(null, "Atualizado com sucesso!","Atualizar Cliente", JOptionPane.INFORMATION_MESSAGE);
               limpaCampos();
               readTable();
           }else{
               JOptionPane.showMessageDialog(null, "Erro ao atualizar","Atualizar Cliente",JOptionPane.ERROR_MESSAGE);
           }
           
       }
        
        
    }//GEN-LAST:event_jbEditarClienteActionPerformed

    
    public void readTableForDesc(String desc){
        
        DefaultTableModel modelo = (DefaultTableModel) jtCliente.getModel();
        modelo.setNumRows(0);
        ClienteDAO Cdao = new ClienteDAO();
        
        for(Cliente c: Cdao.readForDesc(desc)){
            modelo.addRow(new Object[]{c.getNome(),c.getLogin(),c.getStatus(),c.getTelefone(),c.getCpf(),c.getId()});
        }
        
    }
    
    public void readTable(){
        
        DefaultTableModel modelo = (DefaultTableModel) jtCliente.getModel();
        modelo.setNumRows(0);
        ClienteDAO Cdao = new ClienteDAO();
        
        for(Cliente c: Cdao.read()){
            modelo.addRow(new Object[]{c.getNome(),c.getLogin(),c.getStatus(),c.getTelefone(),c.getCpf(),c.getId()});
        }
        
    }
    
    
    public void moveDates(){
        
        if(jtCliente.getSelectedRow() != -1){
            
            txtNome.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 0).toString());
            txtLogin.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 1).toString());
            txtTelefone.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(),3).toString());
            txtCpf.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(),4).toString());
            txtId.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(),5).toString());
           
            if((jtCliente.getValueAt(jtCliente.getSelectedRow(),2).toString()).equals("ativo") || 
                 (jtCliente.getValueAt(jtCliente.getSelectedRow(),2).toString()).equals("Ativo")   ){
            txtStatus.setSelectedIndex(0);
            

            
            
        }else{
            txtStatus.setSelectedIndex(1);  
            }
            
            
            
        }
    }
    
    
    public void limpaCampos(){
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtSenha.setText("");
        txtLogin.setText("");
        txtId.setText("");
    }
    
    public void desabilitaCampos(){
        
        txtNome.setEnabled(false);
        txtCpf.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtSenha.setEnabled(false);
        txtStatus.setEnabled(false);
        txtLogin.setEnabled(false);
        
    }
    
    public void habilitaCampos(){
        
        txtNome.setEnabled(true);
        txtCpf.setEnabled(true);
        txtTelefone.setEnabled(true); 
        txtSenha.setEnabled(true);
        txtStatus.setEnabled(true);
        txtLogin.setEnabled(true);
        
               
    }
    
    
    public String trataCampos(String txt){
        return txt.replace("(", "").replace(")", "").replace("-", "").replace(".", "").trim();
    }
    
    public boolean verificaCampos(){
        if (txtNome.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campos Invalidos", JOptionPane.WARNING_MESSAGE);
            txtNome.grabFocus();
            return false;
        }else if(trataCampos(txtCpf.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campos Invalidos", JOptionPane.WARNING_MESSAGE);
            txtCpf.grabFocus();
            return false;
        }else if(txtLogin.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campos Invalidos", JOptionPane.WARNING_MESSAGE);
            txtLogin.grabFocus();
            return false;
        }else if(txtSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campos Invalidos", JOptionPane.WARNING_MESSAGE);
            txtSenha.grabFocus();
            return false;
        }else if(trataCampos(txtTelefone.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campos Invalidos", JOptionPane.WARNING_MESSAGE);
            txtTelefone.grabFocus();
            return false;
        }        
        else{
            return true;
        }
    }
    
    
    // ======================================================================================================
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } */
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaCliente dialog = new ListaCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditarCliente;
    private javax.swing.JButton jbPesquisa;
    private javax.swing.JTable jtCliente;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JComboBox<String> txtStatus;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
