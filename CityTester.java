class CityTester
{
	public static void main(String arg[])
	{
		City city1=new City();
		city1.cityName="Shimoga";
		city1.stateName="Karnataka";
		city1.population=323000;
		
		city1.welcome();

		city1.display();

		City city2=new City();
		city2.cityName="Chikkamaglore";
		city2.stateName="Karnataka";
		city2.population=333000;
		
		city2.display();

		City city3=new City();
		city3.cityName="Agra";
		city3.stateName="Uttar Pradesh";
		city3.population=2261561;
		
		city3.display();
	}
}