class Tele
{
	public static int age=19;
	public static int amount=50;
	public static void simCard(String details[])
	{
		if(age > 18)
		{
			System.out.println("Your are above now pay for SIM card");
			if(amount>=50)
			{
				System.out.println("Provide address and other details");
				if(details!=null)
			    {
				     getDetails(details);
				     System.out.println("SIM card is issued");
			    }
			    else
			    {
				     System.out.println("Please provide valid details");
			    }
			}
			else
			{
				System.out.println("Give 50 rs for SIM card");
			}
		}
		else
		{
			System.out.println("Your are not above 18");
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