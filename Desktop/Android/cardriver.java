public class cardriver{
  public static void main(String args[]){
  car car1 = new car();
  car car2 = new car("Maruti",100000,"red");
  car car3 = new car("Audi");
  car1.cardetails();
  car2.cardetails();
  car3.setColour("white");
  car3.setPrice(50000);
  car3.cardetails();
  String car1Colour = car2.getColour();
  System.out.println(car1Colour);
  System.out.println(car3.getDiscount(15));
}
}
