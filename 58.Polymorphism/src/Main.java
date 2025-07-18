import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /* Movie theMovie = new Adventure("Star wars");
        theMovie.watchMovie();

        Movie theComedy = new Comedy("Star wars");
        theMovie.watchMovie();

        Movie theScienceFickshen = new ScienceFiction("Star wars");
        theMovie.watchMovie();*/

        Movie theMovie = Movie.getMovie("Come" , "Star Wars");
        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                            "S for Science Fiction, or Q to quit: ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie theMovie2 = Movie.getMovie(type , title);
            theMovie2.watchMovie();

        }


    }
}
