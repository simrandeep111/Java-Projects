// Abstract class representing a person in the college department system

public abstract class Person implements ParticipateHours {
    private String firstName;
    private String lastName;
    private int totalHours;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalHours = 0;
    }
    

    public void addCourseHours(int courseHours) {
        this.totalHours += getParticipatingHours(courseHours);
    }
    

    public String getFirstName() {
        return firstName;
    }
    

    public String getLastName() {
        return lastName;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public abstract String getTitle();
}