package boardgame;

public class Board {
	
	Square [][] squares = new Square[9][9];
	
	
	public Board() {
		this.setBoard();
		
	}
	private void setBoard() {
		for(int i = 1; i < 9; i ++) {
			for(int j = 1; j < 9; j++ ) {
				
				squares[i][j] = new Square();
			}
		}
		

	}
	public void printBoard() {
		for(int i = 1; i < 9; i ++) {
			System.out.println();
			
			for(int j = 1; j < 9; j++ ) {
				
				System.out.print((squares[i][j].toString()));
			}
			
		}
	}
	

}


