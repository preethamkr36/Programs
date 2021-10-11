class EarphoneTester
{
	public static void main(String arg[])
	{
		Earphone earphone=Earphone.getEarphone();
		System.out.println(earphone);
		Earphone earphone1=Earphone.getEarphone();
		System.out.println(earphone1);

		Earphone earphone3=new Earphone();
		System.out.println(earphone3);
	}
}