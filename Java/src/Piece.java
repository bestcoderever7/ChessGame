import java.util.ArrayList;
import java.util.HashMap;

public class Piece extends Tile{
	// available positions to go to from current position
	int[][] availPositions;
	/*
	 1 - rook
	 2 - knight
	 3 - bishop
	 4 - king
	 5 - queen
	 6 - pawn
	 */
	private int typeOfPiece;
	private boolean isWhite;
	public Piece(int x, int y) {
		super(x, y);
	}

	public int getTypeOfPiece() {
		return typeOfPiece;
	}

	public void setTypeOfPiece(int typeOfPiece) {
		this.typeOfPiece = typeOfPiece;
	}

	public boolean isWhite() {
		return isWhite;
	}

	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}
}
