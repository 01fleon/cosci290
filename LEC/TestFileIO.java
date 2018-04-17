import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileIO{
  
  public static void main(String[] args){
    String currentLine;
    String filename = "Text.txt";
    
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      while( (currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
      
    }catch(IOException e){
      e.printStackTrace();
    }
    
  }
}