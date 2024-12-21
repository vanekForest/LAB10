package classes;

public class Course {

    private int id;
    private String name;
    private float weeklyDuration;

    public Course(int id, String name, float weeklyDuration) {
        this.id = id;
        this.name = name;
        this.weeklyDuration = weeklyDuration;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float getWeeklyDuration() {
        return this.weeklyDuration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeeklyDuration(float weeklyDuration) {
        this.weeklyDuration = weeklyDuration;
    }

}
