public class Student
{
    private int studentID;
    private CollegeCourse[] courses = new CollegeCourse[5];
    public Student(int studentID)
    {
        this.studentID=studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public CollegeCourse getCourse(int i) {
        return courses[i];
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setCourses(CollegeCourse course, int i)
    {
        this.courses[i] = course;
    }
}
