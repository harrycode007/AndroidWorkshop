public class Cube extends Solid {

	private int side;

	public Cube(){
		this.side = 10;
	}
	public Cube(int side){
		this.side = side;
	}
    public void setVolume(){
    	volume = (side*side*side);
    }

     public void setCsarea(){
    	csarea = (4*side*side);
    }

       public void setSarea(){
    	sarea = (6*side*side);
    }
}
