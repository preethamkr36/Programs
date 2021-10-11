class ChessTester
{
	public static void main(String[] args) {
		Chess chess=Chess.getChess();
		System.out.println(chess);
		Chess chess1=Chess.getChess();
		System.out.println(chess1);

		Chess chess2=new Chess();
		System.out.println(chess2);
		Chess chess3=new Chess();
		System.out.println(chess3);
	}
}