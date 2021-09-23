class BagsTester
{
	public static void main(String a[])
	{
		Bags bags =new Bags();
		bags.name="Fastrack";
		bags.price=2000;
		bags.color="Blue";
		System.out.println(bags.name+" "+bags.price+" "+bags.color);

		bags.packing();

		Bags bags1 =new Bags();
		bags1.name="WildCraft";
		bags1.price=1500;
		bags1.color="Green";
		System.out.println(bags1.name+" "+bags1.price+" "+bags1.color);

		bags.packing();

        Bags bags2 =new Bags();
		bags2.name="American Tourister";
		bags2.price=1800;
		bags2.color="Purple";
		System.out.println(bags2.name+" "+bags2.price+" "+bags2.color);

		bags.packing();


	}
}