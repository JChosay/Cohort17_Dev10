public class Hero {
    private String name;
    Power[] powers;

    Hero(String name, Power[] powers) {
        this.name = name;
        this.powers = new Power[powers.length];
        for (int i = 0; i < powers.length; i++)
            this.powers[i] = powers[i];
    }
    public String getName() { return name; }
    public Power[] getPowers() { return this.powers; }

    public String toLine() {
        String result = "Name: " + getName() + ", Powers: ";
        for (int i = 0; i < powers.length; i++)
            if (i == powers.length - 1)
                result += powers[i].getName();
            else
                result += powers[i].getName() + ", ";
        return result;
    }
}