public class Professor extends Person {

    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }
    
    @Override
    public int getParticipatingHours(int courseHours) {
        int labHours = (courseHours > 4) ? 2 : 1;
        return courseHours - labHours;  // Professors attend only lecture hours
    }

    @Override
    public String getTitle() {
        return "Professor";
    }
}