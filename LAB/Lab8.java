/*
  Francisco Leon
  Co Sci 290
  
  This program contains a print function
  and a search function for Students.
*/
public class Lab8{
  public static void main(String[] args){
    Student[] profile = new Student[5];
    
    //instantiate each student object
    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();
    Student student4 = new Student();
    Student student5 = new Student();
    profile[0] = student1;
    profile[1] = student2;
    profile[2] = student3;
    profile[3] = student4;
    profile[4] = student5;
    
    //Person 1
    profile[0].setMajor("Electrical Engineering");
    profile[0].setGpa(2.3);    
    //Person 2
    profile[1].setMajor("Psychology");
    profile[1].setGpa(3.5);
    //Person 3
    profile[2].setMajor("Math");
    profile[2].setGpa(3.8);
    //Person 4
    profile[3].setMajor("Kinesiology");
    profile[3].setGpa(4.0);
    //Person 5
    profile[4].setMajor("Art");
    profile[4].setGpa(3.0);
    
    //testing the new functions
    printStudents(profile);
    findMajor(profile,"Math");
    System.out.println(findMajor(profile,"Math").getGpa());
       
  }
  //outside of main
  
  //prints all the students information
  public static void printStudents(Student[] profile){
    int i=1;
    for(Student e: profile){
      System.out.println("\nStudent " + (i++) + " information:");
      System.out.println("Major: " + e.getMajor());
      System.out.println("Gpa: " + e.getGpa());
    }
  }
  //returns the first student with that major
  public static Student findMajor(Student[] profile, String major){
    for(Student e: profile){
      if(e.getMajor() == major) return e;
    }
    //default return
    return null;
  }
}