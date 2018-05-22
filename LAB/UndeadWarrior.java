/*
  Francisco Leon
  CoSci 290
  
  UndeadWarrior Subclass.
*/
public class UndeadWarrior extends Undead{
  
  private String rightHandWeapon;
  private String leftHandWeapon;
  
  public UndeadWarrior(){
    super();
    rightHandWeapon = "Sharp Stick";
    leftHandWeapon = "Fist";
  }
   
  public String getRightHandWeapon(){
    return this.rightHandWeapon;
  }
  
  public void setRightHandWeapon(String rightHandWeapon){
    this.rightHandWeapon = rightHandWeapon;
  }
  
  public String getLeftHandWeapon(){
    return this.leftHandWeapon;
  }
  
  public void setLeftHandWeapon(String leftHandWeapon){
    this.leftHandWeapon = leftHandWeapon;
  }
  
  public String toString(){
    return "UndeadWarrior" +
           "\nName: " + this.getName() + 
           "\nExperience: " + this.getExperience() +
           "\nHealth: " + this.getHealth() +
           "\nRightHandWeapon: " + this.rightHandWeapon +
           "\nLeftHandWeapon: " + this.leftHandWeapon +
           "\n";
  }
  
  
  @Override
  public void attack(){
    //prints attack 
    System.out.println(this.getName() + " uses " + this.rightHandWeapon + "!");
  }
}