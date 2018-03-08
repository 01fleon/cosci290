/*
  Mike Plata
  CoSci 290
  
  sample of an Armor class for Text Adventure
  to be used by the Player class
*/

public class Armor{

  //the Armor class has 2 properties
  private String name;
  private int defMod;
  
  //the Armor class has 1 defualt constructor
  public Armor(){

    //assigns the indicated String to the name property
    this.name = "None";
    
    //assigns the value of zero (0) to the defMod property
    this.defMod = 0;
  }
  
  //the Armor class has 1 constructor with parameters
  public Armor(String name, int value){
    
    //assigns the indicated String to the name property 
    this.name = name;
    
    //assigns the value of 'value' to the defMod property
    this.defMod = value;
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
  
  //method to set the defMod property
  public void setDefMod(int newValue){
    
    //assigns the value of newValue to defMod property
    this.defMod = newValue;
  }
  
  //method to return the value of the defMod property
  public int getDefMod(){
    
    //returns the value of the defMod property
    return this.defMod;
  }
}