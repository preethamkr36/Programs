class ParlimentTester
{
	public static void main(String arg[])
	{
		Parliment upper=new Parliment();
		upper.house="Rajya Sabha";
		upper.members=245;

		upper.display();

		Parliment lower=new Parliment();
		lower.house="Lok Sabha";
		lower.members=543;

		lower.display();
	}
}