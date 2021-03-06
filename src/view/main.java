/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.glass.events.KeyEvent;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Cliente;
import modelo.bean.Emprestimo;
import modelo.bean.Livro;
import modelo.bean.Setor;
import modelo.dao.ClienteDAO;
import modelo.dao.EmprestimoDAO;
import modelo.dao.LivroDAO;
import modelo.dao.SetorDAO;

/**
 *
 * @author allan
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        verificaEmprestimos();
        readTable();
        limpaPastaPdf();
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbAddLivro = new javax.swing.JButton();
        jbEditarLivro = new javax.swing.JButton();
        jbEmprestimo = new javax.swing.JButton();
        jbFinalEmprestimo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLivros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jbExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Biblioteca");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(720, 133));

        jbAddLivro.setBackground(new java.awt.Color(255, 255, 255));
        jbAddLivro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbAddLivro.setForeground(new java.awt.Color(102, 102, 255));
        jbAddLivro.setText("Cadastrar Livro");
        jbAddLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddLivroActionPerformed(evt);
            }
        });

        jbEditarLivro.setBackground(new java.awt.Color(255, 255, 255));
        jbEditarLivro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEditarLivro.setForeground(new java.awt.Color(102, 102, 255));
        jbEditarLivro.setText("Editar Livro");
        jbEditarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarLivroActionPerformed(evt);
            }
        });

        jbEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        jbEmprestimo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEmprestimo.setForeground(new java.awt.Color(102, 102, 255));
        jbEmprestimo.setText("Novo Emprestimo");
        jbEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEmprestimoActionPerformed(evt);
            }
        });

        jbFinalEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        jbFinalEmprestimo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbFinalEmprestimo.setForeground(new java.awt.Color(102, 102, 255));
        jbFinalEmprestimo.setText("Finalizar Emprestimo");
        jbFinalEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAddLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbFinalEmprestimo)
                    .addComponent(jbEditarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbAddLivro, jbEditarLivro, jbEmprestimo, jbFinalEmprestimo});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAddLivro)
                    .addComponent(jbEditarLivro))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFinalEmprestimo)
                    .addComponent(jbEmprestimo))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(720, 379));

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        jbPesquisar.setBackground(new java.awt.Color(102, 102, 255));
        jbPesquisar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jtLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Codigo", "Descrição", "Status", "Qtd Pag", "Setor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLivros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtLivrosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtLivros);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Livros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jbPesquisar)))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPesquisar)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(0, 102, 255));
        jMenu1.setText("File");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jbExit.setText("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });
        jMenu1.add(jbExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Emprestimos");

        jMenuItem2.setText("Listar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Funcionarios");

        jMenuItem4.setText("Listar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem3.setText("Novo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Clientes");

        jMenuItem5.setText("Novo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Listar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Tags");

        jMenuItem7.setText("Novo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Listar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
       
        System.exit(0);
        
    }//GEN-LAST:event_jbExitActionPerformed

    private void jbAddLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddLivroActionPerformed
        
        CadastrarLivro cadLivro = new CadastrarLivro(this, rootPaneCheckingEnabled);
        cadLivro.setVisible(true);
        readTable();
               
    }//GEN-LAST:event_jbAddLivroActionPerformed

    private void jbEditarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarLivroActionPerformed
        
        if(jtLivros.getSelectedRow() != -1){
            Livro livro = new Livro();
            livro.setId(Integer.parseInt(jtLivros.getValueAt(jtLivros.getSelectedRow(), 0).toString()));
            livro.setCodigo(jtLivros.getValueAt(jtLivros.getSelectedRow(), 1).toString());
            livro.setDescricao(jtLivros.getValueAt(jtLivros.getSelectedRow(), 2).toString());
            livro.setStatus(jtLivros.getValueAt(jtLivros.getSelectedRow(), 3).toString());
            livro.setPag(Integer.parseInt(jtLivros.getValueAt(jtLivros.getSelectedRow(), 4).toString()));
            livro.setSetor((Setor)jtLivros.getValueAt(jtLivros.getSelectedRow(), 5));

            
                   
            EditarLivro edLivro = new EditarLivro(this, rootPaneCheckingEnabled, livro);
            edLivro.setVisible(true);
            readTable();
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um livro!","Livros",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jbEditarLivroActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        ListaCliente listaCliente = new ListaCliente(this, rootPaneCheckingEnabled);
        listaCliente.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CadastrarFuncionario cadFunc = new CadastrarFuncionario(this, rootPaneCheckingEnabled);
        cadFunc.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        ListaFuncionario listFunc = new ListaFuncionario(this, rootPaneCheckingEnabled);
        listFunc.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        CadastrarCliente cadCliente = new CadastrarCliente(this, rootPaneCheckingEnabled);
        cadCliente.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        
        readTableForDesc(txtPesquisa.getText());
        
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            readTableForDesc(txtPesquisa.getText());
        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
        CadastraSetor cadSetor = new CadastraSetor(this,rootPaneCheckingEnabled);
        cadSetor.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ListarSetor listSetor = new ListarSetor(this,rootPaneCheckingEnabled);
        listSetor.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jbEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEmprestimoActionPerformed
        
        
        if(jtLivros.getSelectedRow() != -1){
            
            String status = jtLivros.getValueAt(jtLivros.getSelectedRow(),3).toString();
            if(status.equals("ativo") || status.equals("Ativo")){
            
            
            
            Livro l = new Livro();
            l.setId(Integer.parseInt(jtLivros.getValueAt(jtLivros.getSelectedRow(), 0).toString()));
            l.setCodigo(jtLivros.getValueAt(jtLivros.getSelectedRow(), 1).toString());
            l.setDescricao(jtLivros.getValueAt(jtLivros.getSelectedRow(), 2).toString());
            l.setStatus(jtLivros.getValueAt(jtLivros.getSelectedRow(), 3).toString());
            l.setPag(Integer.parseInt(jtLivros.getValueAt(jtLivros.getSelectedRow(), 4).toString()));
            l.setSetor((Setor)jtLivros.getValueAt(jtLivros.getSelectedRow(), 5));
            
            
            try{            
             
                String CPF;   

               // Pegar cpf do cliente para criar um objeto cliente a partir da consulta no banco
               CPF = JOptionPane.showInputDialog(null, "Digite o CPF do cliente para o livro " + l.getDescricao());

               if(CPF != null){
                     Cliente cliente = new Cliente();
                     ClienteDAO cdao = new ClienteDAO();
                     cliente = cdao.readForCPF(CPF);

                     if(CPF.equals(cliente.getCpf())){

                     CadastraEmprestimo cadEmp = new CadastraEmprestimo(this, rootPaneCheckingEnabled,l,cliente);
                     cadEmp.setVisible(true);
                     readTable();

                     }else{
                         JOptionPane.showMessageDialog(null, "Digite algo!");
                     } 
               }
                           
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Algo deu errado");
            }
            
            
        }else{
                JOptionPane.showMessageDialog(null, "Esse livro não esta ativo!");
                }
            
            
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Escolha um livro");
        }
        
    }//GEN-LAST:event_jbEmprestimoActionPerformed

    private void jbFinalEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalEmprestimoActionPerformed

        try{
            String codLivro = JOptionPane.showInputDialog(null, "Digite o Codigo do livro ","Codigo livro");
            
            if(codLivro != null){
             
                LivroDAO ldao = new LivroDAO();
                EmprestimoDAO daoEmp = new EmprestimoDAO();
                
                //int cod = Integer.parseInt(codLivro);
                Emprestimo em = new Emprestimo();
                
                Livro l = new Livro();
                l = ldao.readForCodigo(codLivro);               
                em.setLivro(l);
                                                   
                
                
                em = daoEmp.readForLivro(l.getId());
                em.setStatus("inativo");
                              
                
                if(ldao.fimEmprestimoLivro(l, em)){
                JOptionPane.showMessageDialog(null, "Finalizado com sucesso");
                readTable();
            }else{
                 JOptionPane.showMessageDialog(null, "Erro ao atualizar + e");   
                }
            }           
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Digite o codigo correto!" + e);
        }
                
        
        
    }//GEN-LAST:event_jbFinalEmprestimoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        ListaEmprestimo listaEmp = new ListaEmprestimo(this, rootPaneCheckingEnabled);
        listaEmp.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jtLivrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLivrosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLivrosKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
         Sobre sobre = new Sobre(this, rootPaneCheckingEnabled);
         sobre.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // ===========================================================================
    // codigo
    
    
    public void verificaEmprestimos() {
        
        EmprestimoDAO emDao = new EmprestimoDAO();
        
        for(Emprestimo em: emDao.read("ativo")){
           try { 
            Date data = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            String dataString = format.format(data);
            Date dataAtual;
            
            dataAtual = new Date(format.parse(dataString).getTime());
            
            
            String dataEm = em.getData_fim();
            
            String day = dataEm.substring(0,2);
            String month = dataEm.substring(3,5);
            String year = dataEm.substring(6);
            
            String dataFimString = year + month + day;
            
            Date dataFim = new Date(format.parse(dataFimString).getTime());
            
            if(dataAtual.after(dataFim)){
                setVencido(em);
                
                
            }
            
            } catch (ParseException ex) {
                System.out.println("erro" + ex);
            }
            
        }
        
        
    }
    
    public void setVencido(Emprestimo em){
        em.setStatus("vencido");
        
        EmprestimoDAO emDao = new EmprestimoDAO();
        emDao.vencido(em);
    }
   
    
    public void readTableForDesc(String desc){
        DefaultTableModel modelo = (DefaultTableModel) jtLivros.getModel();
        modelo.setNumRows(0);
        
        LivroDAO Ldao = new LivroDAO();
        for(Livro l: Ldao.readForDesc(desc)){
            modelo.addRow(new Object[]{l.getId(),l.getCodigo(),l.getDescricao(),l.getStatus(),l.getPag(),l.getSetor()});
        }
        
    }
    
    public void readTable(){
        DefaultTableModel modelo = (DefaultTableModel) jtLivros.getModel();
        modelo.setNumRows(0);
        
        LivroDAO Ldao = new LivroDAO();
        for(Livro l: Ldao.read()){
            modelo.addRow(new Object[]{l.getId(),l.getCodigo(),l.getDescricao(),l.getStatus(),l.getPag(),l.getSetor()});
        }
        
        
    }
    
    
    public void limpaPastaPdf(){
       
       
        
        File folder = new File("pdf");
        if(folder.isDirectory()){
            File[] sun = folder.listFiles();
            for(File toDelete : sun){
                toDelete.delete();
            }
            
        }
        
         
        
    }
    
    
    
    //============================================================================
    
    
    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAddLivro;
    private javax.swing.JButton jbEditarLivro;
    private javax.swing.JButton jbEmprestimo;
    private javax.swing.JMenuItem jbExit;
    private javax.swing.JButton jbFinalEmprestimo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JTable jtLivros;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
