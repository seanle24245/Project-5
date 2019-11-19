package prj5;

/**
 * The song class contains all the data for one specific song
 * 
 * @author Ryan Bui (ryantb)
 * @author Sean Le (sean2022)
 * @author Christina Tran (christinatran)
 * 
 * @version 2019.11.17
 *
 */
public class Song {
    private String title;
    private String genre;
    private String year;
    private String artist;

    private int liked; // might not need
    private int heard; // might not need

    private int[] hobbyData;
    private int[] regionData;
    private int[] majorData;
    public static final int ARRAY_SIZE = 8; // each student has 4 categories,
                                            // and each category has 2 sides,
                                            // heard and likes, making 8 array
                                            // elements
    /**
     * Array indexes
     * Columns 0-1: category 1 heard, likes (reading)
     * Columns 2-3: category 2 heard, likes (art)
     * Columns 4-5: category 3 heard, likes (sports)
     * Columns 6-7: category 4 heard, likes (music)
     */

    /**
     * The constructor of the song class
     * 
     * @param title the title of the song
     * @param genre the genre of the song
     * @param year  the year the song was made
     */
    public Song(String title, String artist, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.artist = artist;
        
        this.liked = 0;
        this.heard = 0;
        
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
    public String getYear() {
        return year;
    }

    /**
     * gets the artist name
     * 
     * @return the string of the name of the artist
     */
    public String getArtist() {
        return artist;
    }

//    /**
//     * the percentage of yes divided by the total of responses
//     * FIXME may have to rethink this method
//     * @return the percentage of liked / heard
//     */
//    public double calcPercentage() {
//        return (double) (liked / heard);
//    }

    /**
     * gets the data from the hobby array at the specific index is called
     * 
     * @param index the location in the array where it's pulling data
     * @return the data from hobby
     */
    public int getHobbyData(int index) {
        return hobbyData[index];
    }
    
    public String toString() {
        return "Title:" + title + "genre: " + genre;
    }


    
    public void incrementHobbyLiked(int index) {
        hobbyData[index]++;
    }
    
    public void incrementHobbyHeard(int index) {
        hobbyData[index+1]++;
    }
    

//    /**
//     * increments the number of yes and total responses
//     * TODO fix with response index
//     * @param str checks if the response was yes or not
//     */
//    public void incrementCounts(String str) {
//        if (str.equals("Yes")) { 
//            liked++;
//        }
//         // "No" or blank response "" 
//        heard++;
//    }
    
}
