package chapter02;

public class StreamingSongTestDrive {

    public static void main(String[] args) {

       StreamingSong song = new StreamingSong();

        song.artist = "The Beatles - ";
        song.title = "Come Together";
        song.duration = 30;
        song.play();
        song.printDetails();
    }
}
