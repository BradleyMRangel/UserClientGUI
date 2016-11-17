
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bradley
 */


public class EnrolledClasses extends javax.swing.JFrame {


    final DefaultTableModel table;
    public String crnVal = "";
    public int selectedRow;
    private String CDRP, ELST, LOGO;
    
    /**
     * Creates new form EnrolledClasses
     */    
    public EnrolledClasses() {
        initComponents();
        
        table = new DefaultTableModel(0,0);
        String header [] = new String[] {"Course Num","Class Name","Institution", "Admin", "Start Date", "End Date", "Public IP", "Meeting Times"};
        table.setColumnIdentifiers(header);
        tbl_Schedule.setModel(table);
        tbl_Schedule.getColumnModel().getColumn(0).setPreferredWidth(12); //Course Num
        tbl_Schedule.getColumnModel().getColumn(1).setPreferredWidth(40); //Class Name
        tbl_Schedule.getColumnModel().getColumn(2).setPreferredWidth(40); //Institution
        tbl_Schedule.getColumnModel().getColumn(3).setPreferredWidth(15); //Admin ID
        tbl_Schedule.getColumnModel().getColumn(4).setPreferredWidth(10); //Start Date
        tbl_Schedule.getColumnModel().getColumn(5).setPreferredWidth(15); //End Date
        tbl_Schedule.getColumnModel().getColumn(6).setPreferredWidth(15); //Public IP
        tbl_Schedule.getColumnModel().getColumn(7).setMinWidth(100); //Meeting Times
        viewClasses();
        
        ListSelectionModel rowSM = tbl_Schedule.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                
                if (e.getValueIsAdjusting())
                    return;
                ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                
                if(! lsm.isSelectionEmpty()){
                    
                    selectedRow = lsm.getMinSelectionIndex();
                    Object value = tbl_Schedule.getModel().getValueAt(selectedRow, 0);
                    crnVal = value.toString();
                    System.out.println(crnVal);
                    
                }

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorWindow = new javax.swing.JPopupMenu();
        successWindow = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Schedule = new javax.swing.JTable();
        btn_Logout = new javax.swing.JButton();
        btn_Searchclasses = new javax.swing.JButton();
        btn_Dropclass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_Schedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Num", "Class Name", "Institution", "Admin", "Start Date", "End Date", "Public IP", "Meeting Times"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Schedule.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_Schedule);

        btn_Logout.setBackground(new java.awt.Color(240, 102, 102));
        btn_Logout.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Logout.setText("Logout");
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        btn_Searchclasses.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Searchclasses.setText("Search For Classes");
        btn_Searchclasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchclassesActionPerformed(evt);
            }
        });

        btn_Dropclass.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_Dropclass.setText("Drop Class");
        btn_Dropclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DropclassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btn_Searchclasses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 760, Short.MAX_VALUE)
                .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Dropclass, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_Dropclass, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Searchclasses, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SearchclassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchclassesActionPerformed

        ClassSearch search = new ClassSearch();
        search.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_SearchclassesActionPerformed

    private void btn_DropclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DropclassActionPerformed
        // TODO add your handling code here:
        //Drop Class Request
        
        try{
            TCPConnection conn = TCPConnection.getInstance();
            CDRP = "CDRP " + "\""+crnVal+"\""+"\r";
            String response = conn.readWrite(CDRP);
            
            if (response.equalsIgnoreCase("CDRR S")){
                
            //"Class Sucessfully Dropped"
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to drop this class?", "Proceed with Caution", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                table.removeRow(selectedRow);
                JOptionPane.showMessageDialog(successWindow,"Class dropped Successfully","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
            }
            else
                return;
            //table.removeRow(selectedRow);
            //JOptionPane.showMessageDialog(successWindow,"Class dropped Successfully","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
            
            }
            else if(response.equalsIgnoreCase("CDRR F")){
            JOptionPane.showMessageDialog(errorWindow,"There was an error dropping this class","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(errorWindow,"You messed up.","CRITICAL ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_DropclassActionPerformed

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed

        try{
            TCPConnection conn = TCPConnection.getInstance();
            LOGO = "LOGO\r";
            String logoutResponse = conn.readWrite(LOGO);
            if(logoutResponse.equalsIgnoreCase("LOGO S")){
            conn.closeSocket();
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

    public void viewClasses(){
        String response="";
        try{
            //Enrolled Class Request
            TCPConnection conn = TCPConnection.getInstance();
            ELST = "ELST"+"\r";
            //ELSR MessageCode "ClassID" "ClassID" ...         
            response = conn.readWrite(ELST);
            if (response.startsWith("ELSR S"))
            {
                response = response.replace("ELSR S", "");
                String [] crnValues = response.split(" ");
                for(int i = 1; i < crnValues.length; i++){
                    crnValues[i] = crnValues[i].replace("\"","");
                    try{
                        //class view request
                        String CDTL = "CDTL " + "\"" + crnValues[i] +"\""+"\r";
                        String serverResponse = conn.readWrite(CDTL);          
                                if (serverResponse.contains("CDTR S")){
                                    
                                    serverResponse = serverResponse.replace("CDTR S ", "");

                                    String[] array = serverResponse.split("\" \"");
                                    for(int w = 0; w < 8; w++){
                                        array[w] = array[w].replace("\"","");
                                        System.out.println(array[w]);
                                    }
                                    table.addRow(new Object[] {array[0],array[1],array[2], 
                                        array[3], array[4], array[5], array[6], array[7]});                                    
//                                    table.addRow(new Object[] {array[1],array[2],array[3], 
//                                        array[4], array[5], array[6], array[7], array[8]});
                                }
                                else if (response.contains("CDTR F")){
                                    JOptionPane.showMessageDialog(errorWindow, "There were no classes found","FYI", JOptionPane.INFORMATION_MESSAGE);
                                }
                    }catch (Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(errorWindow, "You messed up","Critical Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(errorWindow, "You messed up","Critical Error", JOptionPane.ERROR_MESSAGE);            
        }
    }
    
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
            java.util.logging.Logger.getLogger(EnrolledClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnrolledClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnrolledClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnrolledClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnrolledClasses().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Dropclass;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_Searchclasses;
    private javax.swing.JPopupMenu errorWindow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu successWindow;
    private javax.swing.JTable tbl_Schedule;
    // End of variables declaration//GEN-END:variables
}
