class All
{
	public static void main(String a[])
	{
		int c=45;
		int d=15;
		add(c,d);
		sub(c,d);
		mult(c,d);
		div(c,d);
	}
	public static void add(int x,int y)
	{
		int total=x+y;
		System.out.println(x+"+"+y+"="+total);
	}
	public static void sub(int x,int y)
	{
		int sum=x-y;
		System.out.println(x+"-"+y+"="+sum);
	}
	public static void mult(int x,int y)
	{
		int product=x*y;
		System.out.println(x+"*"+y+"="+product);
	}
	public static void div(int x,int y)
	{
		double div=x/y;
		System.out.println(x+"/"+y+"="+div);
	}

}
