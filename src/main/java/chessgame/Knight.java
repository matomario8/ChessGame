package chessgame;

import java.awt.Color;

import chessgame.Position.Square;

public class Knight extends Piece {
    
    public Knight(Square square, Color color) {
        super(square, color);
    }

    public PieceType getPieceType() {
        return PieceType.KNIGHT;
    }

}