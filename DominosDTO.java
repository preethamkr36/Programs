public class DominosDTO
{
	public DominosDTO()
	{

	}

	private long gstId;
	private String location;
	private int noOfItems;

	public long getGstId()
	{
		return gstId;
	}
	public void setGstId(long gstId)
	{
		this.gstId=gstId;
	}

	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	
	public int getNoofItems()
	{
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems)
	{
		this.noOfItems=noOfItems;
	}
}