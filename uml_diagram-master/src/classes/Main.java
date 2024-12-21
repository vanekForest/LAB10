package classes;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Faculty computerScience = new Faculty("Computer Science Faculty",
                new Employee(1, "Name", "cs@vsu.ru") {
        });
        Institute institute = new Institute("VSU", "Universitetskaya 1");
        computerScience.addInstitute(institute);
        university.addFaculty(computerScience);
        System.out.println(university);
    }
}
