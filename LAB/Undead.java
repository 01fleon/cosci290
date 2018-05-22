/*
  Francisco Leon
  Co Sci 290
  
  Undead abstract class.
  Lab 22
*/

public abstract class Undead{
  private double health;
  private double experience;
  private String name;
  
  //zero-argument default constructor
  public Undead(){
    this.health = 0.0;
    this.experience = 0.0;
    this.name = "unknown";
  }
  
  public double getHealth(){
    return this.health;
  }
  
  public void setHealth(double health){
    this.health = health;
  }
  
  public double getExperience(){
    return this.experience;
  }
  
  public void setExperience(double experience){
    this.experience = experience;
  }
    
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public String toString(){
    return "Undead has experience: " + this.experience + " Name: " + this.name 
            + "Health: " + this.health;
  }
  
  public abstract void attack();
  
}