public class Cuboid extends Solid {

	private int length;
    private int breadth;
    private int height;

	public Cuboid(){
		this.length = 10;
        this.breadth = 7;
        this.height = 5;
	}
	public Cuboid(int length,int breadth,int height){
		this.length = length;
        this.breadth = breadth;
        this.height = height;
	}
    public void setVolume(){
    	volume = (length*breadth*height);
    }

     public void setCsarea(){
    	csarea = 2*height*(length + breadth);
    }

       public void setSarea(){
    	sarea = 2*(length*breadth + breadth*height + height*length);        
    }
}
