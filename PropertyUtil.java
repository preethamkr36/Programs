class PropertyUtil
{
	public static void main(String arg[])
	{
		PropertyDTO dto=new PropertyDTO();

		dto.setPropertyId(87634568981L);
		dto.setHolder("rajeev");
		dto.setLocation("Shimoga");

		System.out.println("Properrty ID     :"+dto.getPropertyId());
		System.out.println("Property Holder  :"+dto.getHolder());
		System.out.println("Location         :"+dto.getLocation());
	}
}