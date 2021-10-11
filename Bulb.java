class Bulb
{
	private static Bulb bulb=null;

	public static Bulb getBulb()
	{
		return bulb;
	}
	static{
		bulb =new Bulb();
	}
}