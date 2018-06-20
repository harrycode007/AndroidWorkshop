public class ExceptionExample{
	public static void main(String args[]){

     int[] arr = new int[5];//size 5

     System.out.println("Statement 1");
     System.out.println("Statement 2");
     System.out.println("Statement 3");
     
     try{
     	arr[6] = 10;
     }catch(Exception e){
     	System.out.println(e);
     }finally{
        System.out.println("Finally Blocked");
     }

     System.out.println("Statement 4");
     System.out.println("Statement 5");
     System.out.println("Statement 6");

	}
}	