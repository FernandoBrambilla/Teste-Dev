/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atividade.gerenciadorlink;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class telaPrincipal extends javax.swing.JFrame {
  
    
    public telaPrincipal() {
        initComponents();
       
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtLink = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaResult = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAssunto = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaResult2 = new javax.swing.JTable();
        btnAbrirLink = new javax.swing.JButton();
        btnSalvarLinkBusca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Link");

        txtLink.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gerenciador de Links");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });

        btnAbrir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAbrir.setText("Abrir Link");
        btnAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirMouseClicked(evt);
            }
        });

        tabelaResult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelaResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "URL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResult.setRowHeight(30);
        jScrollPane1.setViewportView(tabelaResult);
        if (tabelaResult.getColumnModel().getColumnCount() > 0) {
            tabelaResult.getColumnModel().getColumn(0).setMinWidth(40);
            tabelaResult.getColumnModel().getColumn(0).setMaxWidth(40);
            tabelaResult.getColumnModel().getColumn(1).setResizable(false);
            tabelaResult.getColumnModel().getColumn(1).setHeaderValue("URL");
        }

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Selecione um link acima para realizar uma pesquisa.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Pesquise por:");

        txtAssunto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAssunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAssuntoActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Assuntos encontrados:");

        tabelaResult2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelaResult2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Assunto", "Link"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResult2.setRowHeight(30);
        jScrollPane4.setViewportView(tabelaResult2);
        if (tabelaResult2.getColumnModel().getColumnCount() > 0) {
            tabelaResult2.getColumnModel().getColumn(0).setMinWidth(40);
            tabelaResult2.getColumnModel().getColumn(0).setMaxWidth(40);
            tabelaResult2.getColumnModel().getColumn(1).setResizable(false);
            tabelaResult2.getColumnModel().getColumn(2).setResizable(false);
        }

        btnAbrirLink.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAbrirLink.setText("Abrir Link");
        btnAbrirLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirLinkActionPerformed(evt);
            }
        });

        btnSalvarLinkBusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvarLinkBusca.setText("Salvar Link");
        btnSalvarLinkBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarLinkBuscaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnSalvarLinkBusca)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAbrirLink)
                                        .addGap(16, 16, 16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnEditar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExcluir)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAbrir)
                                        .addGap(12, 12, 12))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 83, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAssunto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar))))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnSalvar))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAbrir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarLinkBusca)
                    .addComponent(btnAbrirLink))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        //cria nova linha com id e url
        String linkDigitado= txtLink.getText();
        if("".equals(linkDigitado)){
            JOptionPane.showMessageDialog(null, "A url precisa ser preenchida.");
        }
        for(int i=link.getId(); (i<=100);i++){
            DefaultTableModel model = (DefaultTableModel) tabelaResult.getModel();
            model.addRow(new Object[]{}); 
            tabelaResult.setValueAt(i+1,i,0);
            tabelaResult.setValueAt(linkDigitado,i,1);
            this.txtLink.setText(""); 
            link.setId(link.getId()+1);
            break;
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        //edita o link da sinha selecionada
        int linhaSelecionada=tabelaResult.getSelectedRow();
        String linkEditado=JOptionPane.showInputDialog("Digite o novo link: ");
        tabelaResult.setValueAt(linkEditado,linhaSelecionada,1);
        
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        //remove a linha selecionada e atualiza os ids     
        int linhaSelecionada=tabelaResult.getSelectedRow();
        JOptionPane.showMessageDialog(null,"Tem certeza que quer excluir este link?");
        int id=link.getId();
        ((DefaultTableModel) tabelaResult.getModel()).removeRow(linhaSelecionada);
            for(int i=linhaSelecionada;i<tabelaResult.getRowCount()&& i==linhaSelecionada;i++){
                ((DefaultTableModel) tabelaResult.getModel()).setValueAt(linhaSelecionada+1,linhaSelecionada, 0);
                linhaSelecionada++;
            }
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirMouseClicked
        //abre o link da linha selecionada no navegador
        int linhaSelecionada=tabelaResult.getSelectedRow();
        String linkSelecionado=tabelaResult.getValueAt(linhaSelecionada, 1).toString();
        try {  
            java.awt.Desktop.getDesktop().browse(new java.net.URI(linkSelecionado));
        } 
        catch (URISyntaxException | IOException ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirMouseClicked

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        int linhaSelecionada=tabelaResult.getSelectedRow();
        if(linhaSelecionada<0){
            JOptionPane.showMessageDialog(null,"Nenhum link foi selecionado!");
        }
        else{
            Document doc=null;
            try {
                doc = Jsoup.connect(tabelaResult.getValueAt(linhaSelecionada,1).toString()).get();
                Elements links = doc.getElementsContainingText(txtAssunto.getText());
                for( Element link:links){
                    for(int i=0;i<=links.size()&&i==linhaSelecionada;i++){
                        DefaultTableModel model = (DefaultTableModel) tabelaResult2.getModel();
                        model.addRow(new Object[]{});
                        tabelaResult2.setValueAt(i+1, i, 0);
                        tabelaResult2.setValueAt(doc.title().trim(), i,1);
                        tabelaResult2.setValueAt(links.attr("abs:href"),i,2);       
                    } 
                }   
            }
            catch (IOException ex) {
                Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }         
    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void txtAssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAssuntoActionPerformed
        
    
    }//GEN-LAST:event_txtAssuntoActionPerformed

    private void btnAbrirLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirLinkActionPerformed
         //abre o link da linha selecionada no navegador
        int linhaSelecionada=tabelaResult2.getSelectedRow();
        String linkSelecionado=tabelaResult2.getValueAt(linhaSelecionada,2).toString();
        try {  
            java.awt.Desktop.getDesktop().browse(new java.net.URI(linkSelecionado));
        } 
        catch (URISyntaxException | IOException ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirLinkActionPerformed

    private void btnSalvarLinkBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarLinkBuscaMouseClicked
        String linkSelecionado=tabelaResult2.getValueAt(tabelaResult2.getSelectedRow(),2).toString();
        for(int id=link.getId();(id<=100);id++){
            DefaultTableModel model = (DefaultTableModel) tabelaResult.getModel();
            model.addRow(new Object[]{}); 
            tabelaResult.setValueAt(id+1,id,0);
            tabelaResult.setValueAt(linkSelecionado,id,1); 
            link.setId(link.getId()+1);
            break;
        }
    }//GEN-LAST:event_btnSalvarLinkBuscaMouseClicked
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAbrirLink;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarLinkBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaResult;
    private javax.swing.JTable tabelaResult2;
    private javax.swing.JTextField txtAssunto;
    private javax.swing.JTextField txtLink;
    // End of variables declaration//GEN-END:variables

    private void log(String ss) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
