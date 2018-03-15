/*
  Francisco Leon
  Co Sci 290
  
  This program is a revamp f Lab8. Uses ArrayList
  instead of array.
*/
import java.util.*;

public class Lab9{
  public static void main(String[] args){
       
    ArrayList<Student> profile = new ArrayList<Student>();
    
    //instantiate each student object
    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();
    Student student4 = new Student();
    Student student5 = new Student();
    //Loads ArrayList with students   
    profile.add(student1);
    profile.add(student2);
    profile.add(student3);
    profile.add(student4);
    profile.add(student5);
       
    //Person 1
    profile.get(0).setMajor("Electrical Engineering");
    profile.get(0).setGpa(2.3);    
    //Person 2
    profile.get(1).setMajor("Psychology");
    profile.get(1).setGpa(3.5);
    //Person 3
    profile.get(2).setMajor("Math");
    profile.get(2).setGpa(3.8);
    //Person 4
    profile.get(3).setMajor("Kinesiology");
    profile.get(3).setGpa(4.0);
    //Person 5
    profile.get(4).setMajor("Art");
    profile.get(4).setGpa(3.0);
    
    //testing the new functions
      //print
    printStudents(profile);
      //find
    System.out.println("Test. Find gpa of the math major: " 
                      + findMajor(profile,"Math").getGpa());
       
  }
  //outside of main
  
  //prints all the students information
  public static void printStudents(ArrayList<Student> profile){
    int i=1;
    for(Student e: profile){
      System.out.println("\nStudent " + (i++) + " information:");
      System.out.println("Major: " + e.getMajor());
      System.out.println("Gpa: " + e.getGpa());
    }
  }
  //returns the first student with that major
  public static Student findMajor(ArrayList<Student> profile, String major){
    for(Student e: profile){
      if(e.getMajor() == major) return e;
    }
    //default return
    return null;
  }
}