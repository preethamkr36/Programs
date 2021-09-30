class LicUtil
{
	public static void main(String arg[])
	{
		LicDTO dto=new LicDTO();

		dto.setLicId(56734L);
		dto.setHolder("Rai");
		dto.setNominee("Ravi");

		System.out.println("Lic ID          :"+dto.getLicId());
		System.out.println("Policy Holder   :"+dto.getHolder());
		System.out.println("Nominee         :"+dto.getNominee());
	}
}