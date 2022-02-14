package classes;

public class Guest {
    private String name;

    Guest () { this.name = "unoccupied"; }

    public String getGuestName(){ return name; }
    public void setGuestName(String name) { this.name = name; }
}
