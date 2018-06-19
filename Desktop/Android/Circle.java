public class Circle extends Shape
{
  private int radius;
  
  public Circle()
{
  this.radius = 5;
}

public Circle(int radius)
{
  this.radius = radius;
}

public void setArea()
{
 area = (float)3.14*radius*radius;
}

public void setPerimeter()
{
 perimeter = (float)6.28*radius;
}

}
