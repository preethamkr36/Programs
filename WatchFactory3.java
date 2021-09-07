class WatchFactory3{
	static String watchFactoriesName[]={"HMT","Fast Track","Rolex","Omega"};
	public static void main(String a[])
	{
	
		getWatchFactoryName();
	
	}
	public static void getWatchFactoryName()
	{
		for(int i=0;i<watchFactoriesName.length;i++)
		{
			System.out.println(watchFactoriesName[i]);
		}
	}
}