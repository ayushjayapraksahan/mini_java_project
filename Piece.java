public abstract class Piece {
    boolean isWhite;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract boolean isValidMove(int srcRow, int srcCol, int destRow, int destCol, Piece[][] board);

    public abstract String toString(); // display symbol
}
