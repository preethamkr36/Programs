public class GoldDTO
{
	public GoldDTO()
	{

	}

	private int goldId;
	private String type;
	private int price;

	public int getGoldId()
	{
		return goldId;
	}
	public void setGoldId(int goldId)
	{
		this.goldId=goldId;
	}

	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}

	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
}