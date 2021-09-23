class IceCreamTester
{
	public static void main(String a[])
	{
		IceCream iceCream =new IceCream();
		iceCream.name="Chocolate";
		iceCream.price=50;
		iceCream.brand="Arun IceCreams";
		System.out.println(iceCream.name+" "+iceCream.price+" "+iceCream.brand);

		iceCream.melt();

		IceCream iceCream1 =new IceCream();
		iceCream1.name="Butter Milk";
		iceCream1.price=60;
		iceCream1.brand="Amul IceCreams";
		System.out.println(iceCream1.name+" "+iceCream1.price+" "+iceCream1.brand);

		iceCream.melt();
		
        IceCream iceCream2 =new IceCream();
		iceCream2.name="Cornetto and Magnum";
		iceCream2.price=200;
		iceCream2.brand="Kwality Walls";
		System.out.println(iceCream2.name+" "+iceCream2.price+" "+iceCream2.brand);

		iceCream.melt();
	}
}