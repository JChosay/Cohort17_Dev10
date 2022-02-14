public class Balloon {
    private String color;
    private double psi = 0.0;
    public Balloon(String color) { this.color = color; }

    public String getColor() {
        return color;
    }
    public double getPsi() {
        if (psi > 16.0)
            return Double.POSITIVE_INFINITY;
        else
            return psi;
    }
    public void inflate() { this.psi += Math.random() * 5.0;}
    public boolean isExploded() {
        if (psi > 16.0)
            return true;
        else
            return false;
    }
}