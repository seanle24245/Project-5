package prj5;

import student.TestCase;

/**
 * Tests for the Song class
 * 
 * @author Ryan Bui (ryantb)
 * @author Sean Le (sean2022)
 * @author Christina Tran (christinatran)
 * 
 * @version 2019.11.17
 *
 */
public class SongTest extends TestCase {
    Song song;
    public void setUp() {
        song = new Song("White Christmas", 
            "bing crosby", "classics", "1972");
    }
    
    /**
     * tests getting the title
     */
    public void testGetTitle() {
        assertEquals("White Christmas", song.getTitle());
    }
    
    /**
     * tests getting the artist
     */
    public void testGetArtist() {
        assertEquals("bing crosby", song.getArtist());
    }
    
    /**
     * tests getting the genre
     */
    public void testGetGenre() {
        assertEquals("classics", song.getGenre());
    }
    
    /**
     * tests getting the year
     */
    public void testGetYear() {
        assertEquals("1972", song.getYear());
    }
    
    /**
     * tests incrementing hobby data for likes
     */
    public void testIncrementHobbyLiked() {
        song.incrementHobbyLiked(0);
        song.incrementHobbyLiked(0);
        assertEquals(song.getHobbyData(0), 2);
        
    }
    
    /**
     * tests incrementing hobby data for hearing a song
     */
    public void testIncrementHobbyHeard() {
        song.incrementHobbyHeard(2);
        song.incrementHobbyHeard(2);
        song.incrementHobbyHeard(2);
        assertEquals(song.getHobbyData(3), 3);
    }
}
