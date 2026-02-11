/*
 * Activity 2.2.8
 *
 * A Song class for the MediaLibrary program
 */
public class Song
{
  private String title;
  private String author;
  // Can only mutate by value
  private int rating;
  
  /*** Constructor ****/
  public Song(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }

  /*
  * Set the rating of the book between 0 and 10
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

  public boolean equals (Book b) {
    if (this.title.equals(b.getTitle()) && this.author.equals(b.getAuthor())) {
      return true;
    }
    else {
      return false;
    }
  }
}