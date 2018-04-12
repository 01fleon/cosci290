/*
	Francisco Leon
  Co Sci 290
  
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	        *
	      * * * 
	    * * * * *
	  * * * * * * *
	* * * * * * * * *
	  * * * * * * *
	    * * * * *
	      * * *
	        *
  * * * * *
	  * * * * 
	    * * * 
	      * * 
	        *
	4. Fix the indentation of the code. 
	Note:
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/
import java.util.*;
public class Lab12{
  public static void main(String[] args){
    int i,j,k;
   //Upper part and middle line of diamond
    //goes through 5 rows 
    for(i=1;i<=5;i++){
      //j compliments i to sum 5 which is
      //the number of spaces need before the *s
      for(j=i;j<5;j++){ 
        System.out.print(" ");
      }
      //k is done from 1 to one less double i
      //which is the number of *s needed after
      //j spaces in the ith row
      for(k=1;k<(i*2);k++){
        System.out.print("*");
      }
      //ends row
      System.out.println(" ");
    }
    
   //Lower part of the diamond
    //rows 
    for(i=4;i>=1;i--){
      //spaces in a row
      for(j=i;j<5;j++){
        System.out.print(" ");
      }
      //*s in row
      for(k=1;k<(i*2);k++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
    
    printTriangle(); //calls lower triangle
  }

  public static void printTriangle(){
    //to-do: implement triangle
    int i,j,k;
    //rows
    for(i=5; i>0; i--){
      //spaces before *
      for(j=i; j<5; j++){
        System.out.print(" ");
      }
      //*s
      for(k=i; k>0; k--){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}	
