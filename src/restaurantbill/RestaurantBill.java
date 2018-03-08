/*
RestaurantBill.java 
Created by: Lucas N-H
Created on: March 5, 2018
Last edited on: March 7, 2018
*/
package restaurantbill;

public class RestaurantBill {
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Meal, HST, Total;
        Meal = 138;
        HST = 0.13*Meal;
        Total = Meal+HST;
        System.out.println("Restaurant Bill"+"\n***************"+"\n\nMeal: $"
                +Meal+"\nHST: $"+HST+"\nTotal: $"+Total);
    }
}
