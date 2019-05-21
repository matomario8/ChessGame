package chessgame;

import java.awt.Color;

import chessgame.Position.Square;

public class Bishop extends Piece {
    
    public Bishop(Square square, Color color) {
        super(square, color);
    }

    public PieceType getPieceType() {
        return PieceType.KING;
    }

}