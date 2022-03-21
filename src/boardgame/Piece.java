package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// para que o acesso seja apenas no board "protected
	protected Board getBoard() {
		return board;
	}

}
