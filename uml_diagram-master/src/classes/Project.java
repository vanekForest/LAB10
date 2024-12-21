package classes;

import java.time.LocalDate;

public class Project {

    private String name;
    private LocalDate startingDate;
    private LocalDate endDate;

    public Project(String name, LocalDate startingDate, LocalDate endDate) {
        this.name = name;
        this.startingDate = startingDate;
        this.endDate = endDate;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getStartingDate() {
        return this.startingDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

}
