public class Student{
	
	private int rollNumber;
	private String name;
	public static String universityName = "Oxford"; 

	public Student(int rollNumber, String name){
      this.rollNumber = rollNumber;
      this.name = name;
	}
   
    public static void printSomething(){
    	System.out.println("This is a static method");
    }

    public void getStudentDetails(){
    	System.out.println("Roll number "+rollNumber+"Name"+name+"University name "+universityName);
    	    }

    public void setStudentDetails(int rollNumber,String name){
    	this.rollNumber = rollNumber;
        this.name = name;
    }

}