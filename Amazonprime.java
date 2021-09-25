class AmazonPrime
{
	static String movies[]={"Shershah","RakthaCharitra","Robert","KGF","Yuvaratna","Master","LigthsOut","Jaathi Rathnalu"};
	static String series[]={"Vampire Diaries","Originals","The last ship","Mirzapur","The Family Man","Four more shot"};
	static String movie="Airlift";
	public static void main(String a[])
	{
		getMovies(movies);
		System.out.println("\n"+getMovies(movie));
		getSeries(series);
	}
	public static void getMovies(String movies[])
	{
		System.out.println("Movies are :");
		for(int i=0;i<movies.length;i++)
		{
			System.out.println(movies[i]);
		}
	}
	public static String getMovies(String movie)
	{
		return movie;
	}
	public static void getSeries(String series[])
	{
		System.out.println("\nSeries are :");
		for(int i=0;i<series.length;i++)
		{
			System.out.println(series[i]);
		}
	}

}