import java.util.Scanner;

public class TakeInput{
	public static void main(String args[]){

		Scanner userInput = new Scanner(System.in);
        String name = userInput.nextLine();//String
        System.out.println("My name is "+name);
        int age = userInput.nextInt();//Integer
        System.out.println("I am "+age+ "years old.");
        System.out.println("Enter a double");
        double variable = userInput.nextDouble();
        System.out.println("The entered double is "+variable);
        userInput.close();
	}
}