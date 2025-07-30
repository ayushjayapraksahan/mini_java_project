import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        boolean whiteTurn = true;

        while (true) {
            board.printBoard();
            System.out.print((whiteTurn ? "White" : "Black") + "'s move: ");
            String move = scanner.nextLine(); // like "e2 e4"

            if (move.equals("exit")) break;

            try {
                String[] parts = move.split(" ");
                int srcRow = 8 - Character.getNumericValue(parts[0].charAt(1));
                int srcCol = parts[0].charAt(0) - 'a';
                int destRow = 8 - Character.getNumericValue(parts[1].charAt(1));
                int destCol = parts[1].charAt(0) - 'a';

                Piece piece = board.board[srcRow][srcCol];

                if (piece == null) {
                    System.out.println("No piece at source.");
                    continue;
                }

                if (piece.isWhite() != whiteTurn) {
                    System.out.println("Not your turn.");
                    continue;
                }

                if (piece.isValidMove(srcRow, srcCol, destRow, destCol, board.board)) {
                    board.board[destRow][destCol] = piece;
                    board.board[srcRow][srcCol] = null;
                    whiteTurn = !whiteTurn;
                } else {
                    System.out.println("Invalid move.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Use format like e2 e4");
            }
        }
        scanner.close();
    }
}
