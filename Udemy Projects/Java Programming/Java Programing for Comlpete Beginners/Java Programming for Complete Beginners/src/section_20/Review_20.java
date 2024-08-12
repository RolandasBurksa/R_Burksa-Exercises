package section_20;

public class Review_20 {

    private int id;
    private String description;
    private int rating;

    public Review_20(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public String toString() {
        return id + " " + description + " " + rating;
    }
}
