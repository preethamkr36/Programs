public class LicDTO
{
	public LicDTO()
	{

	}

	private long licId;
	private String holder;
	private String nominee;

	public long getLicId()
	{
		return licId;
	}
	public void setLicId(long licId)
	{
		this.licId=licId;
	}

	public String getHolder()
	{
		return holder;
	}
	public void setHolder(String holder)
	{
		this.holder=holder;
	}

	public String getNominee()
	{
		return nominee;
	}
	public void setNominee(String nominee)
	{
		this.nominee=nominee;
	}
}