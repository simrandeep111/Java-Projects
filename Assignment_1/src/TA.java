public class TA extends Person {
    public TA(String firstName, String lastName) {
        super(firstName, lastName);
    }
    

    @Override
    public int getParticipatingHours(int courseHours) {
        return (courseHours > 4) ? 2 : 1;  // TAs conduct only lab hours
    }

    @Override
    public String getTitle() {
        return "TA";
    }
}