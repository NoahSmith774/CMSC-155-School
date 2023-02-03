public class Course {
    //instance variables
    private String department;
    private int courseNum;
    private int creditHrs;

    //constructor
    public Course(String department, int courseNum, int creditHrs) {
        this.department = department;
        this.courseNum = courseNum;
        this.creditHrs = creditHrs;
    }

    //toString method
    public String toString() {
        return department + " offers " + courseNum + " and has " + creditHrs + " credit hours.";
    }

}
