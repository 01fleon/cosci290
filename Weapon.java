/*
  Mike Plata
  CoSci 290
  
  sample of a Weapon class for Text Adventure
  to be used by the Player class
*/

public class Weapon{

	//the Weapon class has 2 properties
	private String name;
	private String type;
	private int attack;
	 
	//the Weapon class has 1 defualt constructor
	public Weapon(){
	
		//assigns the indicated String to the name property
		this.name = "None";
		
		//assigns the indicated String to the type property
		this.type = "N/A"
		    
		//assigns the value of zero (0) to the atkMod property
		this.attack = 0;
	}
	
	//method to print (to screen) all class members with appropriate labels
	public void printWeapon() {
			
		//print to screen the name property
		System.out.println("Name: " + this.name);
			
		//print to screen the type property
		System.out.println("Type: " + this.type);
			
		//print to screen the attack property
		System.out.println(" Atk: " + this.attack);
	}
	  
	//method to set the name property
	public void setName(String newName){
	    
		//assigns the indicated String to the name property
		this.name = newName;
	}
	  
	//method to return the value of the name property
	public String getName(){
	    
		//returns the value of the name property
		return this.name;
	}
	
	//method to set the type property
	public void setType(String newType) {
		
		//assing she indicated String to the type property
		this.type = newType;
	}
	
	//method to return the value of the type property
	public String getType() {
		
		//returns the value of the type property
		return this.type;
	}
	  
	//method to set the atkMod property
	public void setAttack(int newValue){
	    
		//assigns the value of newValue to atkMod property
		this.attack = newValue;
	}
	  
	//method to return the value of the atkMod property
	public int getAttack(){
	    
		//returns the value of the atkMod property
		return this.attack;
	}
}
