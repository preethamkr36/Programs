class Ipl3{
	static String teams[ ]={"RCB","DC","CSK","KKR","MI","SRH","PBKS","RR"};
	public static void main(String a[]){
		getIplTeamsName();
	}
	public static void getIplTeamsName()
	{
		for(int i=0;i<teams.length;i++)
		{
			System.out.println(teams[i]);
		}
	}
}