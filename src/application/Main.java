package application;

import java.util.Scanner;

import board.BoardException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Main {

	public static void main(String[] args) throws BoardException{
		
		Scanner in = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(in);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(in);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
		
	}

}
