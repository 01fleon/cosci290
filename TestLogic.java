/*
  Francisco Leon
  Co Sci 290
  
  -mult-way if-else
  -logical operators
  -symbolic logic
*/
import java.util.Scanner;

public class TestLogic{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your score: ");
    int grade = input.nextInt();
    if(grade >= 90){
      System.out.println("A");
    }
    else if(grade >= 80){
      System.out.println("B");
    }
    else if(grade >= 70){
      System.out.println("C");
    }
    else if(grade >= 60){
      System.out.println("D");
    }
    else System.out.println("F");
  }
}