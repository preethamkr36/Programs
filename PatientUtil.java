class PatientUtil
{
	public static void main(String arg[])
	{
		PatientDTO dto=new PatientDTO();

		dto.setPatientId(1234567912L);
		dto.setPatientName("Raghu");
		dto.setAge(22);
		dto.setGender("Male");
		dto.setAddress("Shimoga");
		dto.setBloodGroup("O+");

		System.out.println("Patient ID          :"+dto.getPatientId());
		System.out.println("Patient Name        :"+dto.getPatientName());
		System.out.println("Patient Age         :"+dto.getAge());
		System.out.println("Patient Gender      :"+dto.getGender());
		System.out.println("Patient Address     :"+dto.getAddress());
		System.out.println("Patient Blood Group :"+dto.getBloodGroup());
	}
}