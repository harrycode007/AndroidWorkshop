class Parent{
   int number = 1002;
   int rollNo = 17030;
   String name = "Hariharan"

}
public class ParentChild extends Parent{

	 int number = 1004;
	 String favFruit = "Mango";
	 int rollNo = 12634;

	 public void numberPrint(){
	 	System.out.println("Parent"+super.number);
	 	System.out.println(super.favFruit+" "+super.name);

	 }

public static void main(String args[]){
     ParentChild parentChild = new ParentChild();
     System.out.println("Child"+parentChild.number);
     parentChild.numberPrint1();
     System.out.println(parentChild.favFruit"+parentChild.favFruit)

	 }
}