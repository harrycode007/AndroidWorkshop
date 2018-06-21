public class Example{

private String name;
private int age;
private String address;
//Constructor
public Example(){
	//default
}
//Constructor 2
public Example(String name,int age){
	this.name = name;
	this.age = age;
}
 //Constructor 3
 public Example(String name,int age,String address){
	this.name = name;
	this.age = age;
	this.address = address;
}
}