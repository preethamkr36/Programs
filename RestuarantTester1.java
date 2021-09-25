class RestuarantTester1
{
	public static void main(String arg[])
	{
		Restuarant1 rest=new Restuarant1(123,"1947","Shimoga","Ram","veg");
		
		
		rest.serveFood();

		rest.display();

		System.out.println();
		Restuarant1 rest1=new Restuarant1(344,"pi","Mysore","Dev","Non-veg");
		

		rest.serveFood();

		rest1.display();
	}
}