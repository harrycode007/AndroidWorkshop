import java.io.*;

public class MyReader{

    //Method 1
	public void readFromAFile(String fileName){
		FileReader fileReader = null;


		try{
			fileReader = new FileReader(fileName);
      int c; //Store a piece of data from file

      while((c = fileReader.read()) != -1){
      	System.out.println(c);
      }

		}catch(FileNotFoundException harry){
          System.err.println(harry);

		}catch(IOException io){
           System.err.println(io);


        }finally{
          System.out.println(fileName); 
        	try{
        		fileReader.close();
        	}catch(IOException ioe){
        		System.out.println(ioe);
        	}
          
		}

	}


	//Method 2
	public void writeToAFile(String fileName,String input) throws IOException {
      
      FileWriter fileWriter = new FileWriter("filename");
      
      for(int i = 0;i < input.length(); i++){
          fileWriter.write(input.charAt(i));
      }
      System.out.println(fileName);
      System.out.println(input);
      fileWriter.close();
	}

  public static void main(String[] args) {
    MyReader cc = new MyReader();
     
     cc.readFromAFile("sublime.txt"); 
     try{
      cc.writeToAFile("sublime.txt" , "hari");
     }catch(IOException f){

     }

  }
} 

