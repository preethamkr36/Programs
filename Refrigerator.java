class Refrigerator
{
	private static Refrigerator refrigerator=null;

	public static Refrigerator getRefrigerator()
	{
		return refrigerator;
	}
	static{
		refrigerator=new Refrigerator();
	}
}