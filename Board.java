public class Board {
    public Piece[][] board = new Piece[8][8];

    public Board() {
        setup();
    }

    public void setup() {
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(false); // Black
            board[6][i] = new Pawn(true);  // White
        }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
}
