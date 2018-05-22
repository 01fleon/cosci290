/*
  Francisco Leon
  CoSci 290
  
  Tests UndeadMage and UndeadWarrior subclasses
  Lab22
*/
import java.util.*;
public class TestUndead{
  //main method
  public static void main(String[] args){
    ArrayList<Undead> mob = new ArrayList<Undead>();
    UndeadMage mage = new UndeadMage();
    UndeadWarrior warrior = new UndeadWarrior();
    
    //randomly puts UndeadMage or UndeadWarrior into
    //mob.
    for(int i=0; i<8; i++){
      if(chance(0,100) > 50){
        //load new UndeadMage
        mage = new UndeadMage();
        mob.add(mage);
      }
      else{
        //load new UndeadWarrior
        warrior = new UndeadWarrior();
        mob.add(warrior);
      }
    }
    
    //prints attacks
    for(Undead i : mob){
      i.attack();
      //System.out.println(i.toString()); //prints undead info
    }
  }//end main
  
  //method gives me a random number in a range
  public static int chance(int start, int end){
      return start + (int)(Math.random() * (end - start));
  }//end chance
}