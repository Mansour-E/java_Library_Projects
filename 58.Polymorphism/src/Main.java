public class Main {

    public static void main(String[] args) {

        Movie theMovie = new Adventure("Star wars");
        theMovie.watchMovie();

        Movie theComedy = new Comedy("Star wars");
        theMovie.watchMovie();

        Movie theScienceFickshen = new ScienceFiction("Star wars");
        theMovie.watchMovie();

    }
}
