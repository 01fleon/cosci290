/*
  Francisco Leon
  Co Sci 290
  
  This program uses an ArrayList of students,
  randomly assigned gpas, and functions that print
  student's info, sort the ArrayList by gpa, and 
  check if it's sorted.
*/
import java.util.*;

public class Midterm1Bonus{
  public static void main(String[] args){
       
    ArrayList<Student> profile = new ArrayList<Student>();
    
    //instantiate each student object
    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();
    Student student4 = new Student();
    Student student5 = new Student();
    //loads ArrayList with students   
    profile.add(student1);
    profile.add(student2);
    profile.add(student3);
    profile.add(student4);
    profile.add(student5);
       
    //Person 1
    profile.get(0).setMajor("Electrical Engineering");
    profile.get(0).setGpa(randomGPA(0,4)); //Random gpa is given to each student   
    //Person 2
    profile.get(1).setMajor("Psychology");
    profile.get(1).setGpa(randomGPA(0,4));
    //Person 3
    profile.get(2).setMajor("Math");
    profile.get(2).setGpa(randomGPA(0,4));
    //Person 4
    profile.get(3).setMajor("Kinesiology");
    profile.get(3).setGpa(randomGPA(0,4));
    //Person 5
    profile.get(4).setMajor("Art");
    profile.get(4).setGpa(randomGPA(0,4));
    
    //prints all student's major and gpa
    System.out.println("Students:");
    printStudents(profile);
    
    //checks if students are sort by increasing gpa
    if(isSorted(profile)){
      //if already sorted, message output
      System.out.println("\nThey're already sorted in incresing Gpa.");
    }
    else{
      //if not sorted, gets sorted then prints
      System.out.println("\nReorganized in incresing Gpa:");
      profile = sortGPA(profile); //profiles of students get sorted
      printStudents(profile); //prints sorted profiles
    }
        
     
  }
  //outside of main
  
  //prints all the students information
  public static void printStudents(ArrayList<Student> profile){
    int i=1;
    for(Student e: profile){
      System.out.println("Major: " + e.getMajor());
      System.out.println("Gpa: " + e.getGpa() + "\n");
    }
  }
  
  //checks if gpas of students are in increasing order
  public static boolean isSorted(ArrayList<Student> profile){
    //goes through list up til the last one
    for(int i=0; i<profile.size()-1; i++){
      //checks if next student's gpa is smaller
      //which would mean it's not sorted
      if(profile.get(i).getGpa() > profile.get(i+1).getGpa()){
        return false; //not sorted
      }  
    }
    return true; //otherwise it is sorted
  }
  
  //takes the profiles of students and sorts them
  //into increasing gpa order, then returns the profiles.
  public static ArrayList<Student> sortGPA(ArrayList<Student> profile){
    while(!isSorted(profile)){ //as long as it's not sorted
      for(int i=0; i<profile.size()-1; i++){ //go through profiles
        //when the next person's gpa is less than current person
        if(profile.get(i).getGpa() > profile.get(i+1).getGpa()){ 
          //put a copy of the next person's file before this current
          //person's file
          profile.add(i,profile.get(i+1));
          //then remove the out of place file that was copied  
          profile.remove(i+2); //which is at i+2 now cause the copy was 
                               //inserted and bumped up the indexes
        }
      }
    }
    return profile; //a sorted profile return
  }
  
  //gives a random gpa from given ranged
  public static double randomGPA(int start, int end){
    return start + (Math.random() * (end - start));
  }
}