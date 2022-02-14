public class Musician {

    private String name;
    private int rating;

    /**
     * @param name   The name of the musician.
     * @param rating A number representing how much a musician is loved relative to other musicians.
     */
    public Musician () {}
    public Musician(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public int getRating() {
        return rating;
    }
    public void setName(String input) { this.name = input; }
    public void setRating(int input) { this.rating = input; }
}
