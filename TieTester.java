class TieTester
{
	public static void main(String[] args) {
		Tie tie=Tie.getTie();
		System.out.println(tie);
		Tie tie1=Tie.getTie();
		System.out.println(tie1);

		Tie tie2=new Tie();
		System.out.println(tie2);
		Tie tie3=new Tie();
		System.out.println(tie3);
	}
}