import java.util.ArrayList;

public class Album {

    private String name;
    private String artist;
    ArrayList<Song> song;

    public Album(String name, String artist) {
        this.song = new ArrayList<Song>();
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String songTitle, double songDuration){


    }
}
