class GoogleTester
{
	public static void main(String arg[])
	{
		Google pro1=new Google();
		pro1.product="Google Map";
		pro1.rating=3.8;
		pro1.purpose="Location identification";
		
	    pro1.display();

		System.out.println();
		Google pro2=new Google();
		pro2.product="Google Pay";
		pro2.rating=4.2;
		pro2.purpose="Payments";
		
	    pro2.display();

	    System.out.println();
		Google pro3=new Google();
		pro3.product="Google mail";
		pro3.rating=4.3;
		pro3.purpose="Offical Communication";
		
	    pro3.display();
	}
}