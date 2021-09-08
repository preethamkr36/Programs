class Bank1
{
	public static String BnakName="CANARA Bank";
	public static int applicationFees=500;
	public static void acc(String details[])
	{
		if(applicationFees > 499)
		{
			System.out.println("Application fee is paid please provide your deatils");
			if(details!=null)
			{
				getDetails(details);
				System.out.println("Your account has been created");
				System.out.println("Your account number is 100023887367352");
			}
			else
			{
				System.out.println("Please provide valid details");
			}
		}
		else
		{
			System.out.println("Please pay the application fees");
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