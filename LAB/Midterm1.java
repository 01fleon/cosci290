/*
  Francisco Leon
  Co Sci 290
  
  
*/

import java.util.*;
public class Midterm1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        
    System.out.print("Enter list: ");
    //Takes first int which is how many numbers
    //will follow(ie list size)
    int listSize = input.nextInt();
  
    int[] list = new int[listSize];
    //loads the following numbers into list 
    for(int i=0; i< listSize; i++){
      list[i] = input.nextInt();
    }
    
    //prints list
    System.out.println("The list you gave me: ");
    for(int i=0; i< listSize; i++){ //goes through list
      System.out.print(list[i] + " "); //prints int
    }
    System.out.println("\n");
    
    //determines if it's sorted
    if(isSorted(list)){
      //if already sorted, message is output
      System.out.println("The list is already sorted.\n");
    } 
    else{
      //if not sorted, message is output
      System.out.println("The list is not sorted.");
      //it is then sorted and shown/print sorted
      System.out.println("This is your list sorted:" );
      list = sortArray(list); //reassigns list to a sorted version
      //prints sorted list
      for(int i=0; i< listSize; i++){
        System.out.print(list[i] + " ");
      }
      System.out.println();

    } 
  }
  //checks if ints in list is sorted in increasing order
  public static boolean isSorted(int[] list){
    //goes through list up til the last one
    for(int i=0; i<list.length-1; i++){
      //checks if next one is smaller
      //if next is smaller, then list isn't sorted
      if(list[i] > list[i+1]) return false;  
    }
    return true; //otherwise it is sorted
  }
  
  //takes a list of ints, return a sorted list of ints
  //in increasing order
  public static int[] sortArray(int[] list){
    //a temporary variable to help with reassignment
    int temp = 0;
    //won't stop sorting til it's sorted
    while(!isSorted(list)){
      //goes through list from start to end
      //doesn't go to last index because it is
      //checked by checking next index of second
      //to last int
      for(int i=0; i<list.length-1; i++){
        //if next is smaller, we switch
        //current and next
        if(list[i] > list[i+1]){
          //holds current value
          temp = list[i];
          //makes current have next int's value
          list[i] = list[i+1];
          //next int becomes current's original value
          list[i+1] = temp;
        }
      }
    }
    return list; //a sorted list is returned
  }
  
}