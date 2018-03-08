/*
  Francisco Leon
  Co Sci 290
  
  This program runs a text based rpg that puts to use
  lessons learned in class.
*/

import java.util.Scanner; 

public class GameDriver{
  public static void main(String[] args){
    
    String name = "";
    String catName = "";
    String direction = "";
    double clownLikeLevel = 0.0;
    int chance = 0;
    /*
    //Start Screen
    System.out.println( "      @@@        @@@@@@    @@@@@@   @@@@@@@   \n"+
                        "      @@@       @@@@@@@@  @@@@@@@   @@@@@@@   \n"+
                        "      @@!       @@!  @@@  !@@         @@!     \n"+
                        "      !@!       !@!  @!@  !@!         !@!     \n"+
                        "      @!!       @!@!@!@!  !!@@!!      @!!     \n"+
                        "      !!!       !!!@!!!!   !!@!!!     !!!     \n"+
                        "      !!:       !!:  !!!       !:!    !!:     \n"+
                        "       :!:      :!:  !:!      !:!     :!:     \n"+
                        "       :: ::::  ::   :::  :::: ::      ::     \n"+  
                        "      : :: : :   :   : :  :: : :       :      \n"+


                        "@@@        @@@@@@   @@@  @@@   @@@@@@@@  @@@  @@@  \n"+
                        "@@@       @@@@@@@@  @@@  @@@  @@@@@@@@@  @@@  @@@  \n"+
                        "@@!       @@!  @@@  @@!  @@@  !@@        @@!  @@@  \n"+
                        "!@!       !@!  @!@  !@!  @!@  !@!        !@!  @!@  \n"+
                        "@!!       @!@!@!@!  @!@  !@!  !@! @!@!@  @!@!@!@!  \n"+
                        "!!!       !!!@!!!!  !@!  !!!  !!! !!@!!  !!!@!!!!  \n"+
                        "!!:       !!:  !!!  !!:  !!!  :!!   !!:  !!:  !!!  \n"+
                        " :!:      :!:  !:!  :!:  !:!  :!:   !::  :!:  !:!  \n"+
                        " :: ::::  ::   :::  ::::: ::   ::: ::::  ::   :::  \n"+
                        ": :: : :   :   : :   : :  :    :: :: :    :   : :  \n"
                       );
                                                   
    // intro story 
    System.out.println("Bored out of your mind one night, you decided to go out on a stroll.\n" +
                       "Feeling the need for fresh air, you continue to walk far into the forest.\n"+
                       "The scent of cotton candy and popcorn hits your nose. Following the scent, \n"+
                       "you stumble across an enormous red and white striped circus tent. You walk in.\n"+
                       "Surrounded by amusing lights and joyous music, you begin to relax. In that\n"+
                       "moment...HONK!!hAHahahahha..everything goes dark.\n \n");
    
    
    //User info/set up
    System.out.print("You've been passed out for 3 days.\n" + "What's your name? ");
    Scanner input = new Scanner(System.in);
    name = input.next();
    
    System.out.print(name + ", on a scale of 1 to 10, how much do you like clowns? ");
    clownLikeLevel = input.nextDouble();
    System.out.print(clownLikeLevel + " out of 10? Great! \nCause this place is full of them!\n \n"
                    + "Also, here's a cat.\n"+
                    "       ,     ,                   \n"+                
                    "       |\\.\"./|                 \n"+
                    "      /       \\                 \n"+
                    "     /  _   _  \\   ______       \n"+
                    "     \\==  Y  ==/\"'`      `.    \n"+
                    "     /`-._^_.-'\\     ,-  . \\   \n"+
                    "    /     `     \\   /     \\ \\ \n"+
                    "    \\  \\.___./  /_ _\\     / / \n"+
                    "     `, \\   / ,'  (,-----' /   \n"+
                    "       \"\"' '\"\"     '------'  \n"+
                    "What's it's name? "
                    );
    catName = input.next();
    System.out.print("\nLooks like " + name + " and " + catName + " are ready!\n"
                    + "Which direction do you head in? ");
    direction = input.next();
    System.out.print("Cool, " + direction + " it is! Good luck!\n \n");
    
    //Random event
    System.out.println("There's a lot of dust.\n" + "Oh, you feel a sneeze coming on.\n"
                      + "ahhh\nahhHHHHhh\nCHUUUUU!");
    
    chance = 1 + (int)(Math.random() * (100 - 1));
    if(chance >= 30){
      System.out.println("\nMEOW~\n" + catName + " got scared and ran out the room.");
    }
    else{
      System.out.println("\nIn the distance you hear a low whisper say... bless you.");
    }
    */
    
    //Lab7
    Player[] NonImportantPlayers = new Player[2];
    //Default weapons
    Weapon noWeapon = new Weapon("none",0);
    Armor noArmor = new Armor("none",0);
    Item noItem = new Item("none",0,0,0);
    //NPC set up
    Player Npc1 = new Player("Hugo", "Lee", "Druid", 76, noWeapon, noArmor, noItem);
    Player Npc2 = new Player("Tak", "Zoo", "Mage", 600, noWeapon, noArmor, noItem);
    
    NonImportantPlayers[0] = Npc1;
    NonImportantPlayers[1] = Npc2;
    
    /*
    Npc1.setStrength(1 + (int)(Math.random() * (20 - 1)));
    System.out.println("Strength: " + Npc1.getStrength());
    System.out.println("attack: " + Npc1.getTotalAttack());
    */
    
    for(int index = 0; index < NonImportantPlayers.length; index++){
       NonImportantPlayers[index].setHitPoints(1 + (int)(Math.random() * (20 - 1)));
       System.out.println("Hit points: " + NonImportantPlayers[index].getHitPoints());
    }
    
    
    /*for(Player Npc: NonImportantPlayers){
      Npc.setHitPoints(1 + (int)(Math.random() * (20 - 1)));
      Npc.setStrength(1 + (int)(Math.random() * (20 - 1)));
      Npc.setToughness(1 + (int)(Math.random() * (20 - 1)));
      Npc.setIntelligence(1 + (int)(Math.random() * (20 - 1)));
    }
    int i = 1;
    for(Player Npc: NonImportantPlayers){
      System.out.println(Npc.getFirstName() + " " + Npc.getLastName() + " attributes:");
      System.out.println("Hit points: " + Npc.getHitPoints());
      //System.out.println("Strength: " + Npc.getStrength());
      System.out.println("getToughness: " + Npc.getToughness());
      System.out.println("Intelligence: " + Npc.getIntelligence());
    }
    */
    //Game over
    System.out.println(   " _____                        _____                \n"+
                          "|  __ \\                      |  _  |               \n"+
                          "| |  \\/ __ _ _ __ ___   ___  | | | |_   _____ _ __ \n"+
                          "| | __ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|\n"+
                          "| |_\\ \\ (_| | | | | | |  __/ \\ \\_/ /\\ V /  __/ |   \n"+
                          " \\____/\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_|   "
                        );
  
      
  }
  
}