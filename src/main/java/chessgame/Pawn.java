package chessgame;

import java.awt.Color;

import chessgame.Position.Square;

public class Pawn extends Piece {
    

    public Pawn(Square square, Color color) {
        super(square, color);
    }

    public PieceType getPieceType() {
        return PieceType.PAWN;
    }

}