public class Treasure {
    
    private final int x;
    private final int y;
    private boolean found = false;

    public Treasure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void treasureFound() { this.found = true; }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getTreasureStatus() { return found;}
}
