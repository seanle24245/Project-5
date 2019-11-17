package prj5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * the DataSolver reads the files stores them on the list
 * 
 * @author Ryan Bui (ryantb)
 * @author Sean Le (sean2022)
 * @author Christina Tran (christinatran)
 * 
 * @version 2019.11.17
 *
 */
public class DataSolver {
    private Scanner songScanner;
    private Scanner dataScanner;
    private SinglyLinkedList<Song> songList;
    private SinglyLinkedList<Student> studentList;
    
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
            String nextLine = songScanner.nextLine();
            String[] arr = nextLine.split(",");
            Song song = new Song(arr[0], arr[1], arr[3], Integer.parseInt(arr[2]));
            songList.add(song);
        }
    }
    
    public void readDataFile() {
        while (dataScanner.hasNext()) {
            String nextLine = songScanner.nextLine();
            String[] arr = nextLine.split(",");
            int studentID = Integer.parseInt(arr[0]);
            String major = arr[2];
            String hobby = arr[4];
            String region = arr[3];
            Student student = new Student(hobby, region, major, studentID);
            for (int i = 5; i < arr.length; i++) {
                student.addResponse(arr[i]);
            }
            studentList.add(student);
        }
        dataScanner.close();
    }
    
}
