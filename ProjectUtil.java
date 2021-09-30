class ProjectUtil
{
	public static void main(String arg[])
	{
		ProjectDTO dto=new ProjectDTO();

		dto.setProjectId("44S_BE_1755");
		dto.setTitle("Hospital Bed For Tropic Ulcer Patient Using Electric Actutar");
		dto.setNoOfMembers(4);

		System.out.println("Project ID         :"+dto.getprojectId());
		System.out.println("Title              :"+dto.getTitle());
		System.out.println("Numbers Of Members :"+dto.getNoOfMembers());
	}
}