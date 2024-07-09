package chapter02;

public class Episode {

    int seriesNumber;
    int episodeNumber;

    void skipIntro() {
        System.out.println("Loading next episode...");
    }

    void play(){

        System.out.println("Playing movie!.");
    }

    void showSeriesNumber(){

        System.out.println("Series number: " + seriesNumber + ".");
    }
}
