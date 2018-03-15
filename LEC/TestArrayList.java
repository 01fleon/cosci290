

import java.util.*;
public class TestArrayList{
  
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    list.add(30);
    list.add(100);
    
    System.out.println("get first element"+list.get(0));
    
    list.remove(0);
    
    list.add(1,50);
    list.size();
    
  }
}