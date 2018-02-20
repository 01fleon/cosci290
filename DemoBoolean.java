/*
  Francisco Leon
  Co Sci 290
  
  Demo topics on:
    - incrememnts
*/
import java.util.Scanner;
public class DemoBoolean{
  
  public static void main(String[] args){
    
    int num = 1;
    int num2  = 1;
    // num++; // smae as num = num + 1;
    System.out.println("++num: " + ++num);  //adds before
    System.out.println("num2++: " + num2++); //adds after
    
    //examples of augmented assignment operators
    num += 2; 
    num *= 2;
    num /= 2;
    num -= 2;
    
    int whole = 2;
    double deci = 3.3;
    System.out.println(whole * deci); // 6.6
    System.out.println(whole * (int)deci); //6,  (int)deci is example of cast
    System.out.println((int)'a'); //97  
    System.out.println('a'); //a  
    
   
    //if stuff
    /*
    Scanner input = new Scanner(System.in);
    System.out.println("I'm thinking of a number 1 to 100. What is it?");
    
    int guess = input.nextInt();
    while(guess != 72){
        if(guess < 72){
          System.out.print("Nope. Higher.\n" + "New guess: ");
          guess = input.nextInt();
        }
          if(guess > 72){
          System.out.print("Nope. Lower.\n" + "New guess: ");
          guess = input.nextInt();
        }
    }
    System.out.println("Correct!");
    */
    
    //Generating a random number
    // min + (Math.random() * (max - min))
    System.out.println(17 + (Math.random() * (50 - 17))); //random num 17-50
    System.out.println(17 + (int)(Math.random() * (50 - 17))); //random num 17-50 with a int cast
    
    int fate = 1 + (int)(Math.random() * (100 - 1));
    if(fate >= 30){
      System.out.println("Dead");
    }
    else{
      System.out.println("Live");
    }
    
    
  }

}