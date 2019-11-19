package prj5;

import java.io.FileNotFoundException;

/**
 * Input class that contains the main method and is used to begin the program by
 * creating a GUIProjectWindow and call the DataSolver class. Acts like a
 * projectRunner() class.
 * 
 * @author Ryan Bui (ryantb)
 * @author Sean Le (sean2022)
 * @author Christina Tran (christinatran)
 * 
 * @version 2019.11.17
 *
 */
public class Input {
    /**
     * New Input object.
     */
    public Input() {
        // dont need constructor
    }

    /**
     * 
     * @param args the String array to be provided
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
        GUIWindow display = new GUIWindow();
     // survey data file
        // song list data file
        DataSolver dataSolver = new DataSolver("SongList2018HalfSongs.csv","MusicSurveyData2018HolesHalf.csv");
        dataSolver.readSongFile();

        dataSolver.sortSongsByTitle();
        //dataSolver.readDataFile();
        dataSolver.loopSongData();
        SinglyLinkedList<Song> list = dataSolver.getSongList();
        for (int x = 0; x < list.size(); x++) {
            Song song = list.get(x);
            System.out.println("song title " + song.getTitle());
            System.out.println("song artist " + song.getArtist());
            System.out.println("song genre " + song.getGenre());
        }
    }

}
