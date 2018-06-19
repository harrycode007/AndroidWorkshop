public class Lion extends Animals{

	 public void animalSays(String saySomething ,int age){
      System.out.println("Roar !!");
	 }
     //Overloading
     public void animalSays(String saySomething ,int age,boolean alive){
     	System.out.println(saySomething+" "+age+ " "+alive);
     }
	 //Override
 
     @Override
     public void printAnimal(){
       System.out.println("Lion !!");
     }
    
    public static void main(String args[]){
       Lion lion = new Lion();

       //Overidden method
       lion.printAnimal();

       //Overloaded method
       lion.animalSays("Yahoooooooooo !!!");
       lion.animalSays("I am old",112);
       lion.animalSays("Yes I am alive",112,true);
    }
}	 