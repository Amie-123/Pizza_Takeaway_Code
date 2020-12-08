//PIZZA TAKEAWAY CODE:

//1. Asks the user what size pizza they want (prices are different)
//2. Asks for the amount toppings that they want (prices are different) 
//3. Asks the user for what those toppings are
//4. Prints out entire pizza order with the price attached 
//5. Asks the user for what drinks they would like 
//6. Prints out this order with the prices attached 
//7. Allows the user to make another order or they could stop 


package pizza_takeaway_code;

import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Collections;

public class Pizza_Takeaway_Code {
    
    //Making a method:
    //Holds the starting code formalities: 
    public static void formalities(){
        System.out.println("Welcome to the pizza ordering code");
        System.out.println("You will be able to make what ever pizza you would like"); 
        System.out.println("You will also get a selection of sides and drinks"); 
        System.out.println("");
        System.out.println("");
    }
    
    //Where all the methods will be run in order: 
    public static void main(String[] args) {
        formalities(); //Formalities method call  
        pizza(); //Making the pizza method call 
    
    }

    public static void pizza(){
        Scanner input = new Scanner(System.in);

        boolean order = true; 
        
        while(order == true){
            
            System.out.println("Here are the sizes of the pizza:");
            System.out.println("");
            System.out.println("\u001B[35m Small -- £7.99");
            System.out.println("\u001B[35m Medium -- £10.99");
            System.out.println("\u001B[35m Large -- £13.99");
            System.out.println(""); 
            System.out.println("What size would you like??"); 
            String size = input.next(); 
            System.out.println("");
            System.out.println("You have decided to order a " + size + " pizza");
            System.out.println("");
            System.out.println("");
            System.out.println("The price of the pizza so far is:");
            
            if(size.equalsIgnoreCase("Small")){
                System.out.println("£7.99");
            }
            if(size.equalsIgnoreCase("Medium")){
                System.out.println("£10.99");
            }
            if(size.equalsIgnoreCase("large")){
                System.out.println("13.99"); 
            }
         
            System.out.println("");
            System.out.println(""); 
            System.out.println("Would you like to add toppings?");
            String tops = input.next(); 
            
            if(tops.equalsIgnoreCase("No") || tops.equalsIgnoreCase("N")){
                System.out.println("");
                System.out.println("Okay!");
                System.out.println("");
                System.out.println("Would you like to order any drinks?");
                String drinks = input.next();
                if(drinks.equalsIgnoreCase("No") || drinks.equalsIgnoreCase("N")){
                    System.out.println("");
                    System.out.println("Okay");
                    System.out.println(""); 
                }
                else{
                    drinks(); 
                }
                
            }
            
            //Ask if they want any drinks:
            if(tops.equalsIgnoreCase("Yes") || tops.equalsIgnoreCase("Y")){
                Toppings(); 
            }
            
            System.out.println("");
            System.out.println("");
            System.out.println("Would you like to order any drink");
            String drinks = input.next(); 
            if(drinks.equalsIgnoreCase("No") || drinks.equalsIgnoreCase("N")){
                System.out.println("");
                System.out.println("Okay");
                System.out.println(""); 
            }
            else{
                drinks(); 
            }

            
        }
       
        
    }
    
    //Making a method:
    //Askinng the user what topics that they want using an array list
    public static void Toppings(){
        Scanner input = new Scanner(System.in); 
        
        boolean ask = true; 
        
        System.out.println("");
        System.out.println("");
        System.out.println("You will now have a choice");
        
        while(ask == true){
            System.out.println("1: Here the toppings OR 2:Go straight to order the toppings");
            int option = input.nextInt(); 
            switch(option){
                case(1):
                    System.out.println("");
                    System.out.println("");
                    System.out.println("These are the toppings that you can add to the pizza:");
                    System.out.println("Peporoni");
                    System.out.println("Cheese");
                    System.out.println("Bacon");
                    System.out.println("Mushrooms");
                    System.out.println("Pinapple");
                    System.out.println("Chicken"); 
                    System.out.println("Sweetcorn");
                    System.out.println("Vegetables"); 
                    System.out.println("Meats");
                    System.out.println(""); 
                    System.out.println(""); 
                    ask = true; 
                    break; 
                    
                    
                case(2): 
                    
                    ArrayList <String> Toppings = new ArrayList <> (); 
                    
                    System.out.println("");
                    System.out.println(""); 
                    System.out.println(""); 
                    System.out.println("\u001B[35m We will add £1.00 for each topping!");
                    System.out.println("");
                    System.out.println("How many topping will you be adding?"); 
                    int amount = input.nextInt(); 
                    
                    int asking = 0; 
                    
                    while(asking < amount){
                        System.out.println("");
                        System.out.println("Enter the topping"); 
                        String type = input.next();
                        
                        if(type.equalsIgnoreCase("peporoni") || type.equalsIgnoreCase("cheese") || type.equalsIgnoreCase("bacon") || type.equalsIgnoreCase("mushrooms") || type.equalsIgnoreCase("pinapple") || type.equalsIgnoreCase("chicken") || type.equalsIgnoreCase("sweetcorn") || type.equalsIgnoreCase("vegetables") || type.equalsIgnoreCase("meats")){
                            Toppings.add(type); 
                            asking = asking + 1; 
                            System.out.println("");
                        }
                        else{
                            System.out.println("ERROR: You have not entered the correct toppings!!");
                            System.out.println("You will have to start the order again"); 
                            pizza(); 
                        }

                    }
                    
                    System.out.println("");
                    System.out.println("");
                    Collections.sort(Toppings);
                    System.out.println("These are the toppings that you have added:"); 
                    System.out.println(Toppings); 

                    double topPrice = amount * 1; 

                    System.out.println("");
                    System.out.println("These toppings have cost you an extra:"); 
                    System.out.println("£" + topPrice);
                    System.out.println("");
                    System.out.println("");
                    drinks(); 
                    break; 
                    
            }   
            
        }
        
        
    }
    
    //Making a method:
    //Asking the user what drink they want and adding having a price 
    public static void drinks(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("");
        System.out.println("You can only order one drink with your meal"); 
        System.out.println("");
        System.out.println("These are the drinks and the price: ");
        System.out.println("");
        System.out.println("\u001B[35m Coke -- £1.00 ");
        System.out.println("\u001B[35m Fanta -- £1.00 ");
        System.out.println("\u001B[35m Lemonade -- £1.50");
        System.out.println("\u001B[35m Pink Lemonade -- £2.00"); 
        System.out.println(""); 
        System.out.println("What drink would you like"); 
        String drink = input.next();
        
        if(drink.equalsIgnoreCase("Coke")){
            System.out.println("");
            System.out.println("\u001B[35m £1.00");  
        }
        if(drink.equalsIgnoreCase("Fanta")){
            System.out.println(""); 
            System.out.println("\u001B[35m £1.00"); 
        }
        if(drink.equalsIgnoreCase("Lemondade")){
            System.out.println(""); 
            System.out.println("\u001B[35m £1.50"); 
        }
        if(drink.equalsIgnoreCase("Pink lemonade")){
            System.out.println(""); 
            System.out.println("\u001B[35m £2.00"); 
        }
        
    }
    
    
    
    
    
}
