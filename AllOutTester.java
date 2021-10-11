class AllOutTester
{
	public static void main(String arg[])
	{
		AllOut allOut=AllOut.getAllOut();
		System.out.println(allOut);
		AllOut allOut1=AllOut.getAllOut();
		System.out.println(allOut1);

		AllOut allOut2=new AllOut();
		System.out.println(allOut2);
		AllOut allOut3=new AllOut();
		System.out.println(allOut3);
	}
}