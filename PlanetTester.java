class PlanetTester
{
	public static void main(String arg[])
	{
		Planet planet1=new Planet();
		planet1.planetName="Earth";
		planet1.distance=150;
		planet1.size=12742;
		System.out.printf("%-15s %25s %-15s \n","Planet Name","Distance from sun in million kms","Size");
		planet1.display();

		System.out.println();

		Planet planet2=new Planet();
		planet2.planetName="Venus";
		planet2.distance=108;
		planet2.size=12104;
		
		planet2.display();
	}
}