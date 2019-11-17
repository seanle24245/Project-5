package prj5;
/**
 * The song class contains all the data
 * for one specific song
 * 
 * @author ryantb
 * @author sean2022
 * @author christinatran
 * 
 * @version 2019.11.17
 *
 */
public class Song {
    private String title;
    private String genre;
    private int year;
    private String artist;
    private int amountOfYes;
    private int totalResponses;
    private int[] hobbyData;
    private int[] regionData;
    private int[] majorData;
    public static final int ARRAY_SIZE = 16;
    
    /**
     * The constructor of the song class
     * 
     * @param title the title of the song
     * @param genre the genre of the song
     * @param year the year the song was made
     */
    public Song(String title, String artist, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.artist = artist;
        this.amountOfYes = 0;
        this.totalResponses = 0;
        hobbyData = new int[ARRAY_SIZE];
        regionData = new int[ARRAY_SIZE];
        majorData = new int[ARRAY_SIZE];
        
    }
    
    /**
     * 
     * @return
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * 
     * @return
     */
    public String getGenre() {
        return genre;
    }
    
    /**
     * 
     * @return
     */
    public int getYear() {
        return year;
    }
    
    
    /**
     * 
     * @return
     */
    public String getArtist() {
        return artist;
    }
    
    /**
     * 
     * @return
     */
    public double calcPercentage() {
        return (double)(amountOfYes/totalResponses);
    }
    
    /**
     * 
     * @param index
     * @return
     */
    public int getHobbyData(int index) {
        return hobbyData[index];
    }
    
    /**
     * 
     */
    public int getRegionData(int index) {
        return regionData[index];
    }
    
    /**
     * 
     * @param index
     * @return
     */
    public int getMajorData(int index) {
        return majorData[index];
    }
    
    /**
     * 
     * @param str
     */
    public void incrementCounts(String str) {
        if (str.equals("Yes")) { 
            amountOfYes++;
            totalResponses++;
        }
        else { // "No" or blank response "" 
            totalResponses++;
        }
    }

}
