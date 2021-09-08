import java.util.Scanner;

class ExamUtil
{
	static String hallTicket[]=new String[3];
	static String fees;
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter candidate name");
		String candidateName=sc.next();
		System.out.println("Enter candidate USN");
		String usn=sc.next();
		System.out.println("Enter subject");
		String subject=sc.next();
		hallTicket[0]=candidateName;
		hallTicket[1]=usn;
		hallTicket[2]=subject;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter fee paid");
		fees=sc1.next();
	    System.out.println("  ");

		Exam.allow(hallTicket,Integer.parseInt(fees));
	}
}