import java.util.Scanner;
class ExamUtil
{
	static String hallTicket[]=new String[3];
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter candidate name");
		String name=sc.next();
		System.out.println("Enter the usn");
		String usn=sc.next();
		System.out.println("Enter subjet name");
		String subject=sc.next();
		hallTicket[0]=name;
		hallTicket[1]=usn;
		hallTicket[2]=subject;
		Exam.allow(hallTicket);
		Exam.allow(1100);
		
	}
}