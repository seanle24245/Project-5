package prj5;

import CS2114.TextShape;
import CS2114.Button;
import CS2114.Window;
import CS2114.WindowSide;
import java.awt.Color;

/**
 * The window for the program
 * 
 * @author Ryan Bui (ryantb)
 * @author Sean Le (sean2022)
 * @author Christina Tran (christinatran)
 * 
 * @version 2019.11.17
 *
 */
public class GUIWindow {
    
    /**
     * fields
     */
    private Window window;
    private TextShape textShape;
    private Button quitButton;
    private Button sortArt;
    private Button sortTitle;
    private Button sortYear;
    private Button sortGenre;
    private Button prevButton;
    private Button nextButton;
    private Button repHobby;
    private Button repMajor;
    private Button repRegion;
    // ADD LINKED LIST
    
    
    /**
     * constructor for the GUI
     * creates the GUIWindow
     * 
     * TODO add param to link the list to window
     * @param list singly linked list
     */
    public GUIWindow() {
        window = new Window();
        window.setTitle("Project");
        
        createButtons();
    }
    
    /**
     * creates and displays all the buttons
     */
    private void createButtons() {
        // quit button
        quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        
        // sort by artist button
        sortArt = new Button("Sort by Artist Name");
        sortArt.onClick(this, "clickedSortArt");
        
        // sort by the title
        sortTitle = new Button("Sort by Song Title");
        sortTitle.onClick(this, "clickedSortTitle");
    }

}
