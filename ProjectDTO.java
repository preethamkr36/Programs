public class ProjectDTO
{
	public ProjectDTO()
	{

	}

	private String projectId;
	private String title;
	private int noOfMembers;

	public String getprojectId()
	{
		return projectId;
	}
	public void setProjectId(String projectId)
	{
		this.projectId=projectId;
	}

	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}

	public int getNoOfMembers()
	{
		return noOfMembers;
	}
	public void setNoOfMembers(int noOfMembers)
	{
		this.noOfMembers=noOfMembers;
	}
}