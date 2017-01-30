package section9;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by dbrown on 1/25/17.
 */
public class Album {
    private String name;
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Album(String name) {
        this.name = name;
    }

    public void addSong(String name, Double duration) {
        songs.add(new Song(name, duration));
    }

    public Optional<Song> getSongByName(String title) {
        return songs.stream().filter(e -> e.getTitle().equals(title)).findFirst();
    }
}
