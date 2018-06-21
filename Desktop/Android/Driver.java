public class Driver{
	
	String yay = "yay";
	
    public void printYay(){
    System.out.println("Yaya again!!!");
}
	public static void main(String args[]){
 
    Driver driver = new Driver();

    System.out.println(driver.yay);

	//className.variable -> Static variable	
    Student.universityName = "Amrita";

    //className.methodName() -> Static method
    Student.printSomething();

    Student student1 = new Student(16002,"YO");
    Student student2 = new Student(16003,"YAY");

    student1.getStudentDetails();
    student2.getStudentDetails();
  }

}