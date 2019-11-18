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
        DataSolver dataSolver = new DataSolver("MusicSurveyData2018HolesHalf", "SongList2018HalfSongs"); 
    }

}
