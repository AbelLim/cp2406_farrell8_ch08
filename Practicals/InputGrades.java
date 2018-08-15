import java.util.Scanner;

public class InputGrades
{
    public static void main(String args[])
    {
        final String[] GRADES = {"A", "B", "C", "D", "E", "F"};
        Student[] students = new Student[10];
        Scanner scanner = new Scanner(System.in);
        int studentID;
        String courseID="string";
        int creditHours;
        String grade;
        boolean isGradeCorrect;

        for(int i=0;i<students.length;i++)
        {
            System.out.println("Enter ID for student #" + (i+1) + ": ");
            studentID = scanner.nextInt();
            students[i] = new Student(studentID);
            for(int j=0; j<5; ++j)
            {
                System.out.println("Enter course ID #" + (j+1) + ": ");
                courseID=scanner.next();
                System.out.println("Enter the credit hours for " + courseID + ": ");
                creditHours=scanner.nextInt();
                System.out.println("Enter the grade for " + courseID + ": ");
                grade=scanner.next();
                isGradeCorrect=false;
                while(!isGradeCorrect)
                {
                    for(int x=0;x<GRADES.length;++x)
                    {
                        if(grade.toUpperCase().equals(GRADES[x])) {
                            isGradeCorrect = true;
                        }
                    }
                    if(!isGradeCorrect)
                    {
                        System.out.println("Invalid grade. Enter the grade for " + courseID + ": ");
                        grade=scanner.nextLine();
                    }
                }
                students[i].setCourses(new CollegeCourse(courseID,creditHours,grade.toUpperCase()),j);
            }
        }
    }
}
