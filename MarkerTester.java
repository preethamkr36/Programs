class MarkerTester
{
	public static void main(String[] args) {
		Marker marker=Marker.getMarker();
		System.out.println(marker);
		Marker marker1=Marker.getMarker();
		System.out.println(marker1);

		Marker marker2=new Marker();
		System.out.println(marker2);
		Marker marker3=new Marker();
		System.out.println(marker3);
	}
}