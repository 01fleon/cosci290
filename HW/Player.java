/*
  Mike Plata
  CoSci 290
  
  sample class of a Player for our
  text adventure. This is based of
  off a character sheet from the 
  legendary game - Dungeons and Dragons.
*/

public class Player{

  //the Player class has 21 properties
  private String firstName;
  private String lastName;
  private int age;
  private String playerType;
  private int level;
  private int experience;
  private int hitPoints;
  private int strength;
  private int toughness;
  private int intelligence;
  private int attackModifier;
  private int defenseModifier;
  private int skillModifier;
  private Weapon weapon;
  private Armor armor;
  private Item itemOne;
  private Item itemTwo;
  private Item itemThree;
  private int totalAttack;
  private int totalDefense;
  private int totalSkill;
  
  /*
    The Player class has one constructor that sets the values for
    the following properties:
        firstName
        lastName
        playerType
        age
        level
        experience
  */
  public Player(String first, String last, String type, int years, Weapon weapon, Armor armor, Item item){
    
    //sets the First Name of the player by assigning the 
    //value of first to the firstName property
    this.firstName = first;
    
    //sets the Last Name of the player by assigning the 
    //value of last to the lastName property
    this.lastName = last;
    
    //sets the Type of Adventurer the player will play as by assigning the 
    //by assigning the value of type to the playerType property
    this.playerType = type;
    
    //sets the Age of the player by assigning the value
    //of years to the age property
    this.age = years;
    
    //sets the Player Level that the player starts at by assigning the value
    //one (1) to the level property
    this.level = 1;
    
    //sets the Experience Points the player starts with by assigning the value
    //zero (0) to the experience property
    this.experience = 0;
  }
  
  /*
    The Player class has  methods
  */
  
  //method to return the full name of the Player object
  public String playerName(){
    
    //returns a concatenated string consisting of the 
    //first and last name properties
    return (this.firstName + " " + this.lastName);
  }
  
  //method to assign a value to the firstName property
  public void setFirstName(String newFirstName){
    
    //assigns the value of newFirstName to firstName
    this.firstName = newFirstName;
  }
  
  //method to return the value of the firstName property
  public String getFirstName(){
    
    //retrurns the value of the firstName property
    return this.firstName;
  }
  
  //method to assign a value to the lastName property
  public void setLastName(String newLastName){
    
    //assigns the value of newLastName to lastName
    this.lastName = newLastName;
  }
  
  //method to return the value of the lastName property
  public String getLastName(){
    
    //retrurns the value of the lastName property
    return this.lastName;
  }
  
  //method to assign a value to the playerType property
  public void setPlayerType(String newType){
    
    //assigns the value of newType to playerType
    this.playerType = newType;
  }
  
  //method to return the value of the playerType property
  public String getPlayerType(){
    
    //retrurns the value of the playerType property
    return this.playerType;
  }
  
  //method to assign a value to the age property
  public void setAge(int years){
    
    //assigns the value of years to age
    this.age = years;
  }
  
  //method to return the value of the age property
  public int getAge(){
    
    //retrurns the value of the age property
    return this.age;
  }
  
  //method to assign a value to the level property
  public void setLevel(int newLevel){
    
    //assigns the value of newLevel to level
    this.level = newLevel;
  }
  
  //method to return the value of the level property
  public int getLevel(){
    
    //retrurns the value of the level property
    return this.level;
  }
  
  //method to assign a value to the experience property
  public void setExperience(int newExperience){
    
    //assigns the value of newExperience to experience
    this.experience = newExperience;
  }
  
  //method to return the value of the experience property
  public int getExperience(){
    
    //retrurns the value of the experience property
    return this.experience;
  }
  
  //method to assign a value to the hitPoints property
  public void setHitPoints(int newHp){
    
    //assigns the value of newHp to hitPoints
    this.hitPoints = newHp;
  }
  
  //method to return the value of the hitPoints property
  public int getHitPoints(){
    
    //retrurns the value of the hitPoints property
    return this.hitPoints;
  }
  
  //method to assign a value to the strength property
  public void setStrength(int newValue){
    
    //assigns the value of newValue to strength
    this.strength = newValue;
    
    //calls setAttackModifier method
    setAttackModifier(this.strength);
  }
  
  //method to return the value of the strength property
  public int getStrength(){
    
    //retrurns the value of the strength property
    return this.strength;
  }
  
  //method to assign a value to the toughness property
  public void setToughness(int newValue){
    
    //assigns the value of newValue to toughness
    this.toughness = newValue;
    
    //calls setDefenseModifier method
    setDefenseModifier(this.toughness);
  }
  
