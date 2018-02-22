/*
  Francisco Leon
  Co Sci 290
  
  Practice area for questions and testing
  how things works.
*/

public class PracticeArea{
  public static void main(String[] args){
    
    //Can assignment operator be used as condition? Nope.
    /*int x = 1;
    if(x=5){ //ERROR won't even compile
      System.out.println("assignment can be used as condition.");
    }
    else System.out.println("assignment can NOT be used as condition.");
    */
    int x=3, y=3;
    switch(x + 3){
      case 6: y=1;
      default:  y+=1;  
    }
    System.out.println("X is: " + x + "\nY is: " + y);
  }
}