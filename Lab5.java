/*
  Francisco Leon
  Co Sci 290
  
  Lab 5
  This programs checks user input for appropiate
  length and characters.
*/
import java.util.Scanner;
public class Lab5{
  public static void main(String[] args){
    
    String answer = "";
    boolean flag = true;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Name: ");
    answer = input.next();
    
    //Checks if name is appropiate
    do{
      flag = true; 
      /*
        Flag being true for no errors in name.
        False if errors in name.
      */
      //Checks if name is long enough
      if(answer.length() < 2){
        flag = false;
      }
      //Checks if only letters are used
      for(int index = 0; index < answer.length(); index++){
        if(!Character.isLetter(answer.charAt(index))){
          flag = false;
        }
      }
      //Checks if any errors were found
      if(!flag){
        System.out.println("Please enter a longer name with letters only: ");
        answer = input.next();
      }
    }while(!flag); 
    

    System.out.println("Nice name.");
  }
}