  //method to return the value of the toughness property
  public int getToughness(){
    
    //retrurns the value of the toughness property
    return this.toughness;
  }
  
  //method to assign a value to the intelligence property
  public void setIntelligence(int newValue){
    
    //assigns the value of newValue to intelligence
    this.intelligence = newValue;
    
    //calls setSkillModifier method
    setSkillModifier(this.intelligence);
  }
  
  //method to return the value of the intelligence property
  public int getIntelligence(){
    
    //retrurns the value of the intelligence property
    return this.intelligence;
  }
  
  //method to compute the modifier of a player's attribute,
  //i.e. the bonus a player receives from strength, toughness,
  //and intelligence
  private int computeModifier(int attributeValue){
    
    //returns the value of the calculation
    return ((attributeValue - 10) / 2);
  }
  
  //method to assign a value to the attackModifier property
  private void setAttackModifier(int newValue){
    
    //calls the computeModifier method, passing the value of
    //newValue. value returned by method is assigned to attackModifier
    this.attackModifier = computeModifier(newValue);
    
    //calls the setTotalAttack method
    this.setTotalAttack(this.weapon.getAtkMod(), this.attackModifier);
  }
  
  //method to return the value of the attackModifier property
  public int getAttackModifier(){
    
    //retrurns the value of the attackModifier property
    return this.attackModifier;
  }
  
  //method to assign a value to the defenseModifier property
  private void setDefenseModifier(int newValue){
    
    //calls the computeModifier method, passing the value of
    //newValue. value returned by method is assigned to defenseModifier
    this.defenseModifier = computeModifier(newValue);
    
    //calls the setTotalDefense method
    setTotalDefense(this.armor.getDefMod(), this.defenseModifier);
  }
  
  //method to return the value of the defenseModifier property
  public int getDefenseModifier(){
    
    //retrurns the value of the defenseModifier property
    return this.defenseModifier;
  }
  
  //method to assign a value to the skillModifier property
  private void setSkillModifier(int newValue){
    
    //calls the computeModifier method, passing the value of
    //newValue. value returned by method is assigned to skillModifier
    this.skillModifier = computeModifier(newValue);
    
    //calls the setTotalSkill method
    setTotalSkill();
  }
  
  //method to return the value of the skillModifier property
  public int getSkillModifier(){
    
    //retrurns the value of the defenseModifier property
    return this.skillModifier;
  }
  
  //method to assign a value to the weapon property
  public void setWeapon(Weapon currentWeapon, Weapon newWeapon){
    
    //calls unequipCurrentWeapon method
    unequipCurrentWeapon(currentWeapon.getAtkMod(), this.attackModifier);
    
    //calls equipNewWeapon method
    equipNewWeapon(newWeapon, newWeapon.getAtkMod(), this.attackModifier);
  }
  
  //method for removing the current weapon's attack modifier value (weapon.atkMod)
  //from the value of the totalAttack property
  private void unequipCurrentWeapon(int currentWeaponAtk, int atkMod){
    
    //calls the setTotalAttack method
    setTotalAttack((-currentWeaponAtk), atkMod);
  }
  
  //method for adding the new weapon's attack modifier value (weapon.atkMod)
  //to the value of the totalAttack property
  private void equipNewWeapon(Weapon newWeapon, int newWeaponAtk, int atkMod){
    
    //assigns the value of newWeapon to weapon
    this.weapon = newWeapon;
    
    //calls the setTotalAttack method
    setTotalAttack(newWeaponAtk, atkMod);
  }
  
  //method to return the value of the weapon property
  public Weapon getWeapon(){
    
    //returns the value of the weapon property
    return this.weapon;
  }
  
  //method to assign a value to the armor property
  public void setArmor(Armor currentArmor, Armor newArmor){
    
    //calls unequipCurrentArmor method
    unequipCurrentArmor(currentArmor.getDefMod(), this.defenseModifier);
    
    //calls equipNewArmor method
    equipNewArmor(newArmor.getDefMod(), this.defenseModifier);
    
    //assigns the value of newArmor to armor
    this.armor = newArmor;
  }
  
  //method for removing the current armor's defense modifier value (armor.defMod)
  //from the value of the totalDefense property
  private void unequipCurrentArmor(int currentArmorDef, int defMod){
    
    //calls the setTotalDefense method
    setTotalDefense((-currentArmorDef), defMod);
  }
  
  //method for adding the new armor's defense modifier value (armor.defMod)
  //to the value of the totalDefense property
  private void equipNewArmor(int newArmorDef, int defMod){
    
    //calls the setTotalArmor method
    setTotalDefense(newArmorDef, defMod);
  }
  
