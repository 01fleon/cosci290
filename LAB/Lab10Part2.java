/*
  Francisco Leon
  Co Sci 290
  
  Lab 10 part 2, prompts the user to enter
  ten double values and displays the average value.
*/

import java.util.*;
public class Lab10Part2{
  public static void main(String[] args){

    double[] numbers = new double[10];
    Scanner input = new Scanner(System.in);
    
    //asks for numbers ten times
    for(int i=0; i<10; i++){
      System.out.println("Enter a number: ");
      numbers[i] = input.nextDouble();
    }
    System.out.println("Average of numbers: " + average(numbers));    
    
  }
  public static int average(int[] array){
    int sum = 0;
    for(int number: array){
      sum += number;
    }
    return sum/array.length;
  }
  public static double average(double[] array){
    double sum = 0.0;
    for(double number: array){
      sum += number;
    }
    return sum/array.length;
  }
}