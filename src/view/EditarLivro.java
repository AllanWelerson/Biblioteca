/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import modelo.bean.Livro;
import modelo.bean.Setor;
import modelo.dao.LivroDAO;
import modelo.dao.SetorDAO;

/**
 *
 * @author allan
 */
public class EditarLivro extends javax.swing.JDialog {

    /**
     * Creates new form CadastrarLivro
     */
    
   
    
    public EditarLivro(java.awt.Frame parent, boolean modal, Livro livro) {
        super(parent, modal);
        initComponents();
        popularComboBox();
        setValues(livro);
        txtId.setEnabled(false);
        
        
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
        txtDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JFormattedTextField();
        jcStatus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcSetor = new javax.swing.JComboBox<>();
        jbAlterarLivro = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Livro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Editar Livro");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        jLabel3.setText("Codigo");

        jLabel4.setText("Quantidade de Paginas");

        try {
            txtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########(10)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jcStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo", "Emprestado", " " }));

        jLabel5.setText("Status");

        jLabel6.setText("Tipo");

        jbAlterarLivro.setBackground(new java.awt.Color(102, 102, 255));
        jbAlterarLivro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbAlterarLivro.setForeground(new java.awt.Color(255, 255, 255));
        jbAlterarLivro.setText("Salvar Alterações");
        jbAlterarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarLivroActionPerformed(evt);
            }
        });

        jLabel7.setText("Id");

        txtQtd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAlterarLivro))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(212, 212, 212)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(89, 89, 89)))
                                    .addGap(6, 6, 6))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jcStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterarLivro)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    
    public String trataCampos(String txt){
        return txt.replace(",", "").replace(".", "").replace("(10)", "").replace("(", "").replace(")", "").trim();
    }
    
    public boolean verificaCampos(){
        if (!trataCampos(txtCodigo.getText()).equals("") && !txtDescricao.getText().equals("") && !trataCampos(txtQtd.getText()).equals("") ){
            return true; 
        }else if(txtDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campos Invalidos", JOptionPane.WARNING_MESSAGE);
            txtDescricao.grabFocus();
            return false;
        }else if(trataCampos(txtCodigo.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campos Invalidos", JOptionPane.WARNING_MESSAGE);
            txtCodigo.grabFocus();
            return false;
        }else if(trataCampos(txtQtd.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campos Invalidos", JOptionPane.WARNING_MESSAGE);
            txtQtd.grabFocus();
            return false;
        }else{
            return false;
        }
    }
    
    
    private void jbAlterarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarLivroActionPerformed
       
        if(verificaCampos()){
        
        Livro l = new Livro();
        l.setId(Integer.parseInt(txtId.getText()));
        l.setDescricao(txtDescricao.getText());
        l.setCodigo(trataCampos(txtCodigo.getText()));
        l.setPag(Integer.parseInt(trataCampos(txtQtd.getText())));
        l.setStatus((String)jcStatus.getSelectedItem());
        
        int setorId = jcSetor.getSelectedIndex();
        Setor s = new Setor();
        
        s = (Setor) jcSetor.getItemAt(setorId);
        
        l.setSetor(s);
        
        LivroDAO Ldao = new LivroDAO();
        if (Ldao.update(l)){
            JOptionPane.showMessageDialog(null, "Livro Alterado com sucesso!", "Cadastro!", JOptionPane.PLAIN_MESSAGE);
            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Livro!", "Cadastro!", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        }        
        
        
        
    }//GEN-LAST:event_jbAlterarLivroActionPerformed

    
    
    
    private void popularComboBox(){
        
        jcSetor.removeAllItems();
        SetorDAO setorDAO = new SetorDAO();
        
       for(Setor s: setorDAO.read()){
           jcSetor.addItem(s);
       }
        
    }
    
    public void setValues(Livro livro){
        
        txtDescricao.setText(livro.getDescricao());
        txtCodigo.setText(livro.getCodigo());
        txtQtd.setText(String.valueOf(livro.getPag()).toString()); 
        txtId.setText(String.valueOf(livro.getId()).toString());
        
               
        if(livro.getStatus().equals("Ativo")){
            jcStatus.setSelectedIndex(0);
        }else if(livro.getStatus().equals("Inativo")){
            jcStatus.setSelectedIndex(1);
        }else if(livro.getStatus().equals("Emprestado")){
            jcStatus.setSelectedIndex(2);
        }
               
        for(int i = 0; i < jcSetor.getItemCount(); i++){
            
            Setor s = new Setor();
            s = (Setor) jcSetor.getItemAt(i);
            
            if (livro.getSetor().getId() == s.getId() ){
                
                jcSetor.setSelectedIndex(i);
            }
        }
        
    }
    
    
    
    
    
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
                
                Livro livro = new Livro();
                
                EditarLivro dialog = new EditarLivro(new javax.swing.JFrame(), true,livro);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAlterarLivro;
    private javax.swing.JComboBox<Object> jcSetor;
    private javax.swing.JComboBox<String> jcStatus;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JFormattedTextField txtQtd;
    // End of variables declaration//GEN-END:variables




}