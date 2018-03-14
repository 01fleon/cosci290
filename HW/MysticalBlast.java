/*
	Mike Plata
	CoSci 290

	Mystical Blast class
*/

public class MysticalBlast extends Spell

public class MysticalBlast{
	
	//the MysticalBlast class has 1 class member/property
	private int attack;
	
	//the MysticalBlast class has one default contructor
	public MysticalBlast() {
		
		//assigns the indicated string to the name property
		this.name = "Mystical Blast";
		
		//assigns the indicated string to the type property
		this.type = "Fire Magic";
		
		//assigns the indicated string to the description property
		this.description = "Delivers a magical blast of fire to the target.";
		
		//assigns a value to the attack property
		this.attack = 10;
				
	}
	
	//method to print (to screen) each class member with appropriate labels
	public void printMysticalBlast() {
		
		//calls the printSpell method from the Spell class
		this.printSpell();
		
		//prints the attack property
		System.out.println("Attack: " + this.attack);
	}
	
	//method to assign a value to the attack property
	public void setAttack(int newValue) {
		
		//assigns the value of newValue to the attack property
		this.attack = newValue;
	}
	
	//method to return the value of the attack property
	public int getAttack() {
		
		//returns the value of the attack property
		return this.attack;
	}
	
}