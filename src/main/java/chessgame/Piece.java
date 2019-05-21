package chessgame;

import java.awt.Color;

import chessgame.Position.Square;

public abstract class Piece {
    
    private Square square;
    private Color color;

    public enum PieceType {
        PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING;
    }

    public Piece(Square square, Color color) {
        this.square = square;
        this.color = color;
    }

    public void setPosition(Square newSquare) {
        this.square = newSquare;
    }

    public Square getPosition() {
        return this.square;
    }

    public Color getColor() {
        return this.color;
    }

    public abstract PieceType getPieceType();

}