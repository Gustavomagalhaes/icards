/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;

/**
 *
 * @author Uguinho
 */
public class JanelaDebito extends javax.swing.JFrame {

    /**
     * Creates new form JanelaEstabelecimento
     */
    public JanelaDebito() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        SenhaCartao = new javax.swing.JPasswordField();
        iStoreLabel = new javax.swing.JLabel();
        NumCartaoLabel = new javax.swing.JLabel();
        NumCartaoUsuario = new javax.swing.JTextField();
        ValorLabel = new javax.swing.JLabel();
        Valor = new javax.swing.JTextField();
        SenhaLabel = new javax.swing.JLabel();
        senha = new javax.swing.JButton();
        BotaoEnviar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("iCards - iStore");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iStoreLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        iStoreLabel.setText("iStore");
        getContentPane().add(iStoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 11, -1, -1));

        NumCartaoLabel.setText("Número do cartão:");
        getContentPane().add(NumCartaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 110, -1));

        NumCartaoUsuario.setToolTipText("Digite o número do cartão");
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("####-####");  
            NumCartaoUsuario = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        getContentPane().add(NumCartaoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 150, 30));

        ValorLabel.setText("Valor:");
        getContentPane().add(ValorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 50, -1));

        Valor.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorActionPerformed(evt);
            }
        });
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 148, 30));

        SenhaLabel.setText("Senha do cartão:");
        getContentPane().add(SenhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 100, -1));

        senha.setText("Digitar senha");
        senha.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 150, 30));

        BotaoEnviar.setText("Enviar");
        BotaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 100, 30));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 100, 30));

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 100, 30));

        setSize(new java.awt.Dimension(728, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void ValorActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void BotaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        NumCartaoUsuario.getText();
        Valor.getText();
        SenhaCartao.getText();
        
            if ((NumCartaoUsuario.getText().length()>0)
                &&(Valor.getText().length()>0)
                    &&(SenhaCartao.getText().length()>0)){
                JOptionPane.showMessageDialog(null, "Compra realizada com sucesso.");
                this.dispose();
                JanelaInicioAdmin frame = new JanelaInicioAdmin();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);   
            }else{
                JOptionPane.showMessageDialog(null, "Existe algum campo em branco.");
            }
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.dispose();
        JanelaInicioAdmin frame = new JanelaInicioAdmin();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        NumCartaoUsuario.setText("");
        Valor.setText("");
        SenhaCartao.setText("");
        
    }                                        

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        JanelaTecladoNumerico frame1 = new JanelaTecladoNumerico();
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JanelaDebito().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton BotaoEnviar;
    private javax.swing.JLabel NumCartaoLabel;
    private javax.swing.JTextField NumCartaoUsuario;
    private javax.swing.JPasswordField SenhaCartao;
    private javax.swing.JLabel SenhaLabel;
    private javax.swing.JTextField Valor;
    private javax.swing.JLabel ValorLabel;
    private javax.swing.JLabel iStoreLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton senha;
    // End of variables declaration                   

}
