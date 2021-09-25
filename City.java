class City 
{
	public String cityName;
	public String stateName;
	public int population;

	public City(){
		System.out.println("City Object is created");
	}

	public void welcome()
	{
		System.out.println("Welcome");
	}

	public void display()
	{
		System.out.println(cityName+" "+stateName+" "+population);
	}
}