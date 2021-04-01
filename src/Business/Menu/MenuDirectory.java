/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author psrib
 */
public class MenuDirectory {
    
    ArrayList<Menu> menu;
    
    public MenuDirectory(){
        this.menu = new ArrayList<>();
        
    }

    public ArrayList<Menu> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Menu> menu) {
        this.menu = menu;
    }
    
    public void deleteMenu(Menu m){
        menu.remove(m);
    }
 
    
}
