package chessgame;

public class Player implements PlayerInterface {

    private static int currentID = 1;

    private int id;
    private String name;
    

    public Player(String name) {
        this.name = name;
        this.id = createID();
    } 

    public static int createID() {
        return currentID++;
    }

    public String getLabel() {
        return this.name;
    }

    public int getID() {
        return this.id;
    }


}