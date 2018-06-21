public class MyFavourites extends ParentFavourites implements Favourites {

	public void favouriteFruit(){
		System.out.println("Mango");
	}
    
    public void favouriteIcecream(){
    	System.out.println("Strawberry Icecream");
    }
     
    public void favouriteMovie(){
    	super.parentFavouriteMovie();
    	System.out.println("3 Idiots");
    }

    public void favouriteSubject(){
    	super.parentFavouriteSubject();
    	System.out.println("Mathematics");
    }

    public static void main(String args[]){
    	MyFavourites harry = new MyFavourites();

    	harry.favouriteFruit();
    	harry.favouriteIcecream();
    	harry.favouriteMovie();
    	harry.favouriteSubject();
    	
    }
}