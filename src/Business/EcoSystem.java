/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Menu.MenuDirectory;
import Business.Orders.OrderHistory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private OrderHistory orderHistory;
    private MenuDirectory menuDirectory;

    public OrderHistory getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(OrderHistory orderHistory) {
        this.orderHistory = orderHistory;
    }

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory,
                        OrderHistory orderHistory, MenuDirectory menuDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.orderHistory = orderHistory;
        this.menuDirectory = menuDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    //   enterpriseDirectory=new EnterpriseDirectory();
        customerDirectory = new CustomerDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
        restaurantDirectory = new RestaurantDirectory();
        orderHistory = new OrderHistory();
        
    }

    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    
    
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
