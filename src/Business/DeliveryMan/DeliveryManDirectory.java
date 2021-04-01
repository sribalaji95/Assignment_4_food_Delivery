/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    ArrayList<DeliveryMan> deliveryman;
    
    public DeliveryManDirectory(){
        this.deliveryman = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(ArrayList<DeliveryMan> deliveryman) {
        this.deliveryman = deliveryman;
    }
    
   public DeliveryMan createDeliveryMan(String name, String add){
       
       DeliveryMan dm = new DeliveryMan();
       dm.setDeliveryManName(name);
       dm.setDeliAdd(add);
       deliveryman.add(dm);
       
       return dm;      
       
   }
   
   public DeliveryMan findDeliveryMan(String name){
       for(DeliveryMan dm :deliveryman ){
           
           if(dm.getDeliveryManName().equals(name)){
               return dm;
           }
       }
       return null;
   }
   
   public void deleteDeliveryMan(DeliveryMan deliveryMan){
       deliveryman.remove(deliveryMan);
   }
}
