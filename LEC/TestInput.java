/*
  Francisco Leon
  Co Sci 290
  
  Testing datatypes and input from user
  
*/
import java.util.Scanner; 

public class TestInput{
  //Main Method
  public static void main(String[] args){
    //datatype variableName = expression
    //1. Identifers can only start with a letter, _, or $
    //2. Identifers with multiple words are camelCased
    //e.g.  - num OfStudents, name, interestRate
    
    /*
      Datatypes
      int - integers
      double - decimal
      char - single character
      boolean - true/false
      
      Object/reference datatypes
      String - characters surrounded by double quotations
      
      There are other objects in Java that comes with Java and that are custom
      i.e. Scanner, System, etc
    */
    
    String name = "Sam";
    int numOfStudents = 29;
    double avgGPA = 3.78;
    final double PI_VAUE = 3.1415; //constants are caps and spaced with underscore
    int age = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter name: ");    
    name = input.next();    
    System.out.println("Hi " + name);
    
    System.out.print("Age: ");
    age = input.nextInt();
    System.out.println("You are " + age + " years old.");

  }

}