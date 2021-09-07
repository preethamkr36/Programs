class Factroial
{
	public static void main(String a[])
	{
		int b=10;
		factroial(b); 
	}
	public static void factroial(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(n+"!"+"="+f);
		System.out.println("Factroial of "+n+" is "+f);
	}
}