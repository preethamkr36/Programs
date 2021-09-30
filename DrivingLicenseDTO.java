public class DrivingLicenseDTO
{
	public DrivingLicenseDTO()
	{

	}

	private long licenseId;
	private String name;
	private String type;

	public long getLicenseId()
	{
		return licenseId;
	}
	public void setLicenseId(long licenseId)
	{
		this.licenseId=licenseId;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}

	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
}