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
        dataSolver.readDataFile();
        dataSolver.loopSongData();
        SinglyLinkedList<Song> list = dataSolver.getSongList();
        for (int x = 0; x < list.size(); x++) {
            Song song = list.get(x);
            System.out.println("Song Title: " + song.getTitle());
            System.out.println("Song Artist: " + song.getArtist());
            System.out.println("Song Genre: " + song.getGenre());
            System.out.println("Song Year: " + song.getYear());
            System.out.println("Heard");
            System.out.print("reading:"+ song.getHobbyData(0));
            System.out.print(" art:" + song.getHobbyData(2));
            System.out.print(" sports:"+ song.getHobbyData(4));
            System.out.print(" music:"+ song.getHobbyData(6));
            System.out.println();
            System.out.println("Likes");
            System.out.print("reading:" + song.getHobbyData(1));
            System.out.print(" art:" + song.getHobbyData(3));
            System.out.print(" sports:" + song.getHobbyData(5));
            System.out.print(" music:" + song.getHobbyData(7));
            System.out.println();
            System.out.println();
        }
    }

}
