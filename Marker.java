class Marker
{
	private static Marker marker=null;

	public static Marker getMarker()
	{
		return marker;
	}
	static{
		marker=new Marker();
	}
}