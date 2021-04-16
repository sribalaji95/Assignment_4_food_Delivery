/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
    String deliveryManName;
    String deliAdd;
    int ratings;
    boolean status = true;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public String getDeliAdd() {
        return deliAdd;
    }

    public void setDeliAdd(String deliAdd) {
        this.deliAdd = deliAdd;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
    
    @Override
    public String toString(){
        return deliveryManName;
    }
    
    
    
}
