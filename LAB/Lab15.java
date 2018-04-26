/*
  Francisco Leon
  Co Sci 290
  
  This program creates, loads, and display
  contents of a mult-dimensional array. 
*/
public class Lab15{
  public static void main(String[] args){
  //mult-dimensional 5x5 array created  
    int[][] array = new int[5][5];
  //loads array with random ints from 1 to 100  
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        array[i][j] = random();
      }    
    }
  //prints array to console as a table  
    for(int i = 0; i < 5; i++){      
      for(int j = 0; j < 5; j++){
        System.out.print(array[i][j] + "\t");
      }
      System.out.println(" ");
      
    }
  }    
  //gives random number between 1 and 100 inclusive
  public static int random(){
      return 1 + (int)(Math.random() * (100 - 1));
  }
}
