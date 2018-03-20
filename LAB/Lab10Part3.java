/*
  Francisco Leon
  Co Sci 290
  
  Lab 10 part 3, gets arguments from command line
  and displays the average value.
*/

import java.util.*;
public class Lab10Part3{
  public static void main(String[] args){
     
    ArrayList<Double> numbers = new ArrayList<Double>();
    
    //gets and stores numbers from command line
    for(int i=0; i<args.length; i++){
      //changes args stuff into doubles
      numbers.add(Double.parseDouble(args[i]));
      //System.out.println(Double.parseDouble(args[i]));
    }
        
    System.out.println("Average of numbers: " + average(numbers));    
    
  }
  
  //couldn't overload this one for some reason
  public static int average(int[] array){
    int sum = 0;
    for(int number: array){
      sum += number;
    }
    return sum/array.length;
  }
  
  public static double average(ArrayList<Double> array){
    double sum = 0.0;
    for(double number: array){
      sum += number;
    }
    return sum/array.size();
  }
}