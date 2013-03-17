package visao;

import bean.Cartao;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.GerenciarCartao;
import negocio.GerenciarDB;

/**
 *
 * @author Uguinho
 */
public class JanelaUsuario extends javax.swing.JFrame {
    public String IDcartao;
    public int tipo;
    /**
     * Creates new form JanelaUsuario
     */
    public JanelaUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iCliente = new javax.swing.JLabel();
        Historico = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SaldoLabel = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        AlterarSenha = new javax.swing.JButton();
        ImprimirExtrato = new javax.swing.JButton();
        BloquearCartao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("iCards - iCliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iCliente.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        iCliente.setText("iCliente");
        getContentPane().add(iCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 11, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data", "Estabelecimento", "Valor"
            }
        ));
        Historico.setViewportView(jTable1);

        getContentPane().add(Historico, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 66, 375, 180));

        SaldoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SaldoLabel.setText("Saldo atual:");
        getContentPane().add(SaldoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 90, -1));

        Saldo.setText("$ 00,00");
        getContentPane().add(Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 260, 50, -1));

        AlterarSenha.setText("Alterar senha");
        AlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(AlterarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 281, 140, 35));

        ImprimirExtrato.setText("Imprimir extrato");
        getContentPane().add(ImprimirExtrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 322, 140, 35));

        BloquearCartao.setText("Bloquear cartão");
        BloquearCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloquearCartaoActionPerformed(evt);
            }
        });
        getContentPane().add(BloquearCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 363, 140, 35));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-728)/2, (screenSize.height-514)/2, 728, 514);
    }// </editor-fold>//GEN-END:initComponents

    private void AlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarSenhaActionPerformed

        this.dispose();
        JanelaAlterarSenha frame = new JanelaAlterarSenha();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_AlterarSenhaActionPerformed

    private void BloquearCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloquearCartaoActionPerformed
        try {
            Cartao cartao = new Cartao(IDcartao);
            GerenciarCartao gerenciarCartao = new GerenciarCartao(cartao);
            GerenciarDB banco = new GerenciarDB();
            
            if (banco.checkStatusCartaoBloqueadoDB(IDcartao)) {
                gerenciarCartao.desbloquearCartao();
            } else {
                gerenciarCartao.bloquearCartao();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(JanelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BloquearCartaoActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JanelaUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarSenha;
    private javax.swing.JButton BloquearCartao;
    private javax.swing.JScrollPane Historico;
    private javax.swing.JButton ImprimirExtrato;
    protected javax.swing.JLabel Saldo;
    private javax.swing.JLabel SaldoLabel;
    private javax.swing.JLabel iCliente;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
