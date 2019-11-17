
public class Song {
    private String title;
    private String genre;
    private int year;
    private int amountOfYes;
    private int totalResponses;
    
    public Song(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        amountOfYes = 0;
        totalResponses = 0;
    }
}
