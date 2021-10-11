class KerchiefTester
{
	public static void main(String[] args) {
		Kerchief kerchief=Kerchief.getKerchief();
		System.out.println(kerchief);
		Kerchief kerchief1=Kerchief.getKerchief();
		System.out.println(kerchief1);

		Kerchief kerchief2=new Kerchief();
		System.out.println(kerchief2);
		Kerchief kerchief3=new Kerchief();
		System.out.println(kerchief3);
	}
}