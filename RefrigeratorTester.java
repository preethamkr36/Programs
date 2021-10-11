class RefrigeratorTester
{
	public static void main(String arg[])
	{
		Refrigerator refrigerator=Refrigerator.getRefrigerator();
		System.out.println(refrigerator);
		Refrigerator refrigerator2=Refrigerator.getRefrigerator();
		System.out.println(refrigerator2);

		Refrigerator refrigerator1=new Refrigerator();
		System.out.println(refrigerator1);
		Refrigerator refrigerator3=new Refrigerator();
		System.out.println(refrigerator3);
	}
	
}