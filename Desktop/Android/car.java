public class car
{  
  private String brand;
  private int price;
  private String colour;
  
  //constructors
  public car()
{
  //default constructor
}
  public car(String brand,int price, String colour)
{
  this.brand=brand;
  this.price=price;
  this.colour=colour;
} 

  public car(String brand)
{
  this.brand=brand;
}

 //methods

 public String getBrand()
{
 return this.brand;
}

public int getPrice()
{
 return this.price;
}

public String getColour()
{
 return this.colour;
}

 public void setBrand(String brand)
{
  this.brand=brand;
}

public void setPrice(int price)
{
  this.price=price;
}

public void setColour(String colour)
{
  this.colour=colour;
}

public void setcar(String brand,int price, String colour)
{
  this.brand=brand;
  this.price=price;
  this.colour=colour;
}
  
 public float getDiscount(int discount)
{
  float cost = ((float)discount/100)*price;
  return price - cost;
}

 public void cardetails()
{
  System.out.println("The brand of the car is "+getBrand() + ",colour is "+this.colour + ",and the price is "+this.price);

}

}

