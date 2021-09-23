class ICCTeamsTester
{
	public static void main(String a[])
	{
		ICCTeams iccTeams =new ICCTeams();
		iccTeams.teams="England";
		iccTeams.admitted=1909;
		iccTeams.region="Europe";
		System.out.println(iccTeams.teams+" "+iccTeams.admitted+" "+iccTeams.region);

		iccTeams.cricket();

		ICCTeams iccTeams1 =new ICCTeams();
		iccTeams1.teams="India";
		iccTeams1.admitted=1926;
		iccTeams1.region="Asia";
		System.out.println(iccTeams1.teams+" "+iccTeams1.admitted+" "+iccTeams1.region);

		iccTeams.cricket();
		
        ICCTeams iccTeams2 =new ICCTeams();
		iccTeams2.teams="South Africa";
		iccTeams2.admitted=1909;
		iccTeams2.region="East Asia-Pacific";
		System.out.println(iccTeams2.teams+" "+iccTeams2.admitted+" "+iccTeams2.region);

		iccTeams.cricket();
	}
}