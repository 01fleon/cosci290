/*
  Francisco Leon
  Co Sci 290
  
  Problem 7.19
  This program that prompts the user to enter
  a list and displays whether the list is sorted
  or not. Note that the first number in the input
  indicates the number of the elements in the list.
  This number is not part of the list.
  
*/

import java.util.*;
public class Lab11{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        
    System.out.print("Enter list: ");
    //Takes first int which is how many numbers
    //will follow(ie list size)
    int listSize = input.nextInt();
  
    int[] list = new int[listSize];
    //loads the folloeing numbers into list 
    for(int i=0; i< listSize; i++){
      list[i] = input.nextInt();
    }
    
    //prints list
    System.out.println("The list you gave me: ");
    for(int i=0; i< listSize; i++){
      System.out.print(list[i] + " ");
    }
    System.out.println();
    
    //determines if it's sorted
    if(isSorted(list)) System.out.println("The list is already sorted");
    else System.out.println("The list is not sorted");
        
  }
  
  public static boolean isSorted(int[] list){
    //goes through list up til the last one
    for(int i=0; i<list.length-1; i++){
      //checks if next one is smaller
      if(list[i] > list[i+1]) return false;  
    }
    return true;
  }
}