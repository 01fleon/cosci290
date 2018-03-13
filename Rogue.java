/*
	Mike Plata
	CoSci 290

	Rogue Class
*/

public class Rogue extends Player

public class Rogue{
	
	//the Rogue class has 5 class members/properties
	private Weapon equipedWeapon;
	private Weapon sheathedWeapon;
	private Armor equipedArmor;
	private Item[] activeItems;
	private Item[] storedItems;
	
	//the Rogue class has one default constructor
	public Rogue() {
		
		//assigns a Knife object to the equipedWeapon property
		this.equipedWeapon = Knife;
		
		//assigns null to the sheathedWeapon property
		this.sheathedWeapon = null;
		
		//assigns a LeatherArmor object to the equipedArmor property
		this.equipedArmor = LeatherArmor;
		
		//creates an array and assigns it to the activeItems property
		this.activeItems[] = new Item[2];
		
		//uses 'for loop' to assign null to each index of the
		//activeItems array
		for(int i = 0; i < 2; i++) {
			
			//assigns null to the indicated index
			this.activeItems[i] = null;
		}
		
		//creates an array and assigns it to the storedItems property
		this.storedItems[] = new Item[3];
		
		//uses 'for loop' to assign null to each index of the
		//storedItems array
		for(int i = 0; i < 3; i++) {
			
			this.storedItems[i] = null;
		}
		
		//method to assign a value to the equipedWeapon property
		public void setEquipedWeapon(Weapon newWeapon){
			    
			//assigns the newWeapon object to the equipedWeapon property
			this.equipedWeapon = newWeapon;
		}
			   
		//method to return the value of the equipedWeapon property
		public Weapon getEquipedWeapon(){
			    
			//returns the value of the equipedWeapon property
			return this.equipedWeapon;
		}
		
		//method to assign a value to the sheathedWeapon property
		public void setSheathedWeapon(Weapon newWeapon){
			    
			//assigns the newWeapon object to the sheathedWeapon property
			this.sheathedWeapon = newWeapon;
		}
			   
		//method to return the value of the sheathedWeapon property
		public Weapon getSheathedWeapon(){
			    
			//returns the value of the sheathedWeapon property
			return this.sheathedWeapon;
		}
		
		//method to assign a value to the equipedArmor property
		public void setEquipedArmor(Armor newArmor){
			    
			//assigns the newArmor object to the equipedArmor property
			this.equipedArmor = newArmor;
		}
			  
		//method to return the value of the equipedArmor property
		public Armor getEquipedArmor(){
			    
			//returns the value of the equipedArmor property
			return this.equipedArmor;
		}

}