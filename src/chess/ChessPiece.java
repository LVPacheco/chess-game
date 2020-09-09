package chess;

import board.Board;
import board.Piece;
import board.Position;

public abstract class ChessPiece extends Piece {
	private Color color;
	private int moveCount;

	
	@Override
	public Boolean[][] possibleMoves(){
		return null;
	}

}
