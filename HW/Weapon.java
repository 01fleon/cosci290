/*
  Mike Plata
  CoSci 290
  
  sample of a Weapon class for Text Adventure
  to be used by the Player class
*/

public class Weapon{

  //the Weapon class has 2 properties
  private String name;
  private int atkMod;
  
  //the Weapon class has 1 defualt constructor
  public Weapon(){

    //assigns the indicated String to the name property
    this.name = "None";
    
    //assigns the value of zero (0) to the atkMod property
    this.atkMod = 0;
  }
  
  //the Weapon class has 1 constructor with parameters
  public Weapon(String name, int value){
    
    //assigns the indicated String to the name property
    this.name = name;
    
    //assigns the value of 'value' to the atkMod property
    this.atkMod = value;
  }
  
  //method to set the name property
  public void setName(String name){
    
    //assigns the indicated String to the name property
    this.name = name;
  }
  
  //method to return the value of the name property
  public String getName(){
    
    //returns the value of the name property
    return this.name;
  }
  
  //method to set the atkMod property
  public void setAtkMod(int newValue){
    
    //assigns the value of newValue to atkMod property
    this.atkMod = newValue;
  }
  
  //method to return the value of the atkMod property
  public int getAtkMod(){
    
    //returns the value of the atkMod property
    return this.atkMod;
  }
}