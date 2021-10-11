class AllOut
{
	private static AllOut allOut=null;

	public static AllOut getAllOut()
	{
		return allOut;
	}
	static{
		allOut=new AllOut();
	}
}