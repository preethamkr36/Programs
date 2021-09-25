class Sofa
{
	public String name;
	public String color;
	public int size;
	public int price;

	public Sofa(String name,String color,int size,int prize)
	{
		this.name=name;
		this.color=color;
		this.size=size;
		this.price=price;
	}

	public void display()
	{
		System.out.printf("%-10s %-10s %-10d %-10d\n",name,color,size,price);
	}

	public static void main(String arg[])
	{
		Sofa sofa1=new Sofa("xyz","black",3,25000);

		Sofa sofa2=new Sofa("abc","orange",5,35000);

		System.out.printf("%-10s %-10s %-10s %-10s\n","Sofa name","color","Size","Price");

		sofa1.display();
		sofa2.display();
	}
}