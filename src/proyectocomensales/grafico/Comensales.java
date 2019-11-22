/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocomensales.grafico;

import javax.swing.JLabel;


/**
 *
 * @author Eduart Ramos
 */

public class Comensales extends javax.swing.JFrame {
    public JLabel imagenFrame;
    
    private static Comensales singlenton;
    
    public static Comensales getInstancia(){
    if(singlenton == null){
        singlenton = new Comensales();
     }   
    return singlenton;
}

    public JLabel getImagenFrame() {
        return imagenFrame;
    }

    public void setImagenFrame(JLabel Imagen) {
        this.imagenFrame = Imagen;
    }

    
    public Comensales() {
        initComponents();
       // this.lblImagen = imagenFrame; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensaje1 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblMensaje2 = new javax.swing.JLabel();
        lblMensaje3 = new javax.swing.JLabel();
        lblMensaje4 = new javax.swing.JLabel();
        lblMensaje5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblMensaje1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMensaje1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblMensaje1);
        lblMensaje1.setBounds(0, 0, 130, 24);
        getContentPane().add(lblImagen);
        lblImagen.setBounds(0, 40, 400, 260);

        lblMensaje2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMensaje2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblMensaje2);
        lblMensaje2.setBounds(150, 0, 130, 24);

        lblMensaje3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMensaje3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblMensaje3);
        lblMensaje3.setBounds(300, 0, 130, 24);

        lblMensaje4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMensaje4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblMensaje4);
        lblMensaje4.setBounds(440, 0, 130, 24);

        lblMensaje5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMensaje5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblMensaje5);
        lblMensaje5.setBounds(580, 0, 130, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Comensales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comensales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comensales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comensales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comensales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lblImagen;
    public javax.swing.JLabel lblMensaje1;
    public javax.swing.JLabel lblMensaje2;
    public javax.swing.JLabel lblMensaje3;
    public javax.swing.JLabel lblMensaje4;
    public javax.swing.JLabel lblMensaje5;
    // End of variables declaration//GEN-END:variables
}
