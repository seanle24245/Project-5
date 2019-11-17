package prj5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataSolver {
    private Scanner songScanner;
    private Scanner dataScanner;
    private SinglyLinkedList<Song> songList;
    
    /**
     * 
     * 
     * @param songFile
     * @param dataFile
     * @throws FileNotFoundException
     */
    public DataSolver(String songFile, String dataFile) throws FileNotFoundException {
        songScanner = new Scanner(new File(songFile));
        dataScanner = new Scanner(new File(dataFile));
        songList = new SinglyLinkedList<Song>();
    }
    
    /**
     * reads the song file
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
