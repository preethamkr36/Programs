class Planets
{
	public String planetName;
	public int distance;
	public int size;

	

	public Planets(String name,int dist,int siz)
	{
		planetName=name;
		distance=dist;
		size=siz;
	}

	public void display()
	{
		
		System.out.printf("%-15s %28d %d \n",planetName,distance,size);
	}
}