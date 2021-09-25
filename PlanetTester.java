class PlanetTester
{

	public static void main(String arg[])
	{
		Planets planet1=new Planets("Earth",150,12742);

		Planets planet2=new Planets("Venus",108,12104);

		System.out.printf("%-15s %25s %-15s \n","Planet Name","Distance from sun in million kms","Size");

		planet1.display();

		planet2.display();
	}
}