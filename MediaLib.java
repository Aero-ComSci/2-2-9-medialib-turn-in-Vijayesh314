/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  public static String owner = "PLTW";
  private Movie movie;
  private Song song;

  private static int numEntries;

  public void addBook(Book b)
  {
    if (book == null) {
      book = b;
      numEntries++;
    }
    else {
      System.out.println("A book is already added to the library.");
    }
  }

  public static int getNumEntries() {
    return numEntries;
  }

  public static void changeOwner(String o) {
    owner = o;
  }

  static String getOwner() {
    return "Media Library Owner: " + owner;
  }

  public void addMovie(Movie m)
  {
    if (movie == null) {
      movie = m;
      numEntries++;
    }
    else {
      System.out.println("A movie is already added to the library.");
    }
  }

  public void addSong(Song s)
  {
    if (song == null) {
      song = s;
      numEntries++;
    }
    else {
      System.out.println("A song is already added to the library.");
    }
  }
  
  /*
  * Modify toString to show the state of the library
  * @precondition: MediaLib not null
  */
  public String toStringMovie() 
  {
    String info = "Movie added: \n" + movie.toString();
    return info;
  }

  public String toStringBook() 
  {
    String info = "Book added: \n" + book.toString();
    return info;
  }

  public String toStringSong() 
  {
    String info = "Song added: \n" + song.toString();
    return info;
  }
}