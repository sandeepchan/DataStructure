import java.util.*;
import java.util.*;
import java.util.stream.Collectors;
public class Cognizant {
}



class Movies {
    private String name;
    private String dateOfRelease;
    private int ticketPrice;
    private String genre;
    private Optional<Integer> IMDBRating;

    @FunctionalInterface
    interface IMDB {
        public Optional<Integer> rate(int rating);
    }

    public Movies(String name, String dateOfRelease, int ticketPrice, String genre, Optional<Integer> IMDBRating) {
        this.name = name;
        this.dateOfRelease = dateOfRelease;
        this.ticketPrice = ticketPrice;
        this.genre = genre;
        this.IMDBRating = IMDBRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(String dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Optional<Integer> getIMDBRating() {
        return IMDBRating;
    }

    public void setIMDBRating(Optional<Integer> IMDBRating) {
        this.IMDBRating = IMDBRating;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", dateOfRelease='" + dateOfRelease + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", genre='" + genre + '\'' +
                ", IMDBRating=" + IMDBRating +
                '}';
    }

    public static void main(String[] args) {
        Movies Barbie = new Movies("Barbie", "07-21-2023", 150, "Fantasy", Optional.empty());
        Movies Oppenheimer = new Movies("Oppenheimer", "07-21-2023", 150, "History", Optional.of(8));
        Movies Elemental = new Movies("Elemental", "07-21-2023", 150, "Comedy", Optional.empty());
        Movies AsteroidCity = new Movies("AsteroidCity", "07-21-2023", 150, "Drama", Optional.empty());

        List<Movies> movieList = new ArrayList<Movies>();
        List<Movies> newMovieList = new ArrayList<Movies>();

        movieList.add(Barbie);
        movieList.add(Oppenheimer);
        newMovieList.add(Elemental);
        newMovieList.add(AsteroidCity);

        List<List<Movies>> wholeMovieList = Arrays.asList(movieList, newMovieList);
        // REQUIREMENT #1: Change the ticket price of the movies in "movieList" to 155.
        wholeMovieList.stream().map(movies -> movies.stream().map(s->{
            s.setTicketPrice(173);
            return  s;
        }).toList()).toList();




        // REQUIREMENT #2: Implement the functional interface IMDB using a lambda expression.
        IMDB imdb1 = new IMDB() {
            @Override
            public Optional<Integer> rate(int rating) {
                return Optional.empty();
            }
        };


        IMDB imdb = rating ->  Optional.of(rating);


        // REQUIREMENT #3: Using the implemented interface, assign the IMDB rating as 7 for movies with empty IMDB rating in "movieList".
        wholeMovieList.stream().map(movies -> movies.stream().map(s->{
            if(s.getIMDBRating().isEmpty()){

                s.setIMDBRating(imdb.rate(7));
            }
            return  s;
        }).toList()).toList();

        // REQUIREMENT #4: Convert "wholeMovieList" into a list of movies, and name it "finalList".

        List<Movies> finalList= wholeMovieList.stream().flatMap(s->s.stream()).collect(Collectors.toList());
        finalList.sort((a,b)-> b.getName().compareTo(a.getName()));
        // REQUIREMENT #5: Sort "finalList" by the movie names, in descending order, by implementing a Comparator.
        Comparator<Movies> comparator = new Comparator<Movies>() {
            @Override
            public int compare(Movies o1, Movies o2) {
                return o2.getName().compareTo(o1.getName());
            }

        };
//        finalList.stream().sorted(comparator).toList().forEach(System.out::println);
//       ;

        finalList.forEach(System.out::println);


    }

    public  static  void main(){

    }

}