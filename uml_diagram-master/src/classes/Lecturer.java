package classes;

import java.util.List;

public class Lecturer extends ResearchAssociate {

    private List<Course> courses;

    public Lecturer(int socialSecurityNumber, String name, String email, String researchArea) {
        super(socialSecurityNumber, name, email, researchArea);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
