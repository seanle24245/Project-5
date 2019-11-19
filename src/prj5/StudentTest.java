package prj5;

import student.TestCase;
/**
 * Tests for the Student class
 * 
 * @author Ryan Bui (ryantb)
 * @author Sean Le (sean2022)
 * @author Christina Tran (christinatran)
 * 
 * @version 2019.11.17
 *
 */
public class StudentTest extends TestCase {
    Student student;
    
    /**
     * setup to initialize student
     */
    public void setUp() {
        student = new Student("music", "northeast", "CMDA", 123);
    }
    
    /**
     * tests getting the hobby
     */
    public void testGetHobby() {
        assertEquals("music", student.getHobby());
    }
    
    /**
     * tests getting the region
     */
    public void testGetRegion() {
        assertEquals("northeast", student.getRegion());
    }
    
    /**
     * tests getting the major
     */
    public void testGetMajor() {
        assertEquals("CMDA", student.getMajor());
    }
    
    /**
     * tests getting the ID
     */
    public void testGetID() {
        assertEquals(123, student.getStudentID());
    }
    
    /**
     * tests getting the responses
     */
    public void testGetResponses() {
        assertEquals(new int[140].length, student.getResponses().length);
    }
    
    /**
     * tests adding the responses
     */
    public void testsAddResponse() {
        student.addResponse("Yes");
        assertEquals(student.getResponses()[0], 1);
    }
}
