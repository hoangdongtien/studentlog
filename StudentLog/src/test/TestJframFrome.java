/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.aprotrain.sl.dal.dao.EmployeeService;
import com.aprotrain.sl.dal.entity.Employee;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class TestJframFrome extends javax.swing.JFrame {

    String[] title = {"Employee ID", "FullName", "SocialID", "InternalEMail", "External Email", "DOB", "Joining Date", "Password", "Status"};
    DefaultTableModel dftblEmployee;
    EmployeeService obj = new EmployeeService();

    public TestJframFrome() {
        initComponents();
        dftblEmployee = new DefaultTableModel(title, 0);
        tblEmployee.setModel(dftblEmployee);
        txtEmpID.setEnabled(true);

        loadAllEmployee();
    }

    public void loadAllEmployee() {
        List<Employee> lEmp = obj.listAll();

        dftblEmployee.setRowCount(0);

        for (Employee listEmp : lEmp) {
            Object[] data = new Object[]{listEmp.getEmployeeId(), listEmp.getFullname(), listEmp.getSocialId(), listEmp.getInternalEmail(), listEmp.getExternalEmail(), listEmp.getDob(), listEmp.getJoiningDate(), listEmp.getPassword(), listEmp.getEmployeeStatus()};
            dftblEmployee.addRow(data);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSocialID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtInternalEmail = new javax.swing.JTextField();
        txtExternalEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        txtJoiningDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btAddNewEmployee = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btFind = new javax.swing.JButton();
        btShow = new javax.swing.JButton();
        rdoEnabled = new javax.swing.JRadioButton();
        rdoDisabled = new javax.swing.JRadioButton();
        btSaveOrUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEmployee);

        jLabel1.setText("EmployeeID");

        jLabel2.setText("Full Name");

        jLabel3.setText("SocialID");

        jLabel4.setText("Internal Email");

        jLabel5.setText("External Exmail");

        jLabel6.setText("DOB");

        txtJoiningDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJoiningDateActionPerformed(evt);
            }
        });

        jLabel7.setText("Joining Date");

        jLabel8.setText("Password");

        jLabel9.setText("Employee Status");

        btAddNewEmployee.setText("Add");
        btAddNewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddNewEmployeeActionPerformed(evt);
            }
        });

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btFind.setText("Find");
        btFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindActionPerformed(evt);
            }
        });

        btShow.setText("Show");

        buttonGroup1.add(rdoEnabled);
        rdoEnabled.setText("Enabled");

        buttonGroup1.add(rdoDisabled);
        rdoDisabled.setText("Disabled");

        btSaveOrUpdate.setText("Save or Update");
        btSaveOrUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveOrUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAddNewEmployee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btFind)
                        .addGap(18, 18, 18)
                        .addComponent(btShow)
                        .addGap(18, 18, 18)
                        .addComponent(btSaveOrUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJoiningDate, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExternalEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInternalEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSocialID, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoEnabled)
                                .addGap(37, 37, 37)
                                .addComponent(rdoDisabled))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSocialID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtInternalEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtExternalEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtJoiningDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rdoEnabled)
                    .addComponent(rdoDisabled))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddNewEmployee)
                    .addComponent(btFind)
                    .addComponent(btUpdate)
                    .addComponent(btDelete)
                    .addComponent(btShow)
                    .addComponent(btSaveOrUpdate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJoiningDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJoiningDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJoiningDateActionPerformed

    private void btAddNewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddNewEmployeeActionPerformed
        Employee emp = new Employee();

        emp.setFullname(txtFullName.getText());
        emp.setSocialId(txtSocialID.getText());
        emp.setInternalEmail(txtInternalEmail.getText());
        emp.setExternalEmail(txtExternalEmail.getText());
        emp.setDob(txtDOB.getText());
        emp.setJoiningDate(txtJoiningDate.getText());
        emp.setPassword(txtPassword.getText());

        if (rdoEnabled.isSelected()) {
            emp.setEmployeeStatus(Byte.parseByte("1"));
        } else {
            emp.setEmployeeStatus(Byte.parseByte("0"));
        }

        obj.add(emp);

        JOptionPane.showMessageDialog(null, "Add new Employee has successfull");

        loadAllEmployee();
    }//GEN-LAST:event_btAddNewEmployeeActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        Employee emp = new Employee();

        emp.setEmployeeId(Long.parseLong(txtEmpID.getText()));
        emp.setFullname(txtFullName.getText());
        emp.setSocialId(txtSocialID.getText());
        emp.setInternalEmail(txtInternalEmail.getText());
        emp.setExternalEmail(txtExternalEmail.getText());
        emp.setDob(txtDOB.getText());
        emp.setJoiningDate(txtJoiningDate.getText());
        emp.setPassword(txtPassword.getText());

        if (rdoEnabled.isSelected()) {
            emp.setEmployeeStatus(Byte.parseByte("1"));
        } else {
            emp.setEmployeeStatus(Byte.parseByte("0"));
        }

        obj.update(emp);

        JOptionPane.showMessageDialog(null, "Update Employee has successfull");

        loadAllEmployee();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btSaveOrUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveOrUpdateActionPerformed
        Employee emp = new Employee();

        emp.setEmployeeId(Long.parseLong(txtEmpID.getText()));
        emp.setFullname(txtFullName.getText());
        emp.setSocialId(txtSocialID.getText());
        emp.setInternalEmail(txtInternalEmail.getText());
        emp.setExternalEmail(txtExternalEmail.getText());
        emp.setDob(txtDOB.getText());
        emp.setJoiningDate(txtJoiningDate.getText());
        emp.setPassword(txtPassword.getText());

        if (rdoEnabled.isSelected()) {
            emp.setEmployeeStatus(Byte.parseByte("1"));
        } else {
            emp.setEmployeeStatus(Byte.parseByte("0"));
        }

        obj.saveOrUpdate(emp);

        JOptionPane.showMessageDialog(null, "Save or Update Employee has successfull");

        loadAllEmployee();
    }//GEN-LAST:event_btSaveOrUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        Employee emp = new Employee();
        emp.setEmployeeId(Long.parseLong(txtEmpID.getText()));

        obj.delete(emp);
        JOptionPane.showMessageDialog(null, "Change Status Employee has successfull");
        loadAllEmployee();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindActionPerformed
       
        String searchByName=JOptionPane.showInputDialog(null, "Please input FullName");
        List<Employee> listE=obj.search(searchByName);
        
        dftblEmployee.setRowCount(0);
        for (Employee listEmp : listE) {
             Object[] data = new Object[]{listEmp.getEmployeeId(), listEmp.getFullname(), listEmp.getSocialId(), listEmp.getInternalEmail(), listEmp.getExternalEmail(), listEmp.getDob(), listEmp.getJoiningDate(), listEmp.getPassword(), listEmp.getEmployeeStatus()};
             dftblEmployee.addRow(data);
        }
    }//GEN-LAST:event_btFindActionPerformed

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
            java.util.logging.Logger.getLogger(TestJframFrome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestJframFrome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestJframFrome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestJframFrome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestJframFrome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddNewEmployee;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btFind;
    private javax.swing.JButton btSaveOrUpdate;
    private javax.swing.JButton btShow;
    private javax.swing.JButton btUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoDisabled;
    private javax.swing.JRadioButton rdoEnabled;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtExternalEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtInternalEmail;
    private javax.swing.JTextField txtJoiningDate;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSocialID;
    // End of variables declaration//GEN-END:variables
}
