class Restuarant 
{
	public int restuarantId;
	public String restuarantName;
	public String location;
	public String ownerName;
	public String type;

	public Restuarant(){
		System.out.println("Restuarant Object is created");
	}

	public void serveFood()
	{
		System.out.println("Serving food with delicious items");
	}

	public void display()
	{
		System.out.println(ownerName+" is owner of "+restuarantName+" restuarant in "+location+" of "+type+" with "+restuarantId+" Id");
	}
}