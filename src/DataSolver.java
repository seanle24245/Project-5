import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataSolver {
    private Scanner songScanner;
    private Scanner dataScanner;
    
    
    public DataSolver(String songFile, String dataFile) throws FileNotFoundException {
        songScanner = new Scanner(new File(songFile));
        dataScanner = new Scanner(new File(dataFile));
        
        
    }
    
}
