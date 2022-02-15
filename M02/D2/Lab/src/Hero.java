public class Hero {

    private final String name;
    private char symbol = '@';
    private int x;
    private int y;
    private int lightRange = 1;
    private int visionRange = lightRange + 1;

    // Create a hero with a name and an initial position.
    public Hero(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public void setSymbol(char input) { this.symbol = input; }
    public void setLightRange(int input) { this.lightRange = input; }
    public void setVisionRange(int input) { this.visionRange = input; }
    public int getVisionRange() {
        return visionRange;
    }
    public int getLightRange() {
        return lightRange;
    }

    // getters
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // movement
    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }
}
