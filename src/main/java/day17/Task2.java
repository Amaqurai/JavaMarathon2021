package day17;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece kingWhite = ChessPiece.KING_WHITE;
        ChessPiece queenWhite = ChessPiece.QUEEN_WHITE;
        ChessPiece rookWhite = ChessPiece.ROOK_WHITE;
        ChessPiece bishopWhite = ChessPiece.BISHOP_WHITE;
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;

        ChessPiece kingBlack = ChessPiece.KING_BLACK;
        ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
        ChessPiece knightBlack = ChessPiece.KNIGHT_BLACK;
        ChessPiece pawnBlack = ChessPiece.PAWN_BLACK;
        ChessPiece bishopBlack = ChessPiece.BISHOP_BLACK;

        ChessPiece empty = ChessPiece.EMPTY;

        final int WIDTH_BOARD = 8;
        final int HEIGHT_BOARD = 8;

        ChessPiece[][] chessPieces = new ChessPiece[WIDTH_BOARD][HEIGHT_BOARD];

        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces.length; j++) {
                if (i == 0 && ((j == 4) || (j == 0))) {
                    chessPieces[i][j] = rookBlack;
                } else if (i == 0 && j == 6) {
                    chessPieces[i][j] = kingBlack;
                } else if ((i == 1 && j == 1) || (i == 7 && j == 5)) {
                    chessPieces[i][j] = rookWhite;
                } else if ((i == 1 && (j == 4 || j == 5 || j == 7)) || (i == 2 && (j == 0 || j ==6))){
                    chessPieces[i][j] = pawnBlack;
                } else if (i == 2 && j == 2) {
                    chessPieces[i][j] = knightBlack;
                } else if (i == 3 && j == 0) {
                    chessPieces[i][j] = queenBlack;
                } else if ((i == 3 && j == 3) || (i== 5 && j == 4)) {
                    chessPieces[i][j] = bishopWhite;
                } else if (i == 4 && j == 3)  {
                    chessPieces[i][j] = bishopBlack;
                } else if ((i == 4 && j == 4) || (i == 5 && j == 5) || (i == 6 && ((j == 0) || (j == 5) || (j == 7)))) {
                    chessPieces[i][j] = pawnWhite;
                } else if (i == 6 && j == 3) {
                    chessPieces[i][j] = queenWhite;
                } else if (i == 7 && j == 6) {
                    chessPieces[i][j] = kingWhite;
                } else {
                    chessPieces[i][j] = empty;
                }
            }
        }

        ChessBoard chessBoard = new ChessBoard(chessPieces);

        chessBoard.print();

    }
}
