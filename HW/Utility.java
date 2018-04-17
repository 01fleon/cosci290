import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utility{
  /*
    This method opens a file and prints each line
  */
  public void readFile(String filename){
    String currentLine;
    
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      while( (currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
      
    }catch(IOException e){
      e.printStackTrace();
    }
    
  }
  public static int chance(int start, int end){
      return start + (int)(Math.random() * (end - start));
    }  
  public void splashPage(String scene){
    switch(scene){
    case "title" :  
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
                                ": :: : :   :   : :   : :  :    :: :: :    :   : :  \n"); 
                                break;
    /*case "intro" :
            System.out.println("Bored out of your mind one night, you decided to go out on a stroll.\n" +
                       "Feeling the need for fresh air, you continue to walk far into the forest.\n"+
                       "The scent of cotton candy and popcorn hits your nose. Following the scent, \n"+
                       "you stumble across an enormous red and white striped circus tent. You walk in.\n"+
                       "Surrounded by amusing lights and joyous music, you begin to relax. In that\n"+
                       "moment...HONK!!hAHahahahha..everything goes dark.\n \n"); 
                                break;
    */
    case "cat" : 
            System.out.print( "       ,     ,                   \n"+                
                              "       |\\.\"./|                 \n"+
                              "      /       \\                 \n"+
                              "     /  _   _  \\   ______       \n"+
                              "     \\==  Y  ==/\"'`      `.    \n"+
                              "     /`-._^_.-'\\     ,-  . \\   \n"+
                              "    /     `     \\   /     \\ \\ \n"+
                              "    \\  \\.___./  /_ _\\     / / \n"+
                              "     `, \\   / ,'  (,-----' /   \n"+
                              "       \"\"' '\"\"     '------'  \n");
                                break;
    case "gameover" :
            System.out.println(   " _____                        _____                \n"+
                                  "|  __ \\                      |  _  |               \n"+
                                  "| |  \\/ __ _ _ __ ___   ___  | | | |_   _____ _ __ \n"+
                                  "| | __ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|\n"+
                                  "| |_\\ \\ (_| | | | | | |  __/ \\ \\_/ /\\ V /  __/ |   \n"+
                                  " \\____/\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_|");
                                break; 
    }
  }
}