/*
  Francisco Leon
  Co Sci 290
  
  Topics:
    functions/methods 
    -access modifier
    -return type
    -function name
    -parameters (optional)
*/

public class TestFunctions{
  
  public static void main(String[] args){
    /*
      access modifiers
      public - anything can see/access
      private - only functions within a class can access
      default -  same thing as no written/declared modifier
    
      return types
      -int
      -double
      -String
      -char
      -boolean
      -different objects as well
      -void - doesn't return anything
      
      function names
      -follow the same rules as any identifer
      
      function parameters
      -input that the function uses inside somewhere
        in the function body
      -separate multiple parameters with commas
      
    */
    System.out.println("Sum of 2 and 3 is: " + findSum(2,3));
    sayHello("person");
  }
  
  public static int findSum(int num1, int num2){
    return num1 + num2;
  }
  public static void sayHello(String name){
    System.out.println("Hello " + name);
  }
}