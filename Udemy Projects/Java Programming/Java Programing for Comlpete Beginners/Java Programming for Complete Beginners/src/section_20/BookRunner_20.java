package section_20;

public class BookRunner_20 {

    public static void main(String[] args) {
        Book_20 book_20 = new Book_20(123, "Programing with Java", "Author");

        book_20.addReview_20(new Review_20(10, "Great book", 5));
        book_20.addReview_20(new Review_20(101, "Awesome", 5));

        System.out.println(book_20);
    }
}
