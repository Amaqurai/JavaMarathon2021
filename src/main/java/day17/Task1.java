package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawn = ChessPiece.PAWN_BLACK;
        ChessPiece rook = ChessPiece.ROOK_WHITE;

        String[] chessPieces = new String[8];
        for (int i = 0; i < chessPieces.length; i++) {
            if (i < 4) {
                chessPieces[i] = pawn.getIdol();
            } else {
                chessPieces[i] = rook.getIdol();
            }
        }
        for (String s : chessPieces) {
            System.out.print(s);
        }
    }
}