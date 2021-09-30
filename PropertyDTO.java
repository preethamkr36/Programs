public class PropertyDTO
{
	public PropertyDTO()
	{

	}

	private long propertyId;
	private String holder;
	private String location;

	public long getPropertyId()
	{
		return propertyId;
	}
	public void setPropertyId(long propertyId)
	{
		this.propertyId=propertyId;
	}

	public String getHolder()
	{
		return holder;
	}
	public void setHolder(String holder)
	{
		this.holder=holder;
	}

	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
}