package prj5;

/**
 * The Student class that represents the students who fill out the survey
 * responses.
 * 
 * @author Ryan Bui (ryantb)
 * @author Sean Le (sean2022)
 * @author Christina Tran (christinatran)
 * 
 * @version 2019.11.17
 *
 */
public class Student {
    private String hobby;
    private String region;
    private String major;
    private int studentID;
    private int[] responses;
    private int responseIndex;

    /**
     * the constructor of the student class
     * 
     * @param hobby     the hobby of the student
     * @param region    the region from where the student is from
     * @param major     the major the student is
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
     * 
     * @return the hobby name
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * gets from where the student is from
     * 
     * @return the region name
     */
    public String getRegion() {
        return region;
    }

    /**
     * gets the major of the student
     * 
     * @return the major name
     */
    public String getMajor() {
        return major;
    }

    /**
     * gets the student id of the student
     * 
     * @return the ID number
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * TODO
     * 
     * @return The array of integer values indicating the responses to the
     *         survey.
     */
    public int[] getResponses() {
        return responses;
    }

    /**
     * the associated number of each individual, unique response
     * 
     * responses[] array only holds "Yes", "No" or blank "". Each response
     * corresponds to a particular song by its index.
     * 
     * @param str if yes no or blank
     */
    public void addResponse(String str) {
        if (str.equals("Yes")) {
            responses[responseIndex] = 1;
        } else if (str.equals("No")) {
            responses[responseIndex] = 0;
        } else if (str.equals("")) {
            responses[responseIndex] = -1;
        }

        responseIndex++;
    }

}
