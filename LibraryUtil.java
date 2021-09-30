class LibraryUtil
{
	public static void main(String arg[])
	{
		LibraryDTO dto=new LibraryDTO();

		dto.setLibraryId(567L);
		dto.setName("Ravi");
		dto.setLocation("Shimoga");

		System.out.println("Library ID     :"+dto.getLibraryId());
		System.out.println("Library Name   :"+dto.getName());
		System.out.println("Location       :"+dto.getLocation());
	}
}