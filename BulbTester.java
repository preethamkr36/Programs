class BulbTester
{
	public static void main(String[] args) {
		Bulb bulb=Bulb.getBulb();
		System.out.println(bulb);
		Bulb bulb1=Bulb.getBulb();
		System.out.println(bulb1);

		Bulb bulb2=new Bulb();
		System.out.println(bulb2);
		Bulb bulb3=new Bulb();
		System.out.println(bulb3);
	}
}