package jrJava.lineOfAction4_AI_using_gameTree_complete;

import java.util.ArrayList;

public class AIPlayer {

	private GameBoard gameBoard;
	private Move bestMove;
	public static final int DEPTH_LIMIT = 5;
	
	
	public AIPlayer(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
	}
	
	public void makeMove() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { }
		
		gameBoard.setTurn(Coordinator.COMPUTER_TURN); 
		
		minMax(0, Coordinator.COMPUTER_TURN);
		
		if(bestMove!=null) {
			gameBoard.makeMove(bestMove);
		}
		
		boolean result = gameBoard.isGameOver();
		if(result) {
			Coordinator.winner = gameBoard.getTurn();
		}
		
		gameBoard.setTurn(-gameBoard.getTurn()); 
	}
	
	
	private int minMax(int depth, int currentTurn) {
		
		if(gameBoard.getTurn()==Coordinator.COMPUTER_TURN &&
		   gameBoard.isGameOver()) return Integer.MAX_VALUE-depth;
		if(gameBoard.getTurn()==Coordinator.HUMAN_TURN &&
		   gameBoard.isGameOver()) return Integer.MIN_VALUE+depth;
		if(depth > DEPTH_LIMIT) return 0;
		
		gameBoard.setTurn(currentTurn);
		ArrayList<Move> allLegalMoves = allLegalMoves();
		if(allLegalMoves.size()==0) return 0;
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		Move each;
		for(int i=0; i<allLegalMoves.size(); i++) {
			each = allLegalMoves.get(i);
			boolean capturedEnemyPiece = gameBoard.makeMove(each);
			int score = minMax(depth+1, -currentTurn);
			
			// choose maximum among the scores, if AI-turn
			if(currentTurn==Coordinator.COMPUTER_TURN) {
				if(score>max) {
					max = score;
					if(depth==0) bestMove = each;
				}
			}
			// choose minimum among the scores, if Human-turn.
			else if(currentTurn==Coordinator.HUMAN_TURN) {
				if(score<min) min = score;
			}
			
			gameBoard.setTurn(currentTurn);
			gameBoard.undoMove(each, capturedEnemyPiece);
		}
		
		return currentTurn==Coordinator.COMPUTER_TURN? max:min;
	}
	
	
	public ArrayList<Move> allLegalMoves() {
		ArrayList<Move> legalMoves = new ArrayList<Move>();
		
		ArrayList<Integer> myPieces = gameBoard.allMyPieces();
		int selectedPiece;
		ArrayList<Integer> allValidMoves;
		int i, j;
		
		for(i=0; i<myPieces.size(); i++) {
			selectedPiece = myPieces.get(i);
			gameBoard.selectPiece(selectedPiece);
			allValidMoves = gameBoard.allValidMoves();
			
			for(j=0; j<allValidMoves.size(); j++) {
				legalMoves.add(new Move(selectedPiece, allValidMoves.get(j)));
			}
		}
		return legalMoves;
	}
	
}



