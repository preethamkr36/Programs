class GoldUtil
{
	public static void main(String arg[])
	{
		GoldDTO dto=new GoldDTO();

		dto.setGoldId(123456);
		dto.setType("White Gold");
		dto.setPrice(49000);

		System.out.println("Gold ID       :"+dto.getGoldId());
		System.out.println("Gold Type     :"+dto.getType());
		System.out.println("Price         :"+dto.getPrice());
	}
}