
package backend;


public class Film extends Media{
    
    private String director;

    public Film(String director, int duration, String title) {
        super(duration, title, MediaType.FILM);
        this.director = director;
    }

    @Override
    public double getCost() {
        double Cost;
        Cost = super.getDuration() * 0.03;
        return Cost;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Film{" + super.toString() + " director=" + director + '}';
    }
     
}
