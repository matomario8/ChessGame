package chessgame;

public class Position {


    public enum Square {

        A1(new Position(0, 7)), A2(new Position(0, 6)), A3(new Position(0, 5)),
        A4(new Position(0, 4)), A5(new Position(0, 3)), A6(new Position(0, 2)),
        A7(new Position(0, 1)), A8(new Position(0, 0)), B1(new Position(1, 7)),
        B2(new Position(1, 6)), B3(new Position(1, 5)), B4(new Position(1, 4)),
        B5(new Position(1, 3)), B6(new Position(1, 2)), B7(new Position(1, 1)),
        B8(new Position(1, 0)), C1(new Position(2, 7)), C2(new Position(2, 6)),
        C3(new Position(2, 5)), C4(new Position(2, 4)), C5(new Position(2, 3)),
        C6(new Position(2, 2)), C7(new Position(2, 1)), C8(new Position(2, 0)),
        D1(new Position(3, 7)), D2(new Position(3, 6)), D3(new Position(3, 5)),
        D4(new Position(3, 4)), D5(new Position(3, 3)), D6(new Position(3, 2)),
        D7(new Position(3, 1)), D8(new Position(3, 0)), E1(new Position(4, 7)),
        E2(new Position(4, 6)), E3(new Position(4, 5)), E4(new Position(4, 4)),
        E5(new Position(4, 3)), E6(new Position(4, 2)), E7(new Position(4, 1)),
        E8(new Position(4, 0)), F1(new Position(5, 7)), F2(new Position(5, 6)),
        F3(new Position(5, 5)), F4(new Position(5, 4)), F5(new Position(5, 3)),
        F6(new Position(5, 2)), F7(new Position(5, 1)), F8(new Position(5, 0)),
        G1(new Position(6, 7)), G2(new Position(6, 6)), G3(new Position(6, 5)),
        G4(new Position(6, 4)), G5(new Position(6, 3)), G6(new Position(6, 2)),
        G7(new Position(6, 1)), G8(new Position(6, 0)), H1(new Position(7, 7)),
        H2(new Position(7, 6)), H3(new Position(7, 5)), H4(new Position(7, 4)),
        H5(new Position(7, 3)), H6(new Position(7, 2)), H7(new Position(7, 1)),
        H8(new Position(7, 0));

        Square(int x, int y) {}
        Square(Position p) {}
    }

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean equals(Position position) {
        return position.getX() == this.getX() &&
            position.getY() == this.getY(); 
    }
}