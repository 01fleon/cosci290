/*
	Mike Plata
	CoSci 290

	Fighter Class
*/

public class Fighter extends Player

public class Fighter{
	  
	//the Fighter class has 5 class members/properties
	private Weapon equipedWeapon;
	private Weapon[] sheathedWeapons;
	private Armor equipedArmor;
	private Item activeItem;
	private Item storedItem;
	
	//the Fighter class has one default constructor
	public Fighter() {
		
		//assigns a Knife object to the equiped weapon property
		this.equipedWeapon = Sword;
		
		//creates a new array assigned to the sheathedWeapons property
		this.sheathedWeapons[] = new Weapon[2];
		
		//uses a 'for loop' to assign null to each index of the array
		for(int i = 0; i < 2; i++) {
			
			//assigns null to the indicated index
			this.sheathedWeapons[i] = null;
		}
				
		//assigns a LightArmor object to the equipedArmor property
		this.equipedArmor = LightArmor;
		
		//assigns null to the activeItem property
		this.activeItem = null;
		
		//assigns null to the storedItem property
		this.storedItem = null;
	}
	
	//method to assign a value to the equipedWeapon property
	public void setEquipedWeapon(Weapon newWeapon){
		    
		//assigns the newWeapon object to the equipedWeapon property
		this.equipedWeapon = newWeapon;
	}
		   
	//method to return the value of the equipedWeapon property
	public Weapon getEquipedWeapon(){
		    
		//returns the value of the weapon property
		return this.equipedWeapon;
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
		  
	//method to assign a value to the activeItem property
	public void setActiveItem(Item newItem){
	
		//assigns the newItem object to the activeItem property
		this.activeItem = newItem;
	}
		  
	//method to return the value of the activeItem property
	public Item getActiveItem(){
	    
		//returns the value of the activeItem property
		return this.activeItem;
	}
		  
	//method to assign a value to the storedItem property
	public void setStoredItem(Item newItem){
	
		//assigns the newItem object to the storedItem property
		this.storedItem = newItem;
	}
		  
	//method to return the value of the storedItem property
	public Item getStoredItem(){
		    
		//returns the value of the storedItem property
		return this.storedItem;
	}
}