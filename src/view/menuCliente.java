/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.cliente;
import services.clienteServicos;
import services.servicosFactory;
import util.validadores;

/**
 *
 * @author 182120001
 */
public class menuCliente extends javax.swing.JFrame {

    /**
     * Creates new form menuCliente
     */
    public menuCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jlSHEIN = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlFazerLogin = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfCPF = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jbEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlSHEIN.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlSHEIN.setForeground(new java.awt.Color(255, 255, 255));
        jlSHEIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSHEIN.setText("S H E I N");
        jPanel1.add(jlSHEIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 387, 71));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 640, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 640, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(10, 300));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, 500));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(10, 300));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 150, -1, 490));

        jlFazerLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlFazerLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlFazerLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFazerLogin.setText("Fazer login");
        jPanel1.add(jlFazerLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        jlNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNome.setForeground(new java.awt.Color(255, 255, 255));
        jlNome.setText("Nome :");
        jPanel1.add(jlNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jlCPF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCPF.setForeground(new java.awt.Color(255, 255, 255));
        jlCPF.setText("CPF :");
        jPanel1.add(jlCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 40, -1));

        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });
        jtfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNomeKeyTyped(evt);
            }
        });
        jPanel1.add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 520, -1));

        jtfCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCPFFocusLost(evt);
            }
        });
        jtfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCPFActionPerformed(evt);
            }
        });
        jtfCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCPFKeyTyped(evt);
            }
        });
        jPanel1.add(jtfCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 520, -1));

        jbCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, -1, -1));

        jbFechar.setBackground(new java.awt.Color(204, 204, 204));
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });
        jPanel1.add(jbFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 80, -1));

        jbEntrar.setBackground(new java.awt.Color(204, 204, 204));
        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 590, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean validaInputs() {
        if (jtfNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Nome!");
            jtfNome.requestFocus();
            return false;
        } else if (jtfCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher CPF!");
            jtfCPF.requestFocus();
            return false;
        }
        return true;
    }
    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jtfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyTyped
        String nletras = "0123456789<>:?/~^}][{´`=+-_!|'\'@#$%¨&*()²³£¢¬§º°ª";
        if (nletras.contains(evt.getKeyChar() + "")) {
            evt.consume();

        }
    }//GEN-LAST:event_jtfNomeKeyTyped

    private void jtfCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCPFFocusLost


    }//GEN-LAST:event_jtfCPFFocusLost

    private void jtfCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCPFKeyTyped
        String number = "0123456789";
        if (jtfCPF.getText().length() <= 11) {
            if (!number.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfCPFKeyTyped
    private void limparCampos() {
        jtfCPF.setText("");
        jtfNome.setText("");
        jtfNome.requestFocus();
    }
    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        String cpf = jtfCPF.getText();
        String nome = jtfNome.getText();
        clienteServicos cliS = servicosFactory.getClienteServicos();

        // verifica se o CPF já está cadastrado no banco
        cliente clienteExistente = cliS.buscarClientePeloCPF(cpf);
        if (clienteExistente != null) {
            JOptionPane.showMessageDialog(rootPane, "Já cadastrado no banco de dados, por favor selecione a opção de entrar!");
            return; // interrompe a execução do método
        }
        cliente c = new cliente(WIDTH, nome, cpf);
        if (validadores.isCPF(cpf) && !nome.isEmpty()) {
            cliS.adicionaCliente(c);
            JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso!");
        } else {
            // Exibe mensagem de erro
            if (!validadores.isCPF(cpf)) {
                JOptionPane.showMessageDialog(rootPane, "Por favor, insira um CPF válido!");
            } else if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Por favor, insira um nome válido!");
            }
        }
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jtfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCPFActionPerformed

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        String cpf = jtfCPF.getText();
        clienteServicos cliS = servicosFactory.getClienteServicos();

        cliente clienteExistente = cliS.buscarClientePeloCPF(cpf);
        if (clienteExistente != null) {
            // fecha a janela atual
            setVisible(false);
            dispose();
            // abre a próxima janela
            menuTenis janelaProduto = new menuTenis();
            janelaProduto.setVisible(true);
        } else {
            // se o cpf não existe exibe uma mensagem de erro
            JOptionPane.showMessageDialog(rootPane, "Por favor cadastre-se antes!");
        }
    }//GEN-LAST:event_jbEntrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(menuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlFazerLogin;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSHEIN;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
