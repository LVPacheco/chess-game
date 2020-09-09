package application;

import board.BoardException;
import chess.ChessMatch;

public class Main {

	public static void main(String[] args) throws BoardException{
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
