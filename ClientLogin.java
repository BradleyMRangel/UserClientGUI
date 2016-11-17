
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.net.Socket;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bradley
 */
public class ClientLogin extends javax.swing.JFrame {

    
    public String username, password, serverOut;
    private String logU;

    /**
     * Creates new form ClientLogin
     */
    public ClientLogin() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorWindow = new javax.swing.JPopupMenu();
        successWindow = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Login = new javax.swing.JButton();
        btn_Register = new javax.swing.JButton();
        txt_Username = new javax.swing.JTextField();
        txt_Password = new javax.swing.JTextField();
        invalidUser = new javax.swing.JLabel();
        invalidPass = new javax.swing.JLabel();
        lbl_response = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Password");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Username");

        btn_Login.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        btn_Register.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Register.setText("Register");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });

        txt_Username.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsernameActionPerformed(evt);
            }
        });

        txt_Password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        invalidUser.setForeground(new java.awt.Color(255, 0, 51));

        invalidPass.setForeground(new java.awt.Color(255, 0, 51));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Student Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_Register)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(lbl_response))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(txt_Username)
                            .addComponent(invalidUser)
                            .addComponent(invalidPass)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(invalidUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidPass)
                .addGap(98, 98, 98)
                .addComponent(lbl_response)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsernameActionPerformed

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        new ClientRegistration().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed

    
    username = txt_Username.getText();
    password = txt_Password.getText();
    if (errorLogin(username,password)){
        
        logU = "LOGU " + "\"" + username + "\"" + " " + "\""+ password + "\"" + "\r";
        System.out.println(logU);
        try{
            TCPConnection conn = TCPConnection.getInstance();
            String serverResponse = conn.readWrite(logU);
            
            System.out.println(serverResponse);
            if (serverResponse.equalsIgnoreCase("LOGR F")){
                JOptionPane.showMessageDialog(errorWindow, "Invalid username and password combination.  Click 'register' to create a new account.","CRITICAL ERROR", JOptionPane.ERROR_MESSAGE);
                
            }
            else if (serverResponse.equalsIgnoreCase("LOGR S")){
                JOptionPane.showMessageDialog(successWindow, "Login Successful... BIENVENIDOS","SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                EnrolledClasses classList = new EnrolledClasses();
                classList.setVisible(true);
                this.setVisible(false);
               
            }
            
            else
                JOptionPane.showMessageDialog(errorWindow, "There was a problem","CRITICAL ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            
            //Catches exceptions for anything like connection problems
            JOptionPane.showMessageDialog(errorWindow, "There was an error in the connection","CRITICAL ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }
    }//GEN-LAST:event_btn_LoginActionPerformed

    private boolean errorLogin (String Uname, String Pass) {
        
        boolean Error = true;
        while(Error){
                
            if(!Uname.matches("[a-zA-Z0-9]+")){
                txt_Username.setText("");
                invalidUser.setText("This field cannot be blank and must consist of letters (a-z or A-Z) or numbers (0-9)");
                Error = false;
            }
            else if(Uname.length() > 20){ 
                txt_Username.setText("");
                invalidUser.setText("The username cannot be more than 20 characters");
                Error = false;
            }
            else{
                invalidUser.setText("");
                username = txt_Username.getText();
            }
            
            if(Pass.length() == 0){
                txt_Password.setText("");
                invalidPass.setText("Password cannot be blank");
                Error = false;
            }
            else if(Pass.length() > 20){
                txt_Password.setText("");
                invalidPass.setText("The password cannot be more than 20 characters");
                Error = false;
            }
            else if(Pass.contains(" ")){
                txt_Password.setText("");
                invalidPass.setText("Password cannot contain spaces");
            }
            else {
                invalidPass.setText("");
                password = txt_Password.getText();
            }
            break;
            }
        return Error;
    }
        
  
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
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new ClientLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_Register;
    private javax.swing.JPopupMenu errorWindow;
    private javax.swing.JLabel invalidPass;
    private javax.swing.JLabel invalidUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_response;
    private javax.swing.JPopupMenu successWindow;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
