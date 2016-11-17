
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bradley
 */
public class ClassSearch extends javax.swing.JFrame {
    
    final DefaultTableModel model;
    public String crnVal = "Taco";
    private String CSRC, CDTL, ENRL, LOGO;
    
    public ClassSearch() {
        initComponents();
        model = new DefaultTableModel(0,0);
        String header [] = new String[] {"Course Num","Class Name","Institution", "Admin", "Start Date", "End Date", "Public IP", "Meeting Times"};
        model.setColumnIdentifiers(header);
        tbl_ClassTable.setModel(model);
        tbl_ClassTable.getColumnModel().getColumn(0).setPreferredWidth(12); //Course Num
        tbl_ClassTable.getColumnModel().getColumn(1).setPreferredWidth(40); //Class Name
        tbl_ClassTable.getColumnModel().getColumn(2).setPreferredWidth(40); //Institution
        tbl_ClassTable.getColumnModel().getColumn(3).setPreferredWidth(15); //Admin ID
        tbl_ClassTable.getColumnModel().getColumn(4).setPreferredWidth(10); //Start Date
        tbl_ClassTable.getColumnModel().getColumn(5).setPreferredWidth(15); //End Date
        tbl_ClassTable.getColumnModel().getColumn(6).setPreferredWidth(15); //Public IP
        tbl_ClassTable.getColumnModel().getColumn(7).setMinWidth(100); //Meeting Times
        
        ListSelectionModel rowSM = tbl_ClassTable.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                
                if (e.getValueIsAdjusting())
                    return;
                ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                if(! lsm.isSelectionEmpty()){
                    
                    int selectedRow = lsm.getMinSelectionIndex();
                    Object value = tbl_ClassTable.getModel().getValueAt(selectedRow, 0);
                    crnVal = value.toString();
                    System.out.println(crnVal);

                }

            }
        });
    }
    


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorPopup = new javax.swing.JPopupMenu();
        successPopup = new javax.swing.JPopupMenu();
        txt_Classname = new javax.swing.JTextField();
        txt_Institution = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_Logout = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_ClassTable = new javax.swing.JTable();
        btn_Enroll = new javax.swing.JButton();
        btn_Backtoschedule = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Classname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txt_Institution.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Class Name");

        btn_Search.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Search.setText("Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Institution");

        btn_Logout.setBackground(new java.awt.Color(255, 102, 102));
        btn_Logout.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Logout.setText("Logout");
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        tbl_ClassTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Num", "Class Name", "Institution", "Admin", "Start Date", "End Date", "Public IP", "Meeting Times"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ClassTable.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        tbl_ClassTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl_ClassTable);

        btn_Enroll.setBackground(new java.awt.Color(102, 255, 102));
        btn_Enroll.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Enroll.setText("Enroll in Class");
        btn_Enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnrollActionPerformed(evt);
            }
        });

        btn_Backtoschedule.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Backtoschedule.setText("Back to Schedule");
        btn_Backtoschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BacktoscheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1222, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_Backtoschedule, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Classname, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Institution, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(btn_Enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_Classname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_Institution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 311, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Backtoschedule, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
//    private void getID(String value){
//        this.crnVal = value;
//    }
    
    
    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        
        if (txt_Classname.getText() != null || txt_Institution.getText() != null){
            
            String ClassName = txt_Classname.getText();
            String Institution = txt_Institution.getText();
            
            //requests the lists containing either classname or institution.
            CSRC = "CSRC " + "\""+ ClassName +"\"" + " " + "\"" + Institution + "\"" +"\r";
            
            
                try{
                    TCPConnection conn = TCPConnection.getInstance();
                    String serverResponse = conn.readWrite(CSRC);
                    if (serverResponse.startsWith("CSRR S"))
                    {
                        String x = serverResponse.replace("CSRR S", "");
                        String [] crnValues = x.split(" ");
                        
                        
                        for(int i = 1; i < crnValues.length; i++){
                            crnValues[i] = crnValues[i].replace("\"","");

                            try{
                                //class view request
                                String CDTL = "CDTL " + "\"" + crnValues[i] +"\""+"\r";
                                String response = conn.readWrite(CDTL);
                                
                                if (response.contains("CDTR S")){
                                    
                                    response = response.replace("CDTR S ", "");
                                    //String[] array = response.split(" ");
                                    String[] array = response.split("\" \"");
                                            
                                    for(int w = 0; w < 8; w++){
                                        array[w] = array[w].replace("\"","");
                                        System.out.println(array[w]);
                                    }
                                    model.addRow(new Object[] {array[0],array[1],array[2], 
                                        array[3], array[4], array[5], array[6], array[7]});                                    
//                                    model.addRow(new Object[] {array[1],array[2],array[3], 
//                                        array[4], array[5], array[6], array[7], array[8]});
                                }
                                else if (response.contains("CDTR F")){
                                    JOptionPane.showMessageDialog(errorPopup, "There were no classes found","Error", JOptionPane.ERROR_MESSAGE);
                                }
//                                else
//                                    System.out.println("Not expecting that, son");
                                    
                        } catch (Exception e){
                            JOptionPane.showMessageDialog(errorPopup, "You messed up","Critical Error", JOptionPane.ERROR_MESSAGE);
                            e.printStackTrace();
                        };
                        }
                    }
                    
                    else if (serverResponse.equalsIgnoreCase("CSRR F")){
                        JOptionPane.showMessageDialog(errorPopup, "The search returned 0 results","Whoops", JOptionPane.INFORMATION_MESSAGE); 
                    }
                    
                }
                catch (Exception  e){
                    JOptionPane.showMessageDialog(errorPopup, "There was an error in the connection","CRITICAL ERROR", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
        }
    }//GEN-LAST:event_btn_SearchActionPerformed


    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        try{
            TCPConnection connection = TCPConnection.getInstance();
            LOGO = "LOGO\r";
            String logoutResponse = connection.readWrite(LOGO);
            if(logoutResponse.equalsIgnoreCase("LOGO S")){
            connection.closeSocket();
            this.setVisible(false);
            ClientLogin client = new ClientLogin();
            client.setVisible(true);
        }
            else if(logoutResponse.equalsIgnoreCase("LOGO F")){
            System.out.println("You failed, son");
        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void btn_EnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnrollActionPerformed

        
        try{
            
            //String CDTL = "CDTL" + "\"" + crnValues[i] +"\""+"\r";
            TCPConnection conn = TCPConnection.getInstance();
            String MacAddress = conn.getMACAddress();
            String ENRL = "ENRL "+ "\"" + crnVal + "\"" + " " + "\"" + MacAddress +"\""+"\r";
            String response = conn.readWrite(ENRL);
            
            if (response.equalsIgnoreCase("ENRR S"))
            {
                JOptionPane.showMessageDialog(successPopup, "Enrollment Successful" ,"SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (response.equalsIgnoreCase("ENRR F"))
            {
                JOptionPane.showMessageDialog(errorPopup, "Enrollment Failed..." ,"CRITICAL ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btn_EnrollActionPerformed

    private void btn_BacktoscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BacktoscheduleActionPerformed
        // TODO add your handling code here:
        EnrolledClasses schedule = new EnrolledClasses();
        this.setVisible(false);
        schedule.setVisible(true);
    }//GEN-LAST:event_btn_BacktoscheduleActionPerformed

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
            java.util.logging.Logger.getLogger(ClassSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Backtoschedule;
    private javax.swing.JButton btn_Enroll;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_Search;
    private javax.swing.JPopupMenu errorPopup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu successPopup;
    private javax.swing.JTable tbl_ClassTable;
    private javax.swing.JTextField txt_Classname;
    private javax.swing.JTextField txt_Institution;
    // End of variables declaration//GEN-END:variables
}
