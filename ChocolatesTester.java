class ChocolatesTester
{
	public static void main(String a[])
	{
		Chocolates chocolates =new Chocolates();
		chocolates.name="Perk";
		chocolates.price=20;
		chocolates.brand="Cadbury";
		System.out.println(chocolates.name+" "+chocolates.price+" "+chocolates.brand);

		chocolates.taste();

		Chocolates chocolates1 =new Chocolates();
		chocolates1.name="Kitkat";
		chocolates1.price=100;
		chocolates1.brand="Nestle";
		System.out.println(chocolates1.name+" "+chocolates1.price+" "+chocolates1.brand);

		chocolates.taste();

		
        Chocolates chocolates2 =new Chocolates();
		chocolates2.name="Amul Chacozoo";
		chocolates2.price=120;
		chocolates2.brand="Amul";
		System.out.println(chocolates2.name+" "+chocolates2.price+" "+chocolates2.brand);

		chocolates.taste();

	}
}