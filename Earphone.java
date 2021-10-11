class Earphone
{
	private static Earphone earphone=null;

	public static Earphone getEarphone()
	{
		return earphone;
	}
	static{
		earphone=new Earphone();
	}
}