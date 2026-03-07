package week_1;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private int age;
    private ArrayList<Course> listCourse;

    public Student(int age, String id, String name) {
        this.age = age;
        this.id = id;
        this.listCourse = new ArrayList<>();
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Course> getListCourse() {
        return listCourse;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course){
        listCourse.add(course);
    }

    public void displayCouse(){
        System.out.println("Name: " + name + "\n" + "Student id: " + id + "\n" + id + "\n" + "Age: " + age + "\n" + "List Course: ");
        for (Course course : listCourse) {
            course.cousreInfo() ;
        }
    }
}
