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
public class AddingNumbersInterface extends javax.swing.JFrame {

    /**
     * Creates new form AddingNumbersInterface
     */
    public AddingNumbersInterface() {
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

        jPanel1 = new javax.swing.JPanel();
        addingNumbers = new javax.swing.JLabel();
        tryAgainButton = new javax.swing.JButton();
        firstNumber = new javax.swing.JLabel();
        sign = new javax.swing.JLabel();
        secondNumber = new javax.swing.JLabel();
        sign2 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();
        acertedSums = new javax.swing.JLabel();
        failedSums = new javax.swing.JLabel();
        totalSums = new javax.swing.JLabel();
        helpButton2 = new javax.swing.JButton();
        solutionButton = new javax.swing.JButton();
        endGameButton1 = new javax.swing.JButton();
        acertedSumsNumber = new javax.swing.JLabel();
        failedSumsNumber = new javax.swing.JLabel();
        totalSumsNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addingNumbers.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        addingNumbers.setText("Sumando Números");

        tryAgainButton.setBackground(new java.awt.Color(0, 153, 153));
        tryAgainButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tryAgainButton.setForeground(new java.awt.Color(0, 0, 0));
        tryAgainButton.setText("Otra vez");
        tryAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryAgainButtonActionPerformed(evt);
            }
        });

        firstNumber.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        firstNumber.setText("jLabel1");

        sign.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sign.setText("+");

        secondNumber.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        secondNumber.setText("jLabel1");

        sign2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sign2.setText("=");

        result.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        acertedSums.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        acertedSums.setText("Sumas acertadas:");

        failedSums.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        failedSums.setText("Sumas no acertadas:");

        totalSums.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totalSums.setText("Total de sumas realizadas:");

        helpButton2.setBackground(new java.awt.Color(0, 153, 153));
        helpButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        helpButton2.setForeground(new java.awt.Color(0, 0, 0));
        helpButton2.setText("Ayuda");

        solutionButton.setBackground(new java.awt.Color(0, 153, 153));
        solutionButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        solutionButton.setForeground(new java.awt.Color(0, 0, 0));
        solutionButton.setText("Solucionar");

        endGameButton1.setBackground(new java.awt.Color(0, 153, 153));
        endGameButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        endGameButton1.setForeground(new java.awt.Color(0, 0, 0));
        endGameButton1.setText("Terminar Juego");

        acertedSumsNumber.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        acertedSumsNumber.setText("jLabel1");

        failedSumsNumber.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        failedSumsNumber.setText("jLabel1");

        totalSumsNumber.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totalSumsNumber.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(helpButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(endGameButton1)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(acertedSums)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalSums)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(acertedSumsNumber)
                                        .addGap(39, 39, 39)
                                        .addComponent(failedSums)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(failedSumsNumber))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(firstNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sign)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addingNumbers)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(secondNumber)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sign2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(solutionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tryAgainButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(totalSumsNumber)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(addingNumbers)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sign)
                            .addComponent(secondNumber)
                            .addComponent(sign2)
                            .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acertedSums)
                            .addComponent(acertedSumsNumber)
                            .addComponent(failedSums)
                            .addComponent(failedSumsNumber))
                        .addGap(19, 19, 19)
                        .addComponent(totalSums)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalSumsNumber))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(tryAgainButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(solutionButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helpButton2)
                    .addComponent(endGameButton1))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryAgainButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tryAgainButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddingNumbersInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddingNumbersInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddingNumbersInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddingNumbersInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddingNumbersInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertedSums;
    private javax.swing.JLabel acertedSumsNumber;
    private javax.swing.JLabel addingNumbers;
    private javax.swing.JButton endGameButton1;
    private javax.swing.JLabel failedSums;
    private javax.swing.JLabel failedSumsNumber;
    private javax.swing.JLabel firstNumber;
    private javax.swing.JButton helpButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField result;
    private javax.swing.JLabel secondNumber;
    private javax.swing.JLabel sign;
    private javax.swing.JLabel sign2;
    private javax.swing.JButton solutionButton;
    private javax.swing.JLabel totalSums;
    private javax.swing.JLabel totalSumsNumber;
    private javax.swing.JButton tryAgainButton;
    // End of variables declaration//GEN-END:variables
}
