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
     * fasfsf
     * @param songFile
     *            the file that contains all the song
     * @param dataFile
     *            the file that contains the survey responses
     * @throws FileNotFoundException
     */
    public DataSolver(String songFile, String dataFile)
        throws FileNotFoundException {
        songScanner = new Scanner(new File(songFile));
        dataScanner = new Scanner(new File(dataFile));
        songList = new SinglyLinkedList<Song>();
    }


    /**
     * reads the song file from the constructor
     */
    public void readSongFile() {
        while (songScanner.hasNext()) {
            String nextLine = songScanner.nextLine();
            String[] arr = nextLine.split(",");
            Song song = new Song(arr[0], arr[1], arr[3], arr[2]);
            songList.add(song);
        }
    }

    /**
     * reads survey data and populates list of students
     */
    public void readDataFile() {
        dataScanner.nextLine();
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

    /**
     * returns the associated index of the given hobby
     * @param s is the hobby
     * @return integer index position
     */
    public int getIntForHobby(String s) {
        if (s.equals("reading")) {
            return 0;
        }
        else if (s.equals("art")) {
            return 2;
        }
        else if (s.equalsIgnoreCase("sports")) {
            return 4;
        }
        else if (s.equals("music")) {
            return 6;
        }
        return -1;
    }

    /**
     * loops through student survey data to change 
     * Song information
     */
    public void loopSongData() {
        for (int i = 0; i < studentList.size(); i++) {
            int[] responses = studentList.get(i).getResponses();
            Student student = studentList.get(i);
            for (int x = 0; x < responses.length; x += 2) {
                if (responses[x] == 1) {
                    songList.get(x).incrementHobbyHeard(getIntForHobby(student
                        .getHobby()));
                }

                if (responses[x + 1] == 1) {
                    songList.get(x).incrementHobbyLiked(getIntForHobby(student
                        .getHobby()));
                }

            }
        }
    }
    /**
     * gets the list of students 
     * @return a SinglyLinkedList<Student>
     */
    public SinglyLinkedList<Student> getStudentList(){
        int x = 0;
        
        return studentList;
        
    }
    
    /**
     * gets the list of songs
     * @return a SinglyLinkedList<Song>
     */
    public SinglyLinkedList<Song> getSongList() {
        return songList;
    }
    
    
    /**
     * sorts the songlist alphabetically
     */
    public void sortSongsByTitle() {
        for(int x = 0; x < songList.size(); x++) {
            Song minTitleSong = songList.get(x);
            int minIndex = x;
            for(int j = x; j < songList.size(); j++) {
                Song song = songList.get(j);
                String songName = song.getTitle();
                String minSongName = minTitleSong.getTitle();
                if(songName.compareTo(minSongName)<=0) {
                    minSongName = songName;
                    minTitleSong = song;
                    minIndex = j;
                }
            }
            songList.remove(minIndex);
            songList.add(x, minTitleSong);
        }
    }
}
