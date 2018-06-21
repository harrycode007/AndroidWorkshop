public class Square extends Shape
{
  private int side;
  
  public Square()
{
  this.side = 5;
}

public Square(int side)
{
  this.side = side;
}

public void setArea()
{
 area = side*side;
}

public void setPerimeter()
{
 perimeter = 4*side;
}

}
