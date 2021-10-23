package jrJava.lineOfAction4_AI_using_gameTree_afterClass23;

import java.util.ArrayList;

public class AIPlayer {

	private GameBoard gameBoard;
	private Move bestMove;

	public AIPlayer(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
	}

	public void makeMove() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		gameBoard.setTurn(Coordinator.COMPUTER_TURN);

		chooseBestMove(Coordinator.COMPUTER_TURN);

		if (bestMove != null) {
			gameBoard.makeMove(bestMove);
		}

		boolean result = gameBoard.isGameOver();
		if (result) {
			Coordinator.winner = gameBoard.getTurn();
		}

		gameBoard.setTurn(-gameBoard.getTurn());
	}

	private void chooseBestMove(int currentTurn) {
		ArrayList<Move> allLegalMoves = allLegalMoves();
		int rand = (int) (Math.random() * allLegalMoves.size());
		bestMove = allLegalMoves.get(rand);
	}

	public ArrayList<Move> allLegalMoves() {
		ArrayList<Move> legalMoves = new ArrayList<Move>();

		ArrayList<Integer> myPieces = gameBoard.allMyPieces();
		int selectedPiece;
		ArrayList<Integer> allValidMoves;
		int i, j;

		for (i = 0; i < myPieces.size(); i++) {
			selectedPiece = myPieces.get(i);
			gameBoard.selectPiece(selectedPiece);
			allValidMoves = gameBoard.allValidMoves();

			for (j = 0; j < allValidMoves.size(); j++) {
				legalMoves.add(new Move(selectedPiece, allValidMoves.get(j)));
			}
		}
		return legalMoves;
	}

}
