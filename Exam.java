class Exam
{
	public static String universityName="VTU";
	public static int fees=1200;
	public static void allow(String hallTicket[])
	{
		if(fees > 1000)
		{
			System.out.println("Fees is paid show me the hallTicket");
			if(hallTicket!=null)
			{
				getHallTicketDetails(hallTicket);
				System.out.println("Allowed to write Exam");
			}
			else
			{
				System.out.println("No Hallticket Found");
			}
		}
		else
		{
			System.out.println("Please pay the fees");
		}
	}
	public static void getHallTicketDetails(String hallTicket[])
	{
		for(int i=0;i<hallTicket.length;i++)
		{
			System.out.println(hallTicket[i]);
		}
	}
}