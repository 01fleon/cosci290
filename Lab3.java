/*
  Francisco Leon
  Co Sci 290
  
  Lab 3 using complex conditionals
*/

public class Lab3{
  public static void main(String[] args){
    int chance = 1 + (int)(Math.random() * (100 - 1));
    System.out.print("A giant panda-shaped balloon pops revealing \n");
    if(chance >= 80){
      System.out.println("a picture of a family made out of swiss cheese.");
    }
    else if(chance < 80 && chance >= 50){
      System.out.println("a banana cream pie and a pair of chopsticks.");
      if(chance == 72) System.out.println("The chopsticks seems to made of iron.");
    }
    else if(chance < 50 && chance >= 20){
      System.out.println("57 moths flying out in all directions.");
    }
    else System.out.println("a purple fog.");
  }
}