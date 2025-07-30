public class Pawn extends Piece {

    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int srcRow, int srcCol, int destRow, int destCol, Piece[][] board) {
        int dir = isWhite ? -1 : 1;
        if (srcCol == destCol && board[destRow][destCol] == null) {
            return destRow - srcRow == dir;
        }
        return false;
    }

    @Override
    public String toString() {
         return isWhite ? "P" : "p";
    }
}
