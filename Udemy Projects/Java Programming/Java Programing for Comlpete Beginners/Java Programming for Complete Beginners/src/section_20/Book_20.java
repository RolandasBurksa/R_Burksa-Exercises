package section_20;

import java.util.ArrayList;

public class Book_20 {

    private  int id;
    private String name;
    private String author;
    private ArrayList<Review_20> reviews = new ArrayList<>();

    public Book_20(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview_20(Review_20 review20) {
        this.reviews.add(review20);
    }

    public String toString() {
        return String.format("id = %d name = %s author = %s Reviews = [%s]", id, name, author, reviews);
    }
}
