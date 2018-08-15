public class CollegeCourse
{
    private String courseID;
    private int creditHours;
    private String grade;
    public CollegeCourse(String courseID, int creditHours, String grade)
    {
        this.courseID=courseID;
        this.creditHours=creditHours;
        this.grade=grade;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public String getGrade() {
        return grade;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
