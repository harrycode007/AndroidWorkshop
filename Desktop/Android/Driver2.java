public class Driver2{
	public static void main(String args[]){

		StaticExample.printSomethingAgain();
		System.out.println("---------");



		//For non static methods
		StaticExample example = new StaticExample();
		example.printSomething(); 
	}
}