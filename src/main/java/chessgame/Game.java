package chessgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import chessgame.gui.*;

public class Game {

    public static void main(String[] args) {

        System.out.println("Type 1 for one-player mode, 2 for two-player");
        /*Scanner input = new Scanner(System.in);

        int mode = input.nextInt();
        boolean computerOpponent = (mode == 1) ? true : false;
        boolean playerOneTurn = true;

        ChessBoard board = new ChessBoard();

        PlayerInterface playerOne = new Player("Player 1");
        PlayerInterface playerTwo = new Player("Player 2");

        List<Piece> pieces = new ArrayList<>();
        
        for(int i = 0; i < 8; i++) {
            pieces.add(new Pawn(new Position(i, 1), playerOne));
            pieces.add(new Pawn(new Position(i, 6), playerTwo));
        }

        pieces.add(new Rook(new Position(0, 0), playerOne));
        pieces.add(new Rook(new Position(7, 0), playerOne));
        pieces.add(new Rook(new Position(0, 7), playerTwo));
        pieces.add(new Rook(new Position(7, 7), playerTwo));

        pieces.add(new Knight(new Position(1, 0), playerOne));
        pieces.add(new Knight(new Position(6, 0), playerOne));
        pieces.add(new Knight(new Position(1, 7), playerTwo));
        pieces.add(new Knight(new Position(6, 7), playerTwo));

        pieces.add(new Bishop(new Position(2, 0), playerOne));
        pieces.add(new Bishop(new Position(5, 0), playerOne));
        pieces.add(new Bishop(new Position(2, 7), playerTwo));
        pieces.add(new Bishop(new Position(5, 7), playerTwo));

        pieces.add(new Queen(new Position(3, 0), playerOne));
        pieces.add(new King(new Position(4, 0), playerOne));
        pieces.add(new Queen(new Position(3, 7), playerTwo));
        pieces.add(new King(new Position(4, 7), playerTwo));

        for(Piece piece : pieces) {
            board.takePosition(piece.getPosition());
        }*/

        GameGUI game = new GameGUI();
        

        /*
        public List<Position> getMovesForPiece(Piece piece) {
            List<Position> newPositions = new ArrayList<>();

            Position curPosition = piece.getPosition();
            int curXPos = curPosition.getX();
            int curYPos = curPosition.getY();

            String pieceType = piece.getPieceType();

            switch(pieceType) {
                case "rook":
                    for(int i = 0; i < 8; i++) {
                        if(i == curXPos) {
                            continue;
                        }
                        newPositions.add(new Position(i, curYPos));
                    }

                    for(int i = 0; i < 8; i++) {
                        if(i == curYPos) {
                            continue;
                        }
                        newPositions.add(new Position(curXPos, i));
                    }
                    
                case "pawn":
                    newPositions.add(new Position(curXPos, curYPos + 1));
                    //if reversedirection, add -1
            }
            return newPositions;
        }
        */
        
    }

    public void movePiece(BoardInterface board, Piece piece, Position position, List<Piece> pieces) {
        //board.clearPosition(piece.getPosition().position.getX(), 
        //    piece.getPosition().position.getY());

        

        //board.takePosition();
    }

}