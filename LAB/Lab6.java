/*
  Francisco Leon
  Co Sci 290
  
  This program uses an array to store
  Student information. Also prints out
  the Student information.
*/

public class Lab6{
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
    profile[0].setMajor("Math");
    profile[0].setGpa(2.7);    
    //Person 2
    profile[1].setMajor("Computer Science");
    profile[1].setGpa(3.2);
    //Person 3
    profile[2].setMajor("Music");
    profile[2].setGpa(3.6);
    //Person 4
    profile[3].setMajor("Chemistry");
    profile[3].setGpa(1.9);
    //Person 5
    profile[4].setMajor("Biology");
    profile[4].setGpa(2.2);
    
    //Iterates through each student object
    /* Regular way
    for(int i=0; i<profile.length; i++){
      System.out.println("\nStudent " + (i+1) + " information:");
      System.out.println("Major: " + profile[i].getMajor());
      System.out.println("Gpa: " + profile[i].getGpa());
    }
    */
    //Cool new Foreach loop way
    int i=1;
    for(Student e: profile){
      System.out.println("\nStudent " + (i++) + " information:");
      System.out.println("Major: " + e.getMajor());
      System.out.println("Gpa: " + e.getGpa());
    }
        
  }
}