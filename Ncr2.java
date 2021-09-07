class Ncr2
{	
	public static void main(String a[])
	{
		int f,n=10,r=3;
		f=fact(n)/(fact(n-r)*fact(r));
		System.out.println(n+"c"+r+"="+f);
	}
	public static int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return(f);
	}
}