/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization;
import Business.Role.CustomerRole;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author psrib
 */
public class CreateCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCustomer
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Organization organization;
    CustomerDirectory customerDirectory;
    
    public CreateCustomerJPanel(JPanel userProcessContainer,EcoSystem system, Organization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.organization=organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addCustomer = new javax.swing.JButton();
        cName = new javax.swing.JTextField();
        cPhone = new javax.swing.JTextField();
        cAddress = new javax.swing.JTextField();
        cLandmark = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cUsername = new javax.swing.JTextField();
        cPass = new javax.swing.JTextField();
        createCustBack = new javax.swing.JButton();

        jLabel1.setText("Create Customer");

        jLabel2.setText("Customer Name");

        jLabel3.setText("Customer Address");

        jLabel4.setText("Customer Phone no.");

        jLabel6.setText("Customer Landmark");

        addCustomer.setText("Create");
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });

        cPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPhoneActionPerformed(evt);
            }
        });

        jLabel7.setText("Customer Username");

        jLabel8.setText("Customer Password");

        createCustBack.setText("Back");
        createCustBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(112, 112, 112))
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cPhone)
                            .addComponent(cAddress)
                            .addComponent(cLandmark)
                            .addComponent(cName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(createCustBack)
                        .addGap(71, 71, 71)
                        .addComponent(addCustomer)))
                .addContainerGap(450, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cLandmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomer)
                    .addComponent(createCustBack))
                .addGap(170, 170, 170))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPhoneActionPerformed

    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed
        // TODO add your handling code here:
        String cname = cName.getText();
        String cphone = cPhone.getText();
        String cAdd = cAddress.getText();
        String cLand = cLandmark.getText();
        String cuname = cUsername.getText();
        String cpass = cPass.getText();
        System.out.println("CNAme "+ cname);
        
        Employee emp = organization.getEmployeeDirectory().createEmployee(cname);
        organization.getUserAccountDirectory().createUserAccount(cuname, cpass, emp, new CustomerRole());
        system.getCustomerDirectory().createCustomer(cname, cphone, cLand, cAdd);

        
        if(system.getCustomerDirectory()!=null){
          customerDirectory = organization.getCustomerDirectory();  
        }else
            customerDirectory = new CustomerDirectory();
        system.setCustomerDirectory(customerDirectory);
        
        
        
//        if(organization.getCustomerDirectory()==null){
//            customerDirectory = new CustomerDirectory();
//        }else{
//            customerDirectory = organization.getCustomerDirectory();
//        }
//        organization.setCustomerDirectory(customerDirectory);
       
                      
    }//GEN-LAST:event_addCustomerActionPerformed

    private void createCustBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCustBackActionPerformed
        // TODO add your handling code here:
        
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof SystemAdminWorkAreaJPanel){
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
               systemAdminWorkAreaJPanel.populateTree(); 
            }
        }
    }//GEN-LAST:event_createCustBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomer;
    private javax.swing.JTextField cAddress;
    private javax.swing.JTextField cLandmark;
    private javax.swing.JTextField cName;
    private javax.swing.JTextField cPass;
    private javax.swing.JTextField cPhone;
    private javax.swing.JTextField cUsername;
    private javax.swing.JButton createCustBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
