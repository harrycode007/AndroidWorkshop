public class Sphere extends Solid{

	private int radius;

	public Sphere(){
		this.radius = 5;
	}
	public Sphere(int radius){
		this.radius = radius;
	}
    public void setVolume(){
    	volume = (float)(3.14*radius*radius*radius/3);
    }

    public void setCsarea(){
    	csarea = (float)(4*3.14*radius*radius);
    }
       public void setSarea(){
    	sarea = (float)(4*3.14*radius*radius);
    }
}
