/*
  Francisco Leon
  Co Sci 290
  
  Takes information from the user to begin adventure.
*/

import java.util.Scanner; 

public class GameDriver{
  public static void main(String[] args){
    
    String name = "";
    String catName = "";
    String direction = "";
    double clownLikeLevel = 0.0;
    
    //Start Screen
    /*System.out.println(  "  ___________ __________________     _____ _____________________._.  \n"
                    +    "  \\_   _____//   _____/\\_   ___ \\   /  _  \\\\______   \\_   _____/| | \n"
                     +   "   |    __)_ \\_____  \\ /    \\  \\/  /  /_\\  \\|     ___/|    __)_ | | \n"
                      +  "   |        \\/        \\\\     \\____/    |    \\    |    |        \\ \\| \n"
                       + "  /_______  /_______  / \\______  /\\____|__  /____|   /_______  / __ \n"
                        +"          \\/        \\/         \\/         \\/                 \\/  \\/ \n"
                        );
    */
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
    //System.out.println("");
    
    
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
    
    int chance = 1 + (int)(Math.random() * (100 - 1));
    if(chance >= 30){
      System.out.println("\nMEOW~\n" + catName + " got scared and ran the room.");
    }
    else{
      System.out.println("\nIn the distance you hear a low whisper say... bless you.");
    }
    
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