  //method to return the value of the armor property
  public Armor getArmor(){
    
    //returns the value of the armor property
    return this.armor;
  }
  
  //method to assign a value to the itemOne property
  public void setItemOne(Item oldItem, Item newItem){
    
    //calls unequipCurrentItem method
    unequipCurrentItem(oldItem);
    
    //calls equipNewItem method
    equipNewItem(newItem);
    
    //assigns the newItem object to the itemOne property
    this.itemOne = newItem;
  }
  
  //method to return the value of the itemOne property
  public Item getItemOne(){
    
    //returns the value of the itemOne property
    return this.itemOne;
  }
  
  //method to assign a value to the itemTwo property
  public void setItemTwo(Item oldItem, Item newItem){
    
    //calls unequipCurrentItem method
    unequipCurrentItem(oldItem);
    
    //calls equipNewItem method
    equipNewItem(newItem);
    
    //assigns the newItem object to the itemOne property
    this.itemTwo = newItem;
  }
  
  //method to return the value of the itemTwo property
  public Item getItemTwo(){
    
    //returns the value of the itemTwo property
    return this.itemTwo;
  }
  
  //method to assign a value to the itemThree property
  public void setItemThree(Item oldItem, Item newItem){
    
    //calls unequipCurrentItem method
    unequipCurrentItem(oldItem);
    
    //calls equipNewItem method
    equipNewItem(newItem);
    
    //assigns the newItem object to the itemOne property
    this.itemThree = newItem;
  }
  
  //method to return the value of the itemThree property
  public Item getItemThree(){
    
    //returns the value of the itemThree property
    return this.itemThree;
  }
  
  //method for removing the current Item's attribute modifier values
  //from the player's current attribute values
  private void unequipCurrentItem(Item currentItem){
    
    //calls removeAttributeModifiers method
    removeAttributeModifiers(currentItem);
  }
  
  //method for adding the new Item's attribute modifier values
  //to the player's base attribute values, then updates the
  //attack, defense, and skill modifiers
  private void equipNewItem(Item newItem){
    
    //calls the applyAttributeModifiers method
    applyAttributeModifiers(newItem);
    
    //calls the setAttackModifier method
    setAttackModifier(this.strength);
    
    //calls the setDefenseModifier method
    setDefenseModifier(this.toughness);
    
    //calls the setSkillModifier method
    setSkillModifier(this.intelligence);
  }
  
  //method that subtracts the current item's attribute modifier values
  //from the players current attribute values
  private void removeAttributeModifiers(Item currentItem){
    
    //subtracts the current item's strength modifier from the
    //player's current strength
    this.strength -= currentItem.getStrMod();
    
    //subtracts the current item's toughness modifier from the
    //player's current toughness
    this.toughness -= currentItem.getTufMod();
    
    //subtracts the current item's intelligence modifier from the
    //player's current intelligence
    this.intelligence -= currentItem.getSklMod();
  }
  
  //method that adds the new item's attribute modifier values
  //to the players base attribute values
  private void applyAttributeModifiers(Item newItem){
    
    //adds the new item's strength modifier to the player's
    //base strength
    this.strength += newItem.getStrMod();
    
    //adds the new item's toughness modifier to the player's
    //base toughness
    this.toughness += newItem.getTufMod();
    
    //adds the new item's intelligence modifier to the player's
    //base intelligence
    this.intelligence += newItem.getSklMod();
  }
  
  //method to set the totalAttack property of the player
  private void setTotalAttack(int weaponAttack, int attackMod){
    
    //calculates a value and assigns that value to totalAttack
    this.totalAttack = weaponAttack + attackMod;
  }
  
  //method to return the valur of the totalAttack property
  public int getTotalAttack(){
    
    //returns the value of the totalAttack property
    return totalAttack;
  }
  
  //method to set the totalDefense property of the player
  private void setTotalDefense(int armorDefense, int defenseModifier){
    
    //calculates a value and assigns that value to totalDefense
    this.totalDefense = armorDefense + defenseModifier;
  }
  
   //method to return the valur of the totalDefense property
  public int getTotalDefense(){
    
    //returns the value of the totalDefense property
    return totalDefense;
  }
  
  //method to set the totalSkill property
  private void setTotalSkill(){
    
    //sets the value of the totalSkill property
    this.totalSkill = this.skillModifier;
  }
  
  //method to return the value of the totalSkill property
  public int getTotalSkill(){
    
    //returns the value of the totalSkill property
    return totalSkill;
  }
  

}