package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import board.BoardException;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Main {

	public static void main(String[] args) throws BoardException{
		
		Scanner in = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			try {
			UI.clearScreen();
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(in);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(in);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch(ChessException e) {
				System.out.println("There was an error: "+e.getMessage());
				System.out.println("Press enter to continue...");
				in.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println("There was an error: "+e.getMessage());
				System.out.println("Press enter to continue...");
				in.nextLine();
			}
			catch(BoardException e) {
				System.out.println("There was an error: "+e.getMessage());
				System.out.println("Press enter to continue...");
				in.nextLine();
			}
			
		}
		
	}

}
