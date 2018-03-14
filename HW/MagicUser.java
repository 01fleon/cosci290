/*
	Mike Plata
	CoSci 290

	Magic-User Class
*/

public class MagicUser extends Player

public class MagicUser{
	  
	//the MagicUser class has 4 class members/properties
	private Spell[] spellBook;
	private Armor armor;
	private Item activeItem;
	private Item storedItem;
	
	//the MagicUser has one default constructor
	public MagicUser{
		
		//creates an array and assigns it to the spellBook property
		this.spellBook = new Spell[4];
		
		//assigns a MysticalBlast object to spellBook array, index 0
		this.spellBook[0] = MysticalBlast;
		
		//uses 'for loop' to assign null to each index 1 through
		//3 of the spellBook array
		for(int i = 1; i < 4; i++) {
			
			//assigns null to the indicated index
			this.spellBook[i] = null;
		}
		
		//assigns a Cloak object to the armor property
		this.armor = Cloak;
		
		//assigns null to the activeItem property
		this.activeItem = null;
		
		//assigns null to the storedItem property
		this.storedItem = null;
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