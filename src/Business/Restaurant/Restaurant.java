/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author harold
 */
public class Restaurant {
    String restaurantName;
    int restaurantId;
    
    public void setRestaurantName(String restaurantName){
        this.restaurantName = restaurantName;
    }
    
    public String getRestaurantName(){
        return this.restaurantName;
    }
    
    public void setRestaurantId(int restaurantId){
        this.restaurantId = restaurantId;
    }
    
    public int getRestaurantId(){
        return this.restaurantId;
    }
}