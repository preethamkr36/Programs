class Kerchief
{
	private static Kerchief kerchief=null;

	public static Kerchief getKerchief()
	{
		return kerchief;
	}
	static{
		kerchief=new Kerchief();
	}
}