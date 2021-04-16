/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Menu.Menu;
import Business.Menu.MenuDirectory;
import Business.Orders.Order;
import Business.Orders.OrderHistory;
import Business.Restaurant.Restaurant;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private String quantity;
    private UserAccount userAccount;
    private EcoSystem system;
    Menu menu;
    ArrayList<Menu> ml;
    DefaultTableModel dtm;
    private String selectedRestaurantName;
    private Restaurant resObj;
    Order order;
    Double total1;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = account;
        this.ml = new ArrayList<>();
        this.total1 = 0.0;
        //valueLabel.setText(enterprise.getName());
        jPanel1.setVisible(false);
        populateRequestTable();
        populateComboBox();
        tableListener();
        customerName.setText(userAccount.getEmployee().getName());
        ratings.setVisible(false);
        saveRatings.setVisible(false);
              
    }
    
    public void tableListener(){
        dtm = (DefaultTableModel) menuItem.getModel();
        dtm.setRowCount(0);
       
        dtm.addTableModelListener(
            new TableModelListener()
            {
                public void tableChanged(TableModelEvent evt)
                {
                    
                    int col = evt.getColumn();
                    int row = evt.getFirstRow();
                    System.out.println(row+"as");
                    System.out.println(col+"as1");
                    menu = (Menu)dtm.getValueAt(row, 0);
                    quantity = String.valueOf(dtm.getValueAt(row,2));
//                    map1.put(course, rating);
                   
                }
            });
    }
    
    
    public void populateComboBox(){
         for(Restaurant res: system.getRestaurantDirectory().getRestaurantList()){
            restList.addItem(res.getName());
         
        }
    }
    
    public void addToCart(){
        
    }
    
    public void populateRequestTable(){
        
    }
    
    public void getMenuItems(String resName){
      
        
        System.out.println("RSSS "+ resName);
        
        System.out.println("Menu "+ system.getRestaurantDirectory().getRestaurantList().size());
        resObj = system.getRestaurantDirectory().findRestaurant(resName);
         
        if(resObj!=null && resObj.getMd()!=null){
            for(Menu m : resObj.getMd().getMenu()) {
                Object row[] = new Object[3];
                row[0] = m;
                row[1] = m.getItemPrice();

                dtm.addRow(row);
            }
        }
    }
    
    public void getCartTable(){
        DefaultTableModel dtm = (DefaultTableModel) orderHistory.getModel();
        dtm.setRowCount(0);
        
         System.out.println("Menu "+ system.getRestaurantDirectory().getRestaurantList().size());
        for(Order order : system.getOrderHistory().getOrderHisotry()){
            if(order.getUserAccount().getUsername().equals(userAccount.getEmployee().getName())){
                Object row[] = new Object[5];
                    row[0] =  order.getOrderID();
                    row[1] =  order;
                    row [2] = order.getRestaurant().getName();
                    row [3] = order.getComments();
                    row [4] = order.getAmount();
                    dtm.addRow(row);
            }
        }
        
    }

    public void getOrderDetails(Order o){
        DefaultTableModel dtm = (DefaultTableModel) orderDetails.getModel();
        dtm.setRowCount(0);
        
        for(Menu m : o.getMenuDirectory().getMenu()){
            Object row[] = new Object[3];
                row[0] = m.getItemName();
                row[1] = m.getItemPrice();
                row [2] =m.getQuantity();
                dtm.addRow(row);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        restList = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuItem = new javax.swing.JTable();
        placeOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        cartBtn = new javax.swing.JButton();
        trackOrder = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderHistory = new javax.swing.JTable();
        orderReceived = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderDetails = new javax.swing.JTable();
        viewOrderDetail = new javax.swing.JButton();
        ratings = new javax.swing.JComboBox<>();
        saveRatings = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        comments = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant Names");

        customerName.setText("<value>");

        restList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hotel Name" }));
        restList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restListActionPerformed(evt);
            }
        });

        menuItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item name", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuItem);

        placeOrder.setText("Place Order");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Amount");

        total.setText("<<Total>>");

        cartBtn.setText("Add to cart");
        cartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBtnActionPerformed(evt);
            }
        });

        trackOrder.setText("Track Order");
        trackOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackOrderActionPerformed(evt);
            }
        });

        orderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Order Status", "Restaurant name", "Order Comments", "Total Value"
            }
        ));
        jScrollPane3.setViewportView(orderHistory);

        orderReceived.setText("Order Received");
        orderReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderReceivedActionPerformed(evt);
            }
        });

        orderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(orderDetails);

        viewOrderDetail.setText("View Order Detail");
        viewOrderDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderDetailActionPerformed(evt);
            }
        });

        ratings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        saveRatings.setText("Save Ratings");
        saveRatings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRatingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(603, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(viewOrderDetail))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ratings, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orderReceived)
                    .addComponent(saveRatings))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(632, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderReceived)
                    .addComponent(viewOrderDetail))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveRatings))
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );

        comments.setColumns(20);
        comments.setRows(5);
        comments.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                commentsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                commentsFocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(comments);

        jLabel2.setText("Customer Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(471, 471, 471)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(cartBtn)
                        .addGap(132, 132, 132)
                        .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(trackOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(restList, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)
                                .addComponent(refreshTestJButton)))))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshTestJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(trackOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartBtn)
                            .addComponent(placeOrder))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

   
    private void restListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restListActionPerformed

        selectedRestaurantName = String.valueOf(restList.getSelectedItem());
        getMenuItems(selectedRestaurantName);
               

        
    }//GEN-LAST:event_restListActionPerformed

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        // TODO add your handling code here:
        //Menu m;
        OrderHistory orderHistory;
        ArrayList<Order> oh ;
        if(system.getOrderHistory()==null){
             orderHistory = new OrderHistory();
        }else
             orderHistory = system.getOrderHistory();
        
        
        if(orderHistory.getOrderHisotry()==null){
            oh = new ArrayList();
        }else
            oh = orderHistory.getOrderHisotry();
            
        
        
        MenuDirectory md = new MenuDirectory();
        md.setMenu(ml);
        System.out.println("Menu List "+ ml.size());
        System.out.println("Menu List "+ ml.get(0).getItemName());
        Order order = new Order();
        order.setMenuDirectory(md);
        order.setRestaurant(resObj);
        order.setUserAccount(userAccount);
        order.setComments(comments.getText());
        order.setAmount(total1);
        oh.add(order);
        orderHistory.setOrderHisotry(oh);
        
        
        system.setOrderHistory(orderHistory);
        
        getCartTable();
        JOptionPane.showMessageDialog(null,"Order Placed Successfully"
                , "INFO", JOptionPane.INFORMATION_MESSAGE);
       

    }//GEN-LAST:event_placeOrderActionPerformed

    private void cartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBtnActionPerformed
        // TODO add your handling code here:
        
        Menu menu1 = new Menu();
        MenuDirectory md = new MenuDirectory();
        
        menu1.setItemName(menu.getItemName());
        menu1.setItemPrice(menu.getItemPrice());
        menu1.setQuantity(Integer.parseInt(quantity));
       
        ml.add(menu1);
        
        total1 = total1 + menu.getItemPrice() * Integer.parseInt(quantity);
        this.total.setText(String.valueOf(total1));
        JOptionPane.showMessageDialog(null,"Item added to cart. Please add more items or Place Order to Proceed"
                , "INFO", JOptionPane.INFORMATION_MESSAGE);

        
      
    }//GEN-LAST:event_cartBtnActionPerformed

    private void trackOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackOrderActionPerformed
        // TODO add your handling code here:
       jPanel1.setVisible(true);
       getCartTable();

    }//GEN-LAST:event_trackOrderActionPerformed

    private void orderReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderReceivedActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderHistory.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        order = (Order)orderHistory.getValueAt(selectedRow,1);
        System.out.println("Order "+ order.getOrderStatus());
        order.setOrderStatus("Received");
        getCartTable();
        ratings.setVisible(true);
        saveRatings.setVisible(true);
        
        
    }//GEN-LAST:event_orderReceivedActionPerformed

    private void viewOrderDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderDetailActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderHistory.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        order = (Order)orderHistory.getValueAt(selectedRow,1);
        getOrderDetails(order);
        
        
    }//GEN-LAST:event_viewOrderDetailActionPerformed

    private void commentsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_commentsFocusGained
        // TODO add your handling code here:
        if(comments.getText().equals("")){
            comments.setText("Enter the comments here");
            
        }
    }//GEN-LAST:event_commentsFocusGained

    private void commentsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_commentsFocusLost
        // TODO add your handling code here:
        if(comments.getText().equals("")){
            comments.setText("Enter the comments here");
           
        }
        
    }//GEN-LAST:event_commentsFocusLost

    private void saveRatingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRatingsActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderHistory.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        order = (Order)orderHistory.getValueAt(selectedRow,1);
        System.out.println("Order "+ order.getOrderStatus());
        order.getDeliveryMan().setRatings(Integer.parseInt(ratings.getSelectedItem().toString()));
        JOptionPane.showMessageDialog(null,"Rating Successfull", "Warining", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_saveRatingsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cartBtn;
    private javax.swing.JTextArea comments;
    private javax.swing.JLabel customerName;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable menuItem;
    private javax.swing.JTable orderDetails;
    private javax.swing.JTable orderHistory;
    private javax.swing.JButton orderReceived;
    private javax.swing.JButton placeOrder;
    private javax.swing.JComboBox<String> ratings;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JComboBox<String> restList;
    private javax.swing.JButton saveRatings;
    private javax.swing.JLabel total;
    private javax.swing.JButton trackOrder;
    private javax.swing.JButton viewOrderDetail;
    // End of variables declaration//GEN-END:variables
}
