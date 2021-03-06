package GameInterfaces;

import javax.swing.JOptionPane;
import proyectoprogra.FormingWords;

/**
 *
 * @author Edwin, Jasson, Yeiner.
 */
public class Game2Interface extends javax.swing.JFrame {

    //Initialization of variables
    private int initialScore = 100;
    private String iWord;
    FormingWords box = new FormingWords();
    
    String le = box.findingWords();
    String cWord = box.startGame(le);
    
    public Game2Interface() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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

        randomWords.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        randomWords.setText(cWord);

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
        playerPointsNumber.setText(String.valueOf(initialScore));

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

        InputSpace.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        InputSpace.setText("");
        InputSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputSpaceActionPerformed(evt);
            }
        });

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
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(toCorrectButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solveButton2)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(27, 27, 27))
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

    //Help button for forming words
    private void helpButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "ABOUT THE GAME FORMING WORDS"+"\n\n"+
                                            "-The game Forming Words consists in ordering the letters of a word that are disordered in a random way so that the user can form the word."+"\n\n"+
                                            "-The word must be ingresed in the empty box and then press the \"solve\" option to see if the word is correct or incorrect."+"\n\n"+
                                            "-The player will have a total score of 100, which will be reduced as the player fails to order the word."+"\n\n"+
                                            "-The number of points that are reduced by missing a word equals 10."+"\n\n"+
                                            "-If the player makes a mistake when writing the word, he can clean the box by clicking on the opcion \"To correct\" so that the player can write the word again."+"\n\n"+
                                            "-The player wins if he guesses the word, loses if his score reaches 0 and the game is over when the player decides to do it.");
    }//GEN-LAST:event_helpButton3ActionPerformed

    //Button to insert the answer and verify if it is correct or incorrect
    private void solveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButton2ActionPerformed
        //Guarda el valor ingresado por el jugador.
        iWord = String.valueOf(InputSpace.getText().toUpperCase());
        
        FormingWords boxObject = new FormingWords( iWord,  cWord,  le);
        
        //Transforms all words entered by the user into uppercase
        boxObject.setInputWord(String.valueOf(InputSpace).toUpperCase());
        
        //Compare the words and check if the answer is correct or not to determine the player's score
        if (boxObject.compareWords(iWord))
        {
            playerPointsNumber.setText(String.valueOf(initialScore));
        }
        else
        {
            initialScore -= 10;
            playerPointsNumber.setText(String.valueOf(initialScore));
            //When the score reaches 0 the game ends
            if(initialScore==0)
            {
                this.dispose();
                JOptionPane.showMessageDialog(null, "You lose!");
            }
        } 
      
        //The entire contents of the box where the word is entered are deleted
        InputSpace.setText("");
        
        //Another word is chosen to play
        le = boxObject.findingWords();
        
        cWord = box.startGame(le);
    
        randomWords.setText(cWord);
    }//GEN-LAST:event_solveButton2ActionPerformed
    
    //Button to finish game of adding numbers
    private void endGameButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endGameButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_endGameButton2ActionPerformed

    //Button to try again that deletes the letters entered by the user
    private void toCorrectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCorrectButtonActionPerformed
        InputSpace.setText("");
    }//GEN-LAST:event_toCorrectButtonActionPerformed

    //Space for the user to enter the word
    private void InputSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputSpaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputSpaceActionPerformed

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
