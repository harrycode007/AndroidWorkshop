public abstract class Solid{
	protected float volume;
	protected float csarea;
	protected float sarea;

	abstract void setVolume();
	abstract void setCsarea();
	abstract void setSarea();

	public void getVolume()
	{
		System.out.println("The volume is "+volume);
	}

	public void getCsarea()
	{
		System.out.println("The curved surface area is "+csarea);
	}

	public void getSarea()
	{
		System.out.println("The surface area is "+sarea);
	}
}