/*
  Francisco Leon
*/

import java.util.Scanner; 

public class Lab2{
  public static void main(String[] args){
    
    String name = "";
    String catName = "";
    String direction = "";
    double clownLikeLevel = 0.0;
    
    System.out.print("You've been passed out for 3 days.\n" + "What's your name? ");
    Scanner input = new Scanner(System.in);
    name = input.next();
    System.out.print(name + ", on a scale of 1 to 10, how much do you like clowns? ");
    clownLikeLevel = input.nextDouble();
    System.out.print(clownLikeLevel + " out of 10? Great! Cause this place is full of them!\n"
                    + "Also, here's a cat. What's it's name? ");
    catName = input.next();
    System.out.print("Looks like " + name + " and " + catName + " are ready!\n"
                    + "Which direction do you head in? ");
    direction = input.next();
    System.out.print("Cool, " + direction + " it is! Good luck!\n");
  
      
  }
  
}