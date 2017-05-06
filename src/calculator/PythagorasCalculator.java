package calculator;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * This is Pythagoras Calculator class that calculates third side of a Right Angled triangle
 * @author arp226
 */
public class PythagorasCalculator extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorUI
     */
    public PythagorasCalculator() {
        initComponents();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSideA = new javax.swing.JLabel();
        lblSideB = new javax.swing.JLabel();
        lblSideC = new javax.swing.JLabel();
        txtSideA = new javax.swing.JTextField();
        txtSideB = new javax.swing.JTextField();
        txtSideC = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Right Triangles");

        lblSideA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSideA.setText("Side A:");

        lblSideB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSideB.setText("Side B:");

        lblSideC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSideC.setText("Side C:");

        txtSideA.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSideA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSideAKeyPressed(evt);
            }
        });

        txtSideB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSideBKeyPressed(evt);
            }
        });

        txtSideC.setEditable(false);
        txtSideC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSideC.setOpaque(false);

        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSideC)
                        .addGap(18, 18, 18)
                        .addComponent(txtSideC))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSideB)
                        .addGap(18, 18, 18)
                        .addComponent(txtSideB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSideA)
                        .addGap(18, 18, 18)
                        .addComponent(txtSideA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 135, Short.MAX_VALUE)
                        .addComponent(btnCalculate)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSideA)
                    .addComponent(txtSideA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSideB)
                    .addComponent(txtSideB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSideC)
                    .addComponent(txtSideC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnExit))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        try {
            DecimalFormat df = new DecimalFormat("#.000");
            // define double variables.
            double sideA, sideB, sideC;
            // We have to parse the text to a type Double.
            sideA = Double.parseDouble(txtSideA.getText());
            sideB = Double.parseDouble(txtSideB.getText());
            if (sideA == 0) {
                showMessageDialog(null, "Side cannot be 0. Please enter valid numbers", "Warning", JOptionPane.WARNING_MESSAGE);
                txtSideA.requestFocusInWindow();
                return;
            } else if (sideB == 0) {
                showMessageDialog(null, "Side cannot be 0. Please enter valid numbers", "Warning", JOptionPane.WARNING_MESSAGE);
                txtSideB.requestFocusInWindow();
                return;
            }
            // perform the formula for calculating hypotenous of a right angled triangle
            sideC = Math.sqrt((sideA * sideA) + (sideB * sideB));
            // change the value of result from a Double to a string.
            txtSideC.setText(String.valueOf(df.format(sideC)));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter digits!");
            txtSideA.requestFocusInWindow();

        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);

    }//GEN-LAST:event_btnExitActionPerformed

    private void txtSideAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSideAKeyPressed
        //Validation for Side A
        if ((evt.getKeyChar() > 31 && evt.getKeyChar() < 46) || evt.getKeyChar() == 47 || (evt.getKeyChar() > 57 && evt.getKeyChar() < 128)) {
            showMessageDialog(null, "Please enter valid numbers only", "Warning", JOptionPane.WARNING_MESSAGE);
            txtSideA.requestFocusInWindow();
            return;
        }
        char text[];
        int count = 0;
        text = txtSideA.getText().toCharArray();
        for (int i = 0; i < text.length; i++) {
            if (text[i] == '.') {
                count++;
                if (count > 0 && evt.getKeyChar() == '.') {
                    showMessageDialog(null, "Please enter valid numbers only", "Warning", JOptionPane.WARNING_MESSAGE);
                    txtSideA.requestFocusInWindow();
                    break;
                }
            }
        }

       


    }//GEN-LAST:event_txtSideAKeyPressed


    private void txtSideBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSideBKeyPressed
       //Validation for Side B
        if ((evt.getKeyChar() > 31 && evt.getKeyChar() < 46) || evt.getKeyChar() == 47 || (evt.getKeyChar() > 57 && evt.getKeyChar() < 128)) {
            showMessageDialog(null, "Please enter valid numbers only", "Warning", JOptionPane.WARNING_MESSAGE);
            txtSideB.requestFocusInWindow();
            return;
        }
        char text[];
        int count = 0;
        text = txtSideB.getText().toCharArray();

        for (int i = 0; i < text.length; i++) {
            if (text[i] == '.') {
                count++;
                if (count >= 1 && evt.getKeyChar() == '.') {
                    showMessageDialog(null, "Please enter valid numbers only", "Warning", JOptionPane.WARNING_MESSAGE);
                    txtSideB.requestFocusInWindow();
                }
            }
        }


    }//GEN-LAST:event_txtSideBKeyPressed
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
            java.util.logging.Logger.getLogger(PythagorasCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PythagorasCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PythagorasCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PythagorasCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PythagorasCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblSideA;
    private javax.swing.JLabel lblSideB;
    private javax.swing.JLabel lblSideC;
    private javax.swing.JTextField txtSideA;
    private javax.swing.JTextField txtSideB;
    private javax.swing.JTextField txtSideC;
    // End of variables declaration//GEN-END:variables
}
