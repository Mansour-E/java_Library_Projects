import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.songs = new ArrayList<Song>();
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String title, double duration){

        if (findSong(title) == null) {

            songs.add(new Song(title , duration));
            return true;
        }

        return false;
    }

    private Song findSong(String title){

        for(Song elem: songs){
            if(elem.getTitle().equals(title)){
                return elem;

            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){

        int index = trackNumber - 1;
        if ((index >= 0) && (index <= songs.size())) {
            playList.add(songs.get(index));
            return true;
        }

        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {

        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        return false;
    }
}
