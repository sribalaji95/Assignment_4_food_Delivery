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
import javax.swing.JOptionPane;
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
        createCustBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cPass = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create Customer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 37, 215, 47));

        jLabel2.setText("Customer Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 133, -1, -1));

        jLabel3.setText("Customer Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 256, -1, -1));

        jLabel4.setText("Customer Phone no.");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 200, -1, -1));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 335, -1, -1));

        jLabel6.setText("Customer Landmark");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 304, -1, -1));

        addCustomer.setText("Create");
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });
        add(addCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 466, 95, 37));
        add(cName, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 130, 151, -1));

        cPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPhoneActionPerformed(evt);
            }
        });
        add(cPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 197, 151, -1));
        add(cAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 253, 151, -1));
        add(cLandmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 301, 151, -1));

        jLabel7.setText("Customer Username");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 355, -1, -1));

        jLabel8.setText("Customer Password");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 410, -1, -1));
        add(cUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 352, 151, -1));

        createCustBack.setText("Back");
        createCustBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustBackActionPerformed(evt);
            }
        });
        add(createCustBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 472, 83, -1));

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));
        add(cPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPhoneActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cPhoneActionPerformed

    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed
        // TODO add your handling code here:
        String cname = cName.getText();
        int cphone=0; 
        
        String cAdd = cAddress.getText();
        String cLand = cLandmark.getText();
        String cuname = cUsername.getText();
        char[] passa = cPass.getPassword();
        String cpass = String.valueOf(passa);
        //String cpass = cPass.getSelectedText();
        System.out.println("CNAme "+ cname);
        
        if(cname.isEmpty() || cAdd.isEmpty() || cLand.isEmpty() || cuname.isEmpty() || cpass.isEmpty()){
           JOptionPane.showMessageDialog(null,"All the fields are required", "Success", JOptionPane.ERROR_MESSAGE);
           return;
        }
        try {
            cphone = Integer.parseInt(cPhone.getText());
        } catch (NumberFormatException nfe) {
            cPhone.setText("");
            jLabel9.setText("Only numbers are allowed (10 digits)");
            return;
        }
        
        if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(cuname)){
            JOptionPane.showMessageDialog(null,"This user already exists", "Success", JOptionPane.ERROR_MESSAGE);
           return; 
        }
        
        Employee emp = organization.getEmployeeDirectory().createEmployee(cname);
        organization.getUserAccountDirectory().createUserAccount(cuname, cpass, emp, new CustomerRole());
        system.getCustomerDirectory().createCustomer(cname, cphone, cLand, cAdd);

        
        if(system.getCustomerDirectory()!=null){
          customerDirectory = organization.getCustomerDirectory();  
        }else
            customerDirectory = new CustomerDirectory();
        system.setCustomerDirectory(customerDirectory);
        
        JOptionPane.showMessageDialog(null,"Customer Added!", "Success", JOptionPane.INFORMATION_MESSAGE);

        
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
    private javax.swing.JPasswordField cPass;
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
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
