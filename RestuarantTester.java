class RestuarantTester
{
	public static void main(String arg[])
	{
		Restuarant rest=new Restuarant();
		rest.restuarantName="1947";
		rest.restuarantId=133156;
		rest.type="veg";
		rest.ownerName="Ram";
		rest.location="Shimoga";
		
		rest.serveFood();

		rest.display();

		System.out.println();
		Restuarant rest1=new Restuarant();
		rest1.restuarantName="Pi";
		rest1.restuarantId=133;
		rest1.type="non-veg";
		rest1.ownerName="Raj";
		rest1.location="Mysore";

		rest.serveFood();

		rest1.display();
	}
}