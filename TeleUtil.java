import java.util.Scanner;

class TeleUtil
{
	static String details[]=new String[3];
	static int age,amount;

	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your Address");
		String address=sc.next();
		System.out.println("Enter your Aadhar Number");
		String aadharNo=sc.next();
		details[0]=name;
		details[1]=address;
		details[2]=aadharNo;

		System.out.println("Enter your age");
		age=sc.nextInt();
		System.out.println("Enter amount paid");
		amount=sc.nextInt();

		Tele.simCard(details,age,amount);
	}
}