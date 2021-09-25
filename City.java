class City
{
	public String cityName;
	public String stateName;
	public int population;


	public City(String name,String state,int pop)
	{
		cityName=name;
		stateName=state;
		population=pop;
	}

	public void display()
	{
		
		System.out.printf("%-15s %-15s %10d \n",cityName,stateName,population);
	}
}