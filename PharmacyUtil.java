class PharmacyUtil
{
	public static void main(String arg[])
	{
		PharmacyDTO dto=new PharmacyDTO();

		dto.setPharmacyId(567L);
		dto.setName("Lakshmi");
		dto.setLocation("Rajajinagar");

		System.out.println("Pharmacy ID     :"+dto.getPharmacyId());
		System.out.println("Pharmacy Name   :"+dto.getName());
		System.out.println("Location        :"+dto.getLocation());
	}
}