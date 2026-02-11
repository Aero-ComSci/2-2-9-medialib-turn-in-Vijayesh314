/*
 * Activity 2.2.7
 *
 * A Movie class for the MediaLibrary program
 */
public class Movie
{
private String title;
    private double duration;
    // Can only mutate by value
    private int rating;

    /*** Constructor ****/
    public Movie(String t, double d) {
        title = t;
        duration = d;
        rating = 0;
    }

    /*** Accessor methods ***/
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        String info = "\"" + title + "\", duration is " + duration;
        if (rating != 0) { 
            info += ", rating is " + rating;
        }
        return info;
    }

    /*** Mutator methods ***/
    public void setTitle(String t) {
        title = t;
    }

    public void setDuration(double d) {
        duration = d;
    }

    /*
    * Set the rating of the movie between 0 and 10
    * Postcondition: Rating attribute will be an integer between 0 and 10
    * Precondition: Object cannot be null
    */
    public void adjustRating(int r) {
        if (r < 0 || r > 10) {
            System.out.println("Rating must be between 0 and 10");
            return;
        }
    rating = r;
    }

    public boolean equals (Movie m) {
        if (this.title.equals(m.getTitle()) && this.duration == m.getDuration()) {
            return true;
        }
        else {
            return false;
        }
    }
}