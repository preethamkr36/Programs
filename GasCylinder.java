class GasCylinder
{
	public String name;
	public String color;
	public int weight;
	public int price;

	public GasCylinder(String name,String color,int weight,int price)
	{
		this.name=name;
		this.color=color;
		this.weight=weight;
		this.price=price;
	}

	public void display()
	{
		System.out.printf("%-10s %-10s %-10d %-10d\n",name,color,weight,price);
	}

	public static void main(String arg[])
	{
		GasCylinder gas1=new GasCylinder("HP","red",28,860);
		GasCylinder gas2=new GasCylinder("Bharath","blue",27,900);

		System.out.printf("%-10s %-10s %-10s %-10s\n","Name","color","Weight","Price");

		gas1.display();
		gas2.display();
	}
}