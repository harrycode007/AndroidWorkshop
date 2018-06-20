public class Cylinder extends Solid {

	private int radius;
	private int height;

	public Cylinder(){
		this.radius = 5;
		this.height = 10;
	}
	public Cylinder(int radius,int height){
		this.radius = radius;
		this.height = height;
	}
    public void setVolume(){
    	volume = (float)(3.14*radius*radius*height);
    }

    public void setCsarea(){
    	csarea = (float)(2*3.14*radius*radius);
    }

       public void setSarea(){
    	sarea = (float)(2*3.14*radius*(radius+height));
    }
}
