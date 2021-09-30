public class PharmacyDTO
{
	public PharmacyDTO()
	{

	}

	private long pharmacyId;
	private String name;
	private String location;

	public long getPharmacyId()
	{
		return pharmacyId;
	}
	public void setPharmacyId(long pharmacyId)
	{
		this.pharmacyId=pharmacyId;
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
}