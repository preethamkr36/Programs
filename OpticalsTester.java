class OpticalsTester
{
	public static void main(String a[])
	{
		Opticals opticals =new Opticals();
		opticals.name="Lenskart";
		opticals.price=3100;
		System.out.println(opticals.name+" "+opticals.price);

		opticals.looks();

		Opticals opticals1 =new Opticals();
		opticals1.name="Specsmakers";
		opticals1.price=1500;
		System.out.println(opticals1.name+" "+opticals1.price);

		opticals.looks();

        Opticals opticals2 =new Opticals();
		opticals2.name="Himalaya";
		opticals2.price=2500;
		System.out.println(opticals2.name+" "+opticals2.price);

		opticals.looks();


	}
}