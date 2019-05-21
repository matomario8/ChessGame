package chessgame;

import java.awt.Color;

import chessgame.Position.Square;

public class Queen extends Piece {
    

    public Queen(Square square, Color color) {
        super(square, color);
    }

    public PieceType getPieceType() {
        return PieceType.QUEEN;
    }

}