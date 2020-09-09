package chess;

import board.Board;
import board.Piece;
import board.Position;

public abstract class ChessPiece extends Piece {
	private Color color;
	private int moveCount;


	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	public ChessPiece() {
		
	}

	public Color getColor() {
		return color;
	}


	@Override
	public Boolean[][] possibleMoves(){
		return null;
	}
	
	@Override
	public String toString() {
		return getPosition().toString();
	}

}
