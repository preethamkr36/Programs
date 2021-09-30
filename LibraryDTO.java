public class LibraryDTO
{
	public LibraryDTO()
	{

	}

	private long libraryId;
	private String name;
	private String location;

	public long getLibraryId()
	{
		return libraryId;
	}
	public void setLibraryId(long libraryId)
	{
		this.libraryId=libraryId;
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