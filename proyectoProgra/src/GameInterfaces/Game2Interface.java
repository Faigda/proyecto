/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameInterfaces;

import javax.swing.JOptionPane;
import proyectoprogra.FormingWords;

/**
 *
 * @author Edwin, Jasson, Yeiner.
 */
public class Game2Interface extends javax.swing.JFrame {

    FormingWords boxObject = new FormingWords();
    
    public Game2Interface() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        formingWords = new javax.swing.JLabel();
        randomWords = new javax.swing.JLabel();
        toCorrectButton = new javax.swing.JButton();
        solveButton2 = new javax.swing.JButton();
        playerPoints = new javax.swing.JLabel();
        playerPointsNumber = new javax.swing.JLabel();
        helpButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        endGameButton2 = new javax.swing.JButton();
        InputSpace = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formingWords.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        formingWords.setText("Forming Words");

        randomWords.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        randomWords.setText(boxObject.startGame());

        toCorrectButton.setBackground(new java.awt.Color(0, 153, 153));
        toCorrectButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        toCorrectButton.setText("To correct");
        toCorrectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCorrectButtonActionPerformed(evt);
            }
        });

        solveButton2.setBackground(new java.awt.Color(0, 153, 153));
        solveButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        solveButton2.setText("Solve");
        solveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButton2ActionPerformed(evt);
            }
        });

        playerPoints.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerPoints.setText("Points:");

        playerPointsNumber.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerPointsNumber.setText(String.valueOf(boxObject.getInitialScore()));

        helpButton3.setBackground(new java.awt.Color(0, 153, 153));
        helpButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        helpButton3.setText("Help");
        helpButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButton3ActionPerformed(evt);
            }
        });

        endGameButton2.setBackground(new java.awt.Color(0, 153, 153));
        endGameButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        endGameButton2.setText("End game");
        endGameButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endGameButton2ActionPerformed(evt);
            }
        });

        InputSpace.setText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(randomWords, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(helpButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerPoints)
                        .addGap(18, 18, 18)
                        .addComponent(playerPointsNumber))
                    .addComponent(InputSpace))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(endGameButton2)
                    .addComponent(solveButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toCorrectButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(formingWords)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(formingWords)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(toCorrectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(solveButton2)
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(randomWords, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(InputSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playerPoints)
                            .addComponent(playerPointsNumber))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(helpButton3)
                            .addComponent(jLabel5)
                            .addComponent(endGameButton2))
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "ABOUT THE GAME FORMING WORDS"+"\n\n"+
                                            "-The game Forming Words consists in ordering the letters of a word that are disordered in a random way so that the user can form the word."+"\n\n"+
                                            "-The player must write one of the letters that are in the top panel in the blank box and then press the \"solve\" option to enter the letter and see if it is correct or incorrect."+"\n\n"+
                                            "-The player will have a total score of 100, which will be reduced as the player fails to order a letter of the word."+"\n\n"+
                                            "-The condition for the user to advance is that the letter entered is correct, if it is incorrect, the user can not advance to the next and lose 10 points."+"\n\n"+
                                            "-If the player wants to know what the word was in an orderly manner, he can click on the \"To correct\" option that shows the word"+"\n\n"+
                                            "-The player wins when he hits the word, loses if his score reaches 0 and the game is over when the player decides to do it.");
    }//GEN-LAST:event_helpButton3ActionPerformed

    private void solveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButton2ActionPerformed
        boxObject.setInputWord(String.valueOf(InputSpace));
        boxObject.compareWords();
        
        
        
        randomWords.setText(boxObject.startGame());
        
    }//GEN-LAST:event_solveButton2ActionPerformed

    private void endGameButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endGameButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_endGameButton2ActionPerformed

    private void toCorrectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCorrectButtonActionPerformed
        InputSpace.setText(boxObject.getLine());
    }//GEN-LAST:event_toCorrectButtonActionPerformed

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
    private javax.swing.JTextField InputSpace;
    private javax.swing.JButton endGameButton2;
    private javax.swing.JLabel formingWords;
    private javax.swing.JButton helpButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel playerPoints;
    private javax.swing.JLabel playerPointsNumber;
    private javax.swing.JLabel randomWords;
    private javax.swing.JButton solveButton2;
    private javax.swing.JButton toCorrectButton;
    // End of variables declaration//GEN-END:variables
}
