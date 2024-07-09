package chapter02;

public class MovieTestDrive {

    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();

        Movie there = new Movie();
        there.title = "Byte Club";
        there.genre = "Tragic but ultimately uplifting";
        there.rating = 127;

    }
}
