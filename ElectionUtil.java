import java.util.Scanner;

class ElectionUtil
{
	static String details[]=new String[3];
	static int age;
	
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your Address");
		String address=sc.next();
		System.out.println("Enter your Phone Number");
		String phNo=sc.next();
		details[0]=name;
		details[1]=address;
		details[2]=phNo;

		System.out.println("Enter your age");
		
		age=sc.nextInt();

		Election.electionCard(details,age);
	}
}