package chessgame;

import java.awt.Color;

import chessgame.Position.Square;

public class King extends Piece {
    
    public King(Square square, Color color) {
        super(square, color);
    }

    public PieceType getPieceType() {
        return PieceType.KING;
    }
}