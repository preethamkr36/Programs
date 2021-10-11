class Tie
{
	private static Tie tie=null;

	public static Tie getTie()
	{
		return tie;
	}
	static{
		tie=new Tie();
	}
}