package chessgame;

import java.awt.Color;

import chessgame.Position.Square;

public class Rook extends Piece {
    

    public Rook(Square square, Color color) {
        super(square, color);
    }

    public PieceType getPieceType() {
        return PieceType.ROOK;
    }
}