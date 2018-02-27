/*
  Francisco Leon
  Co Sci 290
  
*/

import java.util.Scanner;
public class TestStrings{
  //main method
  public static void main(String[] args){
    //instantiate the scannner object
    Scanner input = new Scanner(System.in);
    //Question
    System.out.print("Name: ");
    String answer = input.next();
    boolean flag = true;
    
    do{
      flag = true;
      if(answer.length() < 2){
        flag = false;
      }
      for(int index = 0; index < answer.length(); index++){
        if(!Character.isLetter(answer.charAt(index))){
          flag = false;
        }
      }
      if(!flag){
        System.out.println("Please enter a longer name with letters only: ");
        answer = input.next();
      }
    }while(!flag);
    
    /*while(answer.length() < 2){ //while should start with true condition
      System.out.println("Please enter a longer name: ");
      answer = input.next(); //updates the condition
    }
    */
    /*
      Does it once befre check
      do{
        something
      }while(condition);
    */
    /*
    for(int index = 0; index < answer.length(); index++){
      if(!Character.isLetter(answer.charAt(index))){
        System.out.println("Please")
      }
    }
    */
    System.out.println("Are you rich? Yes or No");
    //Answer
    answer = input.next();
    //answer = answer.toLowerCase();
        
    if(answer.equalsIgnoreCase("no")){
      System.out.println("Dang.");
    }
    else{
      System.out.println("Cool.");
    }
  }
}