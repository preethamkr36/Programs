class BoardTester
{
	public static void main(String[] args) {
		Board board=Board.getBoard();
		System.out.println(board);
		Board board1=Board.getBoard();
		System.out.println(board1);

		Board board2=new Board();
		System.out.println(board2);
		Board board3=new Board();
		System.out.println(board3);
	}
}