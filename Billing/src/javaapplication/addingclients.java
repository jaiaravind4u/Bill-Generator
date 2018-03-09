/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author chandan
 */
public class addingclients extends javax.swing.JFrame {

    /**
     * Creates new form addingclients
     */
    public addingclients() {
        initComponents();
        this.setTitle("Adding clients");
        this.setExtendedState(MAXIMIZED_BOTH);
        jTextField1.setPreferredSize(new Dimension(150,30));
        jTextField2.setPreferredSize(new Dimension(150,30));
        jTextField3.setPreferredSize(new Dimension(150,30));
        jPasswordField1.setPreferredSize(new Dimension(150,30));
        jButton1.setPreferredSize(new Dimension(50,50));
        jButton2.setPreferredSize(new Dimension(50,50));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout(200, 150));

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {200};
        jPanel1Layout.rowHeights = new int[] {0};
        jPanel1.setLayout(jPanel1Layout);

        jLabel1.setText("USERNAME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("PASSWORD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("EMAIL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("PHONE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(jTextField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(jTextField2, gridBagConstraints);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(jTextField3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(jPasswordField1, gridBagConstraints);

        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        jButton2.setForeground(new java.awt.Color(0, 51, 204));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(jButton2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
String temp;
    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed

        if((evt.getKeyCode()>=96)&&(evt.getKeyCode()<=105) || evt.getKeyCode() == 8)
       {
           temp = null;
       }
       else
       {
           temp = jTextField3.getText();
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
 if(temp != null)
       {
           jTextField3.setText(temp);
       }
       else
       {
           //jTextField1.setText("hi");
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
                new Adminview().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing", "root", "pass");
            String sql = "INSERT INTO loginusers(username,password,email,phone) values (?,?,?,?)";
PreparedStatement statement = conn.prepareStatement(sql);
statement.setString(1,jTextField1.getText());
statement.setString(2,jPasswordField1.getText());
statement.setString(3,jTextField2.getText());
statement.setString(4,jTextField3.getText());
statement.executeUpdate();
Mailer.send("bluepearl273@gmail.com","bluepearl123",jTextField2.getText(),"Client Added","Welcome To abc Group Of Company"+
        "\nYour UserName :"+jTextField1.getText()+"\nPassword :"+jPasswordField1.getText());  
 JOptionPane.showMessageDialog(null,"Client Added"); 
jPasswordField1.setText("");
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(addingclients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addingclients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addingclients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addingclients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addingclients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}