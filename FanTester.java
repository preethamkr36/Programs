class FanTester
{
	public static void main(String[] args) 
	{
		Fan fan=Fan.getFan();
		System.out.println(fan);
		Fan fan2=Fan.getFan();
		System.out.println(fan2);

		Fan fan1=new Fan();
		System.out.println(fan1);
		Fan fan3=new Fan();
		System.out.println(fan3);
	}
}