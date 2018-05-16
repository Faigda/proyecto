/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameInterfaces;

/**
 *
 * @author yeine
 */
public class Game2Interface extends javax.swing.JFrame {

    /**
     * Creates new form Game2Interface
     */
    public Game2Interface() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        name = new javax.swing.JLabel();
        corregir = new javax.swing.JButton();
        solucionar = new javax.swing.JButton();
        ayuda = new javax.swing.JButton();
        terminarJuego = new javax.swing.JButton();
        puntaje = new javax.swing.JTextField();
        ingresedWord = new javax.swing.JTextField();
        randomWord = new javax.swing.JLabel();
        numScore = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setBackground(new java.awt.Color(0, 0, 51));
        name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Formando Palabras");

        corregir.setBackground(new java.awt.Color(0, 153, 153));
        corregir.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        corregir.setForeground(new java.awt.Color(0, 0, 0));
        corregir.setText("Corregir");

        solucionar.setBackground(new java.awt.Color(0, 153, 153));
        solucionar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        solucionar.setForeground(new java.awt.Color(0, 0, 0));
        solucionar.setText("Solucionar");
        solucionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solucionarActionPerformed(evt);
            }
        });

        ayuda.setBackground(new java.awt.Color(0, 153, 153));
        ayuda.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ayuda.setForeground(new java.awt.Color(0, 0, 0));
        ayuda.setText("Ayuda");

        terminarJuego.setBackground(new java.awt.Color(0, 153, 153));
        terminarJuego.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        terminarJuego.setForeground(new java.awt.Color(0, 0, 0));
        terminarJuego.setText("Terminar Juego");
        terminarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarJuegoActionPerformed(evt);
            }
        });

        puntaje.setBackground(new java.awt.Color(0, 153, 153));
        puntaje.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        puntaje.setForeground(new java.awt.Color(0, 0, 0));
        puntaje.setText("Puntaje:");

        ingresedWord.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ayuda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(terminarJuego))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(corregir)
                                .addGap(68, 68, 68)
                                .addComponent(solucionar)
                                .addGap(0, 143, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(randomWord, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresedWord, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numScore)
                        .addGap(11, 11, 11))))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(randomWord, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresedWord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corregir)
                    .addComponent(solucionar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(terminarJuego)
                    .addComponent(ayuda))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void terminarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarJuegoActionPerformed
        this.dispose();
    }//GEN-LAST:event_terminarJuegoActionPerformed

    private void solucionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solucionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solucionarActionPerformed

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
            java.util.logging.Logger.getLogger(Game2Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game2Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game2Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game2Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game2Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    private javax.swing.JButton corregir;
    private javax.swing.JTextField ingresedWord;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel name;
    private javax.swing.JLabel numScore;
    private javax.swing.JTextField puntaje;
    private javax.swing.JLabel randomWord;
    private javax.swing.JButton solucionar;
    private javax.swing.JButton terminarJuego;
    // End of variables declaration//GEN-END:variables
}