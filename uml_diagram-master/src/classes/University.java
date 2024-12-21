package classes;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Faculty> faculties = new ArrayList<>();

    public University() {
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return this.faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "faculties=" + faculties +
                '}';
    }
}
