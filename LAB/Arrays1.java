/*
  Francisco Leon
  Co Sci 290
  
  Arrays Lab
  Creates an array, assigns something to every element
  and prints them.
*/

public class Arrays1{
  
  public static void main(String[] args){
    int[] numbers = new int[10];
    
    for(int i=0; i<numbers.length; i++){
      numbers[i] = i*111;
    }
    for(int i=0; i<numbers.length; i++){
      System.out.println(numbers[i]);
    }
    
    
  }
}