class Chess
{
	private static Chess chess=null;

	public static Chess getChess()
	{
		return chess;
	}
	static{
		chess=new Chess();
	}
}