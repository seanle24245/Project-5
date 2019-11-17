package prj5;

public class Student {
    private String hobby;
    private String region;
    private String major;
    private int studentID;
    private int [] responses;
    private int responseIndex;
    
    
    public Student(String hobby, String region, String major, int studentID) {
        this.hobby = hobby;
        this.region = region;
        this.major = major;
        this.studentID = studentID;
        this.responseIndex = 0;
        this.responses = new int[140];
    }
    
    public String getHobby() {
        return hobby;
    }
    
    public String getRegion() {
        return region;
    }
    
    public String getMajor() {
        return major;
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    public void addResponse(String s) {
        if (s.equals("Yes")) {
            responses[responseIndex] = 1;
        }
        else if(s.equals("No")) {
            responses[responseIndex] = 0;
        }
        else if (s.equals("")) {
            responses[responseIndex] = -1;
        }
        
        responseIndex++;
    }
    
}
