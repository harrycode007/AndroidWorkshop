public class SolidDriver{

	public static void main(String args[]){
		Sphere s = new Sphere();
		Cylinder cy = new Cylinder();
		Cube c = new Cube();
		Cuboid cu = new  Cuboid();

		s.setVolume();
		s.setCsarea();
		s.setSarea();

		cy.setVolume();
		cy.setCsarea();
		cy.setSarea();

		c.setVolume();
		c.setCsarea();
		c.setSarea();

		cu.setVolume();
		cu.setCsarea();
		cu.setSarea();

		s.getVolume();
		s.getCsarea();
		s.getSarea();

		cy.getVolume();
		cy.getCsarea();
		cy.getSarea();

		c.getVolume();
		c.getCsarea();
		c.getSarea();

		cu.getVolume();
		cu.getCsarea();
		cu.getSarea();
	}
}