package prj5;

import CS2114.TextShape;
import CS2114.Button;
import CS2114.Shape;
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
    private TextShape[] titles;
    private TextShape[] artist;
    private Shape[] heard;
    private Shape[] likes;
    private Shape[] poles;
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
        
        addGlyphs();
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
        
        // sort by the year
        sortYear = new Button("Sort by Release Year");
        sortYear.onClick(this, "clickedSortYear");
        
        // sort by the genre
        sortGenre = new Button("Sort by Genre");
        sortGenre.onClick(this, "clickedSortGenre");
        
        // represent by hobby
        repHobby = new Button("Represent Hobby");
        repHobby.onClick(this, "clickedRepHobby");
        
        // represent by major
        repMajor = new Button("Represent Major");
        repMajor.onClick(this, "clickedRepMajor");
        
        // represent by region
        repRegion = new Button("Represent Region");
        repRegion.onClick(this, "clickedRepRegion");
        
        // next button
        nextButton = new Button("Next");
        nextButton.onClick(this, "clickedNext");
        
        // previous button
        prevButton = new Button("Prev");
        prevButton.onClick(this, "clickedPrev");
        
        // north side buttons
        window.addButton(prevButton, WindowSide.NORTH);
        window.addButton(sortArt, WindowSide.NORTH);
        window.addButton(sortTitle, WindowSide.NORTH);
        window.addButton(sortYear, WindowSide.NORTH);
        window.addButton(sortGenre, WindowSide.NORTH);
        window.addButton(nextButton, WindowSide.NORTH);
        
        // south side buttons
        window.addButton(repHobby, WindowSide.SOUTH);
        window.addButton(repMajor, WindowSide.SOUTH);
        window.addButton(repRegion, WindowSide.SOUTH);
        window.addButton(quitButton, WindowSide.SOUTH);
    }
    
    /**
     * creates glyphs and adds them to certain areas
     */
    private void addGlyphs() {    
        
        /**
         * the default glyph value (pole)
         * the the value to increment each glyph (pole)
         */
        int defaultXPole = 125;
        int defaultYPole = 60;
        int incrementX = 300;
        int incrementY = 200;
        int height = 60;
        int width = 10;
        
        // TEMP HARD CODE POLE
        Shape temp1 = new Shape(defaultXPole, defaultYPole,
                width, height, Color.BLACK);
        window.addShape(temp1);
        
        // TEMP HARD CODE TEXTSHAPE
        TextShape topText = new TextShape(130, 10, "Song Title");
        TextShape bottomText = new TextShape(130, 30, "Artist Name");
        window.addShape(topText);
        window.addShape(bottomText);
        
        //center the TextShape, change it under for loop in the future
        centerText(topText, bottomText);
        
        // create poles
        poles = new Shape[9];
        System.out.println(Integer.toString(poles.length));
        for (int i = 0; i < poles.length; i++) {
            for (int j = 0; j < 3; j++) { // rows
                poles[i + j] = new Shape(defaultXPole + (j * incrementX), 
                        defaultYPole + ((i / 3) * incrementY), 
                        width, height, Color.BLACK);
            } // end row for loop
        } // end pole for loop
        
        // adds poles to window
        for (int i = 0; i < poles.length; i++) {
            window.addShape(poles[i]);
        }
        
        /**
         * TODO 
         * ERROR IN THE FOR LOOP CAUSING GLYPHS TO NOT INTIALIZE
         */
        
        /**
         * the default glyph value (title and artist)
         * the the value to increment each glyph (title and artist)
         */
        int defaultX = 130;
        int defaultY = 10;
        
        //creates the text shapes for the title and artist
        titles = new TextShape[9]; // TODO 9 is temp, but should be total songs
        artist = new TextShape[9];
        
        // for loop to create TextShapes
        for (int i = 0; i < titles.length; i++) { // the number of songs that there are
            for (int j = 0; j < 3; j++) { // 3 for each row
                titles[i + j] = new TextShape(defaultX + (j * incrementX),
                        defaultY + (j * incrementY), "Song Title" + (i + j));
                artist[i + j] = new TextShape(defaultX + (j * incrementX),
                        defaultY + (j * incrementY) + 30, "Artist Name" + (i + j));
            } //end for loop for each row of TextShape
        } //end for loop for adding shapes
        
        //adding shapes to the window
        for (int i = 0; i < titles.length; i++) {
            window.addShape(titles[i]);
            window.addShape(artist[i]);
        } // end for
    } // end add glyphs
    
    /**
     * this centers the text boxes to the glyph
     * 
     * @param title the title textshape to be centered
     * @param artist the artist textshape to be centered
     */
    private void centerText(TextShape title, TextShape artist) {
        // centers title TextShape
        int titleLength = title.getText().length();
        int newX = title.getX() - ((titleLength / 2) * 7);
        title.setX(newX);
        
        int artLength = artist.getText().length();
        int aNewX = artist.getX() - ((artLength / 2) * 8);
        artist.setX(aNewX);
    }
    
    // CREATE SOMETHING TO ADD LEFT SIDE OF POLE
    private void addHeard() {
        int defaultX = 25;
        int defaultY = 60;
        int height = 15;
        int defaultWidth = 100;
    }
    
    // CREATE SOMETHING TO ADD TO RIGHT SIDE OF POLE

    /**
     * quits button
     * 
     * @param quit quits the window
     */
    public void clickedQuit(Button quit) {
        System.exit(0);
    }
}
