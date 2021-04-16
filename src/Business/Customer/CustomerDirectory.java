/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Organization;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
      private ArrayList<Organization> organizationList;

      private ArrayList<Customer> customerList;

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    public CustomerDirectory() {
        organizationList = new ArrayList();
        customerList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
      if (type.getValue().equals(Organization.Type.Customer.getValue())){
            organization = new Customer();
            organizationList.add(organization);
    }

        return organization;
    }
    public void deleteCustomer(Customer customer){
        organizationList.remove(customer); 
        customerList.remove(customer);
    }
    
        public Organization searchOrganization(String organizationName){
        for (Organization organization: organizationList) {
            if (organization.getName().equals(organizationName)) {
                return organization;
            }
        }
        return null;
    }
        
    public Customer createCustomer(String cname, int phone, String landmark, String add){
        
        Customer customer = new Customer();
        customer.setCustomerName(cname);
        customer.setCustomerPhone(phone);
        customer.setCustomerLandmark(landmark);
        customer.setCustomerAddress(add);
        customerList.add(customer);
        
        return customer;
        
    }
    
 
            
}
