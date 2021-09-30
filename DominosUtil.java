class DominosUtil
{
	public static void main(String arg[])
	{
		DominosDTO dto=new DominosDTO();

		dto.setGstId(562345L);
		dto.setLocation("Rajajinagar");
		dto.setNoOfItems(14);

		System.out.println("GST ID                 :"+dto.getGstId());
		System.out.println("Location               :"+dto.getLocation());
		System.out.println("Numbers Of Food Items  :"+dto.getNoofItems());
	}
}