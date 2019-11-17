
public class Song {
    private String title;
    private String genre;
    private int year;
    private int amountOfYes;
    private int totalResponses;
    private int[] hobbyData;
    private int[] regionData;
    private int[] majorData;
    public static final int ARRAY_SIZE = 16;
    public Song(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.amountOfYes = 0;
        this.totalResponses = 0;
        hobbyData = new int[ARRAY_SIZE];
        regionData = new int[ARRAY_SIZE];
        majorData = new int[ARRAY_SIZE];
        
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public int getYear() {
        return year;
    }
    
    public double calcPercentage() {
        return (double)(amountOfYes/totalResponses);
    }
    
    public int getHobbyData(int x) {
        return hobbyData[x];
    }
    
    public int getRegionData(int x) {
        return regionData[x];
    }
    
    public int getMajorData(int x) {
        return majorData[x];
    }
    
    public void incrementCounts(String s) {
        if (s.equals("Yes")) {
            amountOfYes++;
            totalResponses++;
        }
        else {
            totalResponses++;
        }
    }
    
  
    
    
    
}
