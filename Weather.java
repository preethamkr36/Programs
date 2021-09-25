class Weather 
{
	public String name;
	public int duration;
	public String period;

	public Weather(){
		System.out.println("Weather Object is created");
	}

	public void display()
	{
		System.out.println(name+" "+duration+" "+period);
	}
}