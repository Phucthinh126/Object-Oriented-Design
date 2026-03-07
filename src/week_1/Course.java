package week_1;

public class Course {
   private String courseName;
   private String courseId;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public  void cousreInfo(){
        System.out.println("Course name: " + courseName + "\t" + "Course Id: " + courseId );

    }

}
