package prj5;

public class Student {
    private String hobby;
    private String region;
    private String major;
    private int studentID;
    private int [] responses;
    private int responseIndex;
    
    /**
     * the constructor of the student class
     * 
     * @param hobby the hobby of the student
     * @param region the region from where the student is from
     * @param major the major the student is
     * @param studentID the studentID 
     */
    public Student(String hobby, String region, String major, int studentID) {
        this.hobby = hobby;
        this.region = region;
        this.major = major;
        this.studentID = studentID;
        this.responseIndex = 0;
        this.responses = new int[140];
    }
    
    /**
     * gets the hobby of the student
     * @return the hobby name
     */
    public String getHobby() {
        return hobby;
    }
    
    /**
     * gets from where the student is from
     * @return the region name
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * gets the major of the student
     * @return the major name
     */
    public String getMajor() {
        return major;
    }
    
    /**
     * gets the student id of the student
     * @return the ID number
     */
    public int getStudentID() {
        return studentID;
    }
    
    /**
     * the number of responses 
     * @param s if yes no or blank
     */
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
