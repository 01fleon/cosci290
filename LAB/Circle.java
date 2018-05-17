public class Circle extends Shape{
  
  
  public Circle(){
    super();
  }
  
  @Override
  public double CalculateArea(double measure){
    return measure*measure*3.14;
  }
}