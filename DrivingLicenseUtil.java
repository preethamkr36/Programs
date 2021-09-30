class DrivingLicenseUtil
{
	public static void main(String arg[])
	{
		DrivingLicenseDTO dto=new DrivingLicenseDTO();

		dto.setLicenseId(56734L);
		dto.setName("Ravi");
		dto.setType("LMVG");

		System.out.println("Driving Licens ID  :"+dto.getLicenseId());
		System.out.println("Name               :"+dto.getName());
		System.out.println("Type Of Vehicle    :"+dto.getType());
	}
}