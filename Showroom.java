class Showroom
{
	public String name;
	public String location;
	public String product;
	public double rating;

	public Showroom(String name,String location,String product,double rating)
	{
		this.name=name;
		this.location=location;
		this.product=product;
		this.rating=rating;
	}

	public void display()
	{
		System.out.println(name+" "+location+" "+product+" "+rating);
	}

	public static void main(String arg[])
	{
		Showroom showroom1=new Showroom("Trident Hyundai Showroom","Rajajinagar","Car",4.0);
		Showroom showroom2=new Showroom("MG Motor India","Chord Rd Rajajinagar","Car",4.1);

		showroom1.display();
		showroom2.display();
	}
}