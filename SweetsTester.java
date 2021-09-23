class SweetsTester
{
	public static void main(String a[])
	{
		Sweets sweets =new Sweets();
		sweets.name="Gulab Jamun";
		sweets.price=150;
		sweets.color="Brown";
		sweets.shape="Sphere";
		System.out.println(sweets.name+" "+sweets.price+" "+sweets.color+" "+sweets.shape);

		sweets.dish();

		Sweets sweets1 =new Sweets();
		sweets1.name="Rasmalai";
		sweets1.price=300;
		sweets1.color="Yellow";
		sweets1.shape="Ovel";
		System.out.println(sweets1.name+" "+sweets1.price+" "+sweets1.color+" "+sweets1.shape);

		sweets.dish();
		
        Sweets sweets2 =new Sweets();
		sweets2.name="Mysore Pak";
		sweets2.price=500;
		sweets2.color="Mustard yellow";
		sweets2.shape="Rectangle";
		System.out.println(sweets2.name+" "+sweets2.price+" "+sweets2.color+" "+sweets2.shape);

		sweets.dish();
	}
}