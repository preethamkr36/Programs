class CityTester
{

	public static void main(String arg[])
	{
		City city1=new City("Shimoga","Karnataka",323000);

		City city2=new City("Agra","Uttar Pradesh",2261561);

		City city3=new City("Chikkamaglore","karnataka",333000);

		System.out.printf("%-15s %-15s %-15s \n","City Name","State","Population");

		city1.display();

		city2.display();

		city3.display();
	}
}