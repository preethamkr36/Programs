class Board
{
	private static Board board=null;

	public static Board getBoard()
	{
		return board;
	}
	static{
		board=new Board();
	}
}