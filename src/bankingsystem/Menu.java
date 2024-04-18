/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankingsystem;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author PRO
 */
public class Menu extends javax.swing.JFrame {
 private HashMap<String, Double> balances;
 private String username;
    public Menu() {
        
        initComponents();
    }
     public void setBalances(HashMap<String, Double> balances) {
        this.balances = balances;
    }
    public Menu(String username) {
    this.username = username;
    initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ViewBalance = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        Deposit = new javax.swing.JButton();
        transfer = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "BANKING SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cambria", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N

        ViewBalance.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        ViewBalance.setText("VIEW BALANCE");
        ViewBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBalanceActionPerformed(evt);
            }
        });

        withdraw.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        withdraw.setText("WITHDRAW");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        Deposit.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Deposit.setText("DEPOSIT");
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });

        transfer.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        transfer.setText("TRANSFER FUNDS");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ViewBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transfer, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ViewBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(withdraw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transfer)
                .addGap(16, 16, 16)
                .addComponent(Deposit)
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addContainerGap(61, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBalanceActionPerformed
        
        if (balances.containsKey(username)) {
            double balance = balances.get(username);
            JOptionPane.showMessageDialog(null, "Balance for " + username + ": $" + balance);
        } else {
            JOptionPane.showMessageDialog(null, "No balance found for " + username);
        }
    }//GEN-LAST:event_ViewBalanceActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
            String withdrawAmountString = JOptionPane.showInputDialog(null, "Enter amount to withdraw:");
    
    // Check if the user canceled or closed the input dialog
    if (withdrawAmountString == null) {
        return; // Exit the method if the user canceled
    }
    
    // Parse the input string to a double
    double withdrawAmount;
    try {
        withdrawAmount = Double.parseDouble(withdrawAmountString);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid amount entered. Please enter a valid number.");
        return; // Exit the method if the input is not a valid number
    }
    
    // Check if the withdrawal amount is negative or zero
    if (withdrawAmount <= 0) {
        JOptionPane.showMessageDialog(null, "Withdrawal amount must be a positive number.");
        return; // Exit the method if the withdrawal amount is not positive
    }
    
    // Check if the username exists in the balances HashMap
    if (balances.containsKey(username)) {
        // Get the current balance
        double currentBalance = balances.get(username);
        
        // Check if the withdrawal amount is greater than the current balance
        if (withdrawAmount > currentBalance) {
            JOptionPane.showMessageDialog(null, "Insufficient funds. You cannot withdraw more than your current balance.");
            return; // Exit the method if the withdrawal amount is greater than the current balance
        }
        
        // Subtract the withdrawal amount from the current balance
        double newBalance = currentBalance - withdrawAmount;
        
        // Update the balance in the balances HashMap
        balances.put(username, newBalance);
        
        // Display a message to inform the user about the successful withdrawal
        JOptionPane.showMessageDialog(null, "Withdrawal successful! Your new balance is: $" + newBalance);
    } else {
        JOptionPane.showMessageDialog(null, "No balance found for " + username);
    }
    }//GEN-LAST:event_withdrawActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        String depositAmountString = JOptionPane.showInputDialog(null, "Enter amount to deposit:");
    
    // Check if the user canceled or closed the input dialog
    if (depositAmountString == null) {
        return; // Exit the method if the user canceled
    }
    // Parse the input string to a double
    double depositAmount;
    try {
        depositAmount = Double.parseDouble(depositAmountString);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid amount entered. Please enter a valid number.");
        return; // Exit the method if the input is not a valid number
    }
    
    // Check if the deposit amount is negative or zero
    if (depositAmount <= 0) {
        JOptionPane.showMessageDialog(null, "Deposit amount must be a positive number.");
        return; // Exit the method if the deposit amount is not positive
    }
    
    // Check if the username exists in the balances HashMap
    if (balances.containsKey(username)) {
        // Get the current balance
        double currentBalance = balances.get(username);
        
        // Add the deposit amount to the current balance
        double newBalance = currentBalance + depositAmount;
        
        // Update the balance in the balances HashMap
        balances.put(username, newBalance);
        
        // Display a message to inform the user about the successful deposit
        JOptionPane.showMessageDialog(null, "Deposit successful! Your new balance is: $" + newBalance);
    } else {
        JOptionPane.showMessageDialog(null, "No balance found for " + username);
    }
    }//GEN-LAST:event_DepositActionPerformed

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
          String accountname;
    do {
    accountname = JOptionPane.showInputDialog(null, "Enter the account username:");
    if (accountname == null) {
        return; // Exit the method if the user canceled
    } else if (accountname.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter an account name you want to transfer.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    } while (accountname.isEmpty());
    String transferAmountString = JOptionPane.showInputDialog(null, "Enter amount to transfer:");

    // Check if the user canceled or closed the input dialog
    if (transferAmountString == null) {
    return; // Exit the method if the user canceled
    }

// Parse the input string to a double
     double transferAmount;
     try {
     transferAmount = Double.parseDouble(transferAmountString);
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
    return; // Exit the method if the input is not a valid number
    }

// Check if the transfer amount is negative or zero
    if (transferAmount <= 0) {
    JOptionPane.showMessageDialog(null, "Transfer amount must be a positive number.");
    return; // Exit the method if the transfer amount is not positive
    }

// Check if the username exists in the balances HashMap
     if (balances.containsKey(username)) {
    // Get the current balance
    double currentBalance = balances.get(username);
    
    // Check if the transfer amount is greater than the current balance
    if (transferAmount > currentBalance) {
        JOptionPane.showMessageDialog(null, "Insufficient funds. You cannot transfer more than your current balance.");
        return; // Exit the method if the transfer amount is greater than the current balance
    }
    
    // Subtract the transfer amount from the current balance
    double newBalance = currentBalance - transferAmount;
    
    // Update the balance in the balances HashMap
    balances.put(username, newBalance);
    
    // Display a message to inform the user about the successful transfer
    JOptionPane.showMessageDialog(null, "Transfer successful! Your new balance is: $" + newBalance);
} else {
    JOptionPane.showMessageDialog(null, "No balance found for " + username);
}
    }//GEN-LAST:event_transferActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
         
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Closing the Application", JOptionPane.YES_NO_OPTION);
        
        if (option == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null,"Closing the Application, Thank you!");
        System.exit(0);     
        }
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deposit;
    private javax.swing.JButton ViewBalance;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton transfer;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}
