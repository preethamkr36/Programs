import java.util.Scanner;
class Speaker
{
	static String name="boAt";
	static int minVolume=0;
	static int maxVolume=5;
	static boolean isConnected;
	static int currentVolume;
	static int a;

	 
	 public static boolean onOrOff()
	 {
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter 1 to ON Speaker OR 0 to OFF Speaker");
	 	int z=sc.nextInt();
	 	if(z==1)
	 	{
	 		isConnected=true;
	 		System.out.println("Your Speaker "+name+" is Turning ON");

	 		return isConnected;
	 	}
	 	else if(z==0)
	 	{
	 		isConnected=false;
	 		a=2;
	 		System.out.println("Turning OFF");
	 		return isConnected;
	 	} 
	 	else
	 	{
	 		System.out.println("Enter proper key");
	 		return isConnected;
	 	}

	 }
	 


	 public static void increaseVolume()
	 {
	 	if(isConnected)
	 	{
	 		if(currentVolume<maxVolume)
	 		{
	 			currentVolume=currentVolume+1;
	 			System.out.println("The current Volume is: "+currentVolume);
	 		}
	 		else
	 		{
	 			System.out.println("Reached maximun volume");
	 		}
	 	}
	 	else
	 	{
	 		System.out.println("Speaker is not connected");
	 	}
	 }
	 


	 public static void decreaseVolume()
	 {
	 	if(isConnected)
	 	{
	 		if(currentVolume>minVolume)
	 		{
	 			currentVolume=currentVolume-1;
	 			System.out.println("The current Volume is: "+currentVolume);
	 		}
	 		else
	 		{
	 			System.out.println("Reached minmun volume");
	 		}
	 	}
	 	else
	 	{
	 		System.out.println("Speaker is not connected");
	 	}
	 }

	 public static void opp()
	 {
	 	Scanner sc=new Scanner(System.in);
	 	while(a!=2)
		{
			
			System.out.println("\nEnter 1 for increase volume OR 0 for Decrease volume OR 2 to OFF Speaker");
			a=sc.nextInt();
			 if(a==1)
			 {
			 	Speaker.increaseVolume();
			 }
			 else if(a==0)
			 {
			 	Speaker.decreaseVolume();
			 }
			 else if(a==2)
			 {
			 	System.out.println("End");
			 	break;
			 }
			 else
			 {
			 	System.out.println("Enter proper key");
			 }
			 
			 
		}

		
	}

}