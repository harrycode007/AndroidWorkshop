public class Inheritance extends SuperExample {

	public Inheritance() {
		System.out.println("Child constructor");
	}
	public void printSomething(){
		System.out.println("Method in child class");
        super.printSomething();
	}

	public static void main(String args[]){
		Inheritance inheritance = new Inheritance();
        Inheritance.printSomething();
	}
}