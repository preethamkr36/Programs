class Stadium
{
	public String name;
	public int capacity;
	public String type;
	public String location;

	public Stadium(String name,int capacity,String type,String location)
	{
		this.name=name;
		this.capacity=capacity;
		this.type=type;
	}

	public void display()
	{
		System.out.println(name+" "+capacity+" "+type);
	}

	public static void main(String arg[])
	{
		Stadium stadium1=new Stadium("Narendra Modi International Stadium",125000,"Outdoor","Gujurat");
		Stadium stadium2=new Stadium("Lords cricket Stadium",30000 ,"Outdoor","England");

		stadium1.display();
		stadium2.display();
	}
}