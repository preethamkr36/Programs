class ZomatoUtil
{
	public static void main(String arg[])
	{
		ZomatoDTO dto=new ZomatoDTO();

		dto.setOrderId(56L);
		dto.setName("Abhi");
		dto.setLocation("Rajajinagar");
		dto.setNumber(9876543210L);

		System.out.println("Order ID       :"+dto.getOrderId());
		System.out.println("Costmer Name   :"+dto.getName());
		System.out.println("Location       :"+dto.getLocation());
		System.out.println("Mobile number  :"+dto.getNumber());
	}
}