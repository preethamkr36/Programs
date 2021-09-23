class LaptopTester
{
	public static void main(String a[])
	{
		Laptop laptop =new Laptop();
		laptop.laptopId=4207253;
		laptop.name="DELL";
		laptop.price=6900;
		laptop.color="Silver";
		laptop.core="Core i5";
		System.out.println(laptop.laptopId+" "+laptop.name+" "+laptop.price+" "+laptop.color+" "+laptop.core);

		laptop.coding();

        Laptop laptop1 =new Laptop();
		laptop1.laptopId=3475968;
		laptop1.name="HP OMEN";
		laptop1.price=85000;
		laptop1.color="Black";
		laptop1.core="Core i5";
		System.out.println(laptop1.laptopId+" "+laptop1.name+" "+laptop1.price+" "+laptop1.color+" "+laptop1.core);

		laptop.coding();
		
        Laptop laptop2 =new Laptop();
		laptop2.laptopId=4207253;
		laptop2.name="ASUS Zen book";
		laptop2.price=150000;
		laptop2.color="Black";
		laptop2.core="Core i7";
		System.out.println(laptop2.laptopId+" "+laptop2.name+" "+laptop2.price+" "+laptop2.color+" "+laptop2.core);

		laptop.coding();
	}
}