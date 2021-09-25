class Planet 
{
	public String planetName;
	public int distance;
	public int size;

	public Planet(){
		System.out.println("Planet Object is created");
	}

	public void display()
	{
		System.out.printf("%-15s %28d %d \n",planetName,distance,size);
	}
}