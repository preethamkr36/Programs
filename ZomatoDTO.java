public class ZomatoDTO
{
	public ZomatoDTO()
	{

	}

	private long orderId;
	private String name;
	private String location;
	private long number;

	public long getOrderId()
	{
		return orderId;
	}
	public void setOrderId(long orderId)
	{
		this.orderId=orderId;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}

	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}

	public long getNumber()
	{
		return number;
	}
	public void setNumber(long number)
	{
		this.number=number;
	}
}