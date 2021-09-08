class Election
{
	public static int age=19;
	public static void electionCard(String details[])
	{
		if(age > 18)
		{
			System.out.println("You are eligible");
			if(details!=null)
			{
				getDetails(details);
				System.out.println("Voter card is issued");
			}
			else
			{
				System.out.println("Please provide valid details");
			}
		}
		else
		{
			System.out.println("Not eligible");
		}
	}
	public static void getDetails(String details[])
	{
		for(int i=0;i<details.length;i++)
		{
			System.out.println(details[i]);
		}
	}
}