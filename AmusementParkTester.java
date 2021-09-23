class AmusementParkTester
{
	public static void main(String a[])
	{
		AmusementPark amusementPark =new AmusementPark();
		amusementPark.name="Wonderla";
		amusementPark.ticketPrice=900;
		amusementPark.location="Banglore";
		System.out.println(amusementPark.name+" "+amusementPark.ticketPrice+" "+amusementPark.location);

		amusementPark.entertainment();

		AmusementPark amusementPark1 =new AmusementPark();
		amusementPark1.name="Essel World";
		amusementPark1.ticketPrice=1300;
		amusementPark1.location="Mumbai";
		System.out.println(amusementPark1.name+" "+amusementPark1.ticketPrice+" "+amusementPark1.location);

		amusementPark.entertainment();


       AmusementPark amusementPark2 =new AmusementPark();
		amusementPark2.name="Nicco Park";
		amusementPark2.ticketPrice=650;
		amusementPark2.location="Kolkata";
		System.out.println(amusementPark2.name+" "+amusementPark2.ticketPrice+" "+amusementPark2.location);

		amusementPark.entertainment();

	}
}