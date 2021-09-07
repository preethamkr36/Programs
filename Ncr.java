class Ncr
{
	
	public static void main(String a[])
	{
		int n=4;
		int r=2;
		int z;
		z=ncr(n,r);
		System.out.println(n+"c"+r+"="+z);
	}
	public static int ncr(int n,int r)
	{
		int b,bFact,nf,rf,f;
		b=n-r;
		nf=fact(n);
		rf=fact(r);
		bFact=fact(b);
		f=nf/(bFact*rf);
		return(f);
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