class WeatherTester
{
	public static void main(String arg[])
	{
		Weather weather1=new Weather();
		weather1.name="Summer";
		weather1.duration=3;
		weather1.period="April to June";

		weather1.display();

		System.out.println();
		Weather weather2=new Weather();
		weather2.name="Winter";
		weather2.duration=2;
		weather2.period="December to January";

		weather2.display();

		System.out.println();
		Weather weather3=new Weather();
		weather3.name="Monsoon";
		weather3.duration=3;
		weather3.period="July to Mid-September";

		weather3.display();

		System.out.println();
		Weather weather4=new Weather();
		weather4.name="Spring";
		weather4.duration=2;
		weather4.period="Feburary to March";

		weather4.display();
	}
}