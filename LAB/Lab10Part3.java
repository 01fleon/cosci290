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
    
    //Double.parseDouble(args[0]);
    for(int i=0; i<args.length; i++){
      numbers.add(Double.parseDouble(args[i]));
      //System.out.println(Double.parseDouble(args[i]));
    }
        
    System.out.println("Average of numbers: " + average(numbers));    
    
  }
  /*
  couldn't overload for reason
  public static int average(ArrayList<Integer> array){
    int sum = 0;
    for(int number: array){
      sum += number;
    }
    return sum/array.size();
  }
  */
  public static double average(ArrayList<Double> array){
    double sum = 0.0;
    for(double number: array){
      sum += number;
    }
    return sum/array.size();
  }
}