class ShoeTester
{
	public static void main(String a[])
	{
		Shoe shoe =new Shoe();
		shoe.name="Nike";
		shoe.price=1100;
		shoe.color="black";
		shoe.size=8;
		System.out.println(shoe.name+" "+shoe.price+" "+shoe.color+" "+shoe.size);

		shoe.jogging();

		Shoe shoe1 =new Shoe();
		shoe1.name="Adidas";
		shoe1.price=3000;
		shoe1.color="White";
		shoe1.size=6;
		System.out.println(shoe1.name+" "+shoe1.price+" "+shoe1.color+" "+shoe1.size);

		shoe.jogging();

        Shoe shoe2 =new Shoe();
		shoe2.name="Bata";
		shoe2.price=900;
		shoe2.color="Light pink";
		shoe2.size=7;
		System.out.println(shoe2.name+" "+shoe2.price+" "+shoe2.color+" "+shoe2.size);

		shoe.jogging();


	}
}