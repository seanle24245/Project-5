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
    public Song(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.amountOfYes = 0;
        this.totalResponses = 0;
        hobbyData = new int[ARRAY_SIZE];
        regionData = new int[ARRAY_SIZE];
        majorData = new int[ARRAY_SIZE];
        
    }
    
    /**
     * gets the title of the song
     * 
     * @return the string of the song genre
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * gets the genre of the song
     * 
     * @return the string of the song genre
     */
    public String getGenre() {
        return genre;
    }
    
    /**
     * gets when the song was made
     * 
     * @return the int of the year of the song
     */
    public int getYear() {
        return year;
    }
    
    /**
     * the percentage of yes divided
     * by the total of responses
     * 
     * @return the percentage of amountOfYes / totalResponses
     */
    public double calcPercentage() {
        return (double)(amountOfYes / totalResponses);
    }
    
    /**
     * gets the data from the hobby array
     * at the specific index is called
     * 
     * @param index the location in the array where it's pulling data
     * @return the data from hobby
     */
    public int getHobbyData(int index) {
        return hobbyData[index];
    }
    
    /**
     * gets the data from the region array at
     * the specific index that is called
     * 
     * @param index the location in the array where it's pulling data
     * @return the data from region
     */
    public int getRegionData(int index) {
        return regionData[index];
    }
    
    /**
     * gets the data from the major array at 
     * specific index that is called
     * 
     * @param index the location in the array where it's pulling data
     * @return the data from major
     */
    public int getMajorData(int index) {
        return majorData[index];
    }
    
    /**
     * increments the number of yes and total responses
     * 
     * @param str checks if the response was yes or not
     */
    public void incrementCounts(String str) {
        if (str.equals("Yes")) { 
            amountOfYes++;
        }
         // "No" or blank response "" 
        totalResponses++;
    }

}
