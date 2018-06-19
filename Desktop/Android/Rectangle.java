public class Rectangle extends Shape
{
  private int length;
  private int breadth;

  public Rectangle()
{
  this.length = 10;
  this.breadth = 5;
}
public Rectangle(int length,int breadth)
{
  this.length = length;
  this.breadth = breadth;
}

public void setArea()
{
 area = length*breadth;
}

public void setPerimeter()
{
 perimeter =  2*(length + breadth);
}

}
