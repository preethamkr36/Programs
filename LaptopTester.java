class LaptopTester
{
	public static void main(String arg[])
	{
		Dell dell=new Dell();
		dell.price=40000.00;
		dell.processor="INTEL";
		dell.storage="1TB";
		dell.modelNo="15q-63539s";

		System.out.println(dell.store());
		dell.display();

	}
}