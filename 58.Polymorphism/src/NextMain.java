public class NextMain {

    public static void main(String[] args) {


        Movie movie = Movie.getMovie("A" , "Jaws");
        movie.watchMovie();

       /* Adventure jaws = (Adventure)Movie.getMovie("A" , "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C" , "Airplane");
        comedy.watchComedy();  */
        //that was problem run time

        /*Movie ComedyMovie = (Movie) comedy;
        ComedyMovie.watchComedy();*/

        // that is problem too , there is no method name watchComedy in Movie class

        Comedy comedy = (Comedy) movie;
        comedy.watchComedy();  // that is good !!!!

        // for a lot of casting , we do var , var take what ever that thing gives him

        var airplane = Movie.getMovie("C" , "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("C" , "Airplane");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchMovie();
        }else if (unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        }else if ( unknownObject instanceof ScienceFiction syfy){
            syfy.watchMovie();
        }

        



    }
}
