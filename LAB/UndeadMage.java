/*
  Francisco Leon
  CoSci 290
  
  UndeadMage Subclass.
*/
public class UndeadMage extends Undead{
  
  private String spellOne;
  private String spellTwo;
  
  public UndeadMage(){
    super();
    this.spellOne = "Ember";
    this.spellTwo = "Gust";
  }
  
  public String getSpellOne(){
    return this.spellOne;
  }
  
  public void setSpellOne(String spellOne){
    this.spellOne = spellOne;
  }
  
  public String getSpellTwo(){
    return this.spellTwo;
  }
  
  public void setSpellTwo(String spellTwo){
    this.spellTwo = spellTwo;
  }
  
  public String toString(){
    return "UndeadMage" +
           "\nName: " + this.getName() + 
           "\nExperience: " + this.getExperience() +
           "\nHealth: " + this.getHealth() +
           "\nSpellOne: " + this.spellOne +
           "\nSpellTwo: " + this.spellTwo +
           "\n";
  }
  
  @Override
  public void attack(){
    //prints attack 
    System.out.println(this.getName() + " uses " + this.spellOne + "!");
  }
}