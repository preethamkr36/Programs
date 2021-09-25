class Exam
{
	public static String universityName="VTU";
	public static int fees=1295;
	public static void allow(String hallTicket[])
	{
		if(hallTicket!=null)
		{
			getHallTicketDetails(hallTicket);
		}
		else 
		{
			System.out.println("hallTicket not found");
		}
	}
	public static void allow(int fees)
	{
		if(fees>1000)
		{
			System.out.println("Fees paid");
		}
		else
		{
			System.out.println("Please pay the fee");
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