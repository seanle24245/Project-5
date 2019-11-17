package prj5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * the DataSolver reads the files stores them on the list
 * 
 * @author ryantb
 * @author sean2022
 * @author christinatran
 * 
 * @version 2019.11.17
 *
 */
public class DataSolver {
    private Scanner songScanner;
    private Scanner dataScanner;
    private SinglyLinkedList<Song> songList;
    
    /**
     * the constructor of DataSolver
     * 
     * @param songFile the file that contains all the song
     * @param dataFile the file that contains the survey responses
     * @throws FileNotFoundException
     */
    public DataSolver(String songFile, String dataFile) throws FileNotFoundException {
        songScanner = new Scanner(new File(songFile));
        dataScanner = new Scanner(new File(dataFile));
        songList = new SinglyLinkedList<Song>();
    }
    
    /**
     * reads the song file from the constructor
     */
    public void readSongFile() {
        while(songScanner.hasNext()) {
            String nextLine = songScanner.next();
            String[] arr = nextLine.split(",");
            Song song = new Song(arr[0], arr[1], arr[3], Integer.parseInt(arr[2]));
            songList.add(song);
        }
    }
    
}
