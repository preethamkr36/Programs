class SportsTester
{
	public static void main(String a[])
	{
		Sports sports =new Sports();
		sports.name="Volley ball";
		sports.playersCount=9;
		sports.type="Outdoor";
		System.out.println(sports.name+" "+sports.playersCount+" "+sports.type);

		sports.play();

		Sports sports1 =new Sports();
		sports1.name="Chess";
		sports1.playersCount=2;
		sports1.type="Indoor";
		System.out.println(sports1.name+" "+sports1.playersCount+" "+sports1.type);

		sports.play();

        Sports sports2 =new Sports();
		sports2.name="Relay";
		sports2.playersCount=4;
		sports2.type="Outdoor";
		System.out.println(sports2.name+" "+sports2.playersCount+" "+sports2.type);

		sports.play();
	}
}