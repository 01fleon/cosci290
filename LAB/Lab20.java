/*
  Francisco Leon
  Co Sci 290
  
  Shape class based on student class.
*/

public class Shape{
  private double area;
  private String name;
  
  //zero-argument default constructor
  public Shape(){
    this.area = 0.0;
    this.name = "unknown";
  }
  
  public double getArea(){
    return this.area;
  }
  
  public void setArea(double area){
    this.area = area;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public String toString(){
    return "Shape has area: " + this.area + " Major: " + this.name;
  }
  
}