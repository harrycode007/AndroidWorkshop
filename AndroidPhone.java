import java.util.Scanner;

public class AndroidPhone {
	private int phonePrice = 15500, screenSize = 12;
	private double thickness = 5.4;
	private boolean isAudioJackPresent = true;
	private String phoneName = "Honor 8 Lite" , phoneBrand = "Huawei";


public void myAwesomePhone() {
    System.out.println("I have "+phoneBrand+ " "+phoneName+ ".");
    System.out.println("The price of my phone is "+phonePrice+"and the size and the thickness are "+screenSize+" "+thickness+"respectively.");
    System.out.println("It is "+isAudioJackPresent+"that the audiojack is present");

}

public void buildPhone(int phonePrice,int screenSize , double thickness , boolean isAudioJackPresent,
	String phoneName , String phoneBrand) {
	this.phonePrice = phonePrice;
	this.screenSize = screenSize;
	this.thickness = thickness;
	this.isAudioJackPresent = isAudioJackPresent;
	this.phoneName = phoneName;
	this.phoneBrand = phoneBrand;
}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	AndroidPhone ha = new AndroidPhone();

	ha.myAwesomePhone();

	int phonePrice = scan.nextInt();
	int screenSize = scan.nextInt();
	double thickness = scan.nextDouble();
	boolean isAudioJackPresent = scan.nextBoolean();
	String phoneName = scan.nextLine();
	String phoneBrand = scan.nextLine();

    ha.buildPhone(phonePrice, screenSize , thickness , isAudioJackPresent ,
	 phoneName , phoneBrand);
    
    

    ha.myAwesomePhone();
    scan.close();

}

}