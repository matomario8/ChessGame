package chessgame;

import java.util.List;
import java.util.ArrayList;

public class ChessBoard implements BoardInterface {
    
    private List<Position> availablePositions;

    public ChessBoard() {
        this.prepareBoard();
    }

    private void prepareBoard() {

        this.availablePositions = new ArrayList<>();

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                this.availablePositions.add(new Position(i, j));
            }
        }

    }

    public List<Position> getAvailablePositions() {
        return this.availablePositions;
    }

    public boolean positionIsFree(int x, int y) {
        for(Position position : this.availablePositions) {
            if(position.getX() == x && position.getY() == y) {
                
                return false;
            }
        }
        return true;
    }

    //Fix if possible
    public void clearPosition(int x, int y) {

        this.availablePositions.add(new Position(x, y));
    }

    //Fix if possible
    public void takePosition(int x, int y) {
        for(Position position : this.availablePositions) {
            if(position.getX() == x && position.getY() == y) {
                this.availablePositions.remove(position);
            }
        }
    }

    public void takePosition(Position p) {
        for(Position position : this.availablePositions) {
            if(position.getX() == p.getX() && position.getY() == p.getY()) {
                this.availablePositions.remove(position);
            }
        }
    }

}