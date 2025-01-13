package lt.techin;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {

        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {

        for (Song s : songs) {
            if (s.getTitle().equals(title)){
                return s;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {

        int index = trackNumber - 1;
        if ((index >= 0) && (index < songs.size())) {
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song s = findSong(title);
        if (s != null) {
            playlist.add(s);
            return true;
        }
        return false;
    }

    // Additional method to print albums in Main
    @Override
    public String toString() {
        StringBuilder albumDetails = new StringBuilder();
        albumDetails.append("Album: ").append(name).append(" by ").append(artist).append("\n");
        albumDetails.append("Songs:\n");
        for (int i = 0; i < songs.size(); i++) {
            albumDetails.append((i + 1)).append(". ").append(songs.get(i).toString()).append("\n");
        }
        return albumDetails.toString();
    }
}
