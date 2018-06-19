public class Child2 extends Parent2 {

	@Override
	protected void methodA(){
		super.methodA();
		System.out.println("Overidden A");
	}

	@Override
	public void methodB(){
		super.methodB();
		System.out.println("Overidden B");
	}

	public static void main(String args[]){

		Child2 child = new Child2();
        child.methodA();
        child.methodB();
	}
}