public class Student extends Person {

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours;  // Students must attend all hours
    }

    @Override
    public String getTitle() {
        return "Student";
    }
}