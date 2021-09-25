class Restuarant1
{
	public int restuarantId;
	public String restuarantName;
	public String location;
	public String ownerName;
	public String type;

	public Restuarant1(int id,String name,String loc,String owner,String tp){
		System.out.println("Restuarant Object is created");
		restuarantId=id;
		restuarantName=name;
		location=loc;
		ownerName=owner;
		type=tp;
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