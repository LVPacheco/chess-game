package board;

public abstract class Piece{
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}
	public Piece() {
		
	}


	public Position getPosition() {
		return position;
	}


	protected Board getBoard() {
		return board;
	}


	public abstract Boolean[][] possibleMoves();
	
}
