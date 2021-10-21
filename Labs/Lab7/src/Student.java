public class Student {
    /*
    Fields
     */
    private Integer studentID;
    private String firstName;
    private String lastName;
    private String fullName;
    private String major;
    private Integer gradePoints;
    private Integer totalCredits;

    /*
    Constructor section
     */
    //Default constructor
    public Student(){
        studentID = 0000;
        firstName = "";
        lastName = "";
        major = "";
        gradePoints = 0;
        totalCredits = 0;
    }
    //Full Constructor
    public Student(Integer id, String fName, String lName, String major, Integer points, Integer credits){
        id = this.studentID;
        fName = this.firstName;
        lName = this.lastName;
        major = this.major;
        points = this.gradePoints;
        credits = this.totalCredits;
    }
    /*
    Getters and Setters Section.
     */
    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getGradePoints() {
        return gradePoints;
    }

    public void setGradePoints(Integer gradePoints) {
        this.gradePoints = gradePoints;
    }

    public Integer getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(Integer totalCredits) {
        this.totalCredits = totalCredits;
    }

    public String fullName(){
        return fullName = firstName + " " + lastName;
    }
    //Change major method. done correctly. prints out invalid attempt
    public void changeMajor(String newMajor, int newPoints, int newCredits){
        if(newPoints >= gradePoints && newCredits >= totalCredits){
            major = newMajor;
        }else{
            System.out.println("Invalid attempt\n");
        }

    }
    //Changes major
    public void changeMajor(String newMajor){
        major = newMajor;
    }

    //toString display method.
    @Override
    public String toString() {
        String s =
                "ID:\t\t\t" + studentID + "\n"
                + "Name:\t\t" + fullName() + "\n"
                + "Major:\t\t" + major + "\n"
                + "Points:\t\t" + gradePoints + "\n"
                + "Credits:\t" + totalCredits+ "\n";
        return s;
    }


}
