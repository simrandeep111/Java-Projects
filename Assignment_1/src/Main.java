public class Main {
    public static void main(String[] args) {
        // Input data
        String input = "Professor Isaac Newton Physics 6\n" +
                       "TA Marie Curie Physics 6\n" +
                       "Professor Isaac Newton Calculus 4\n" +
                       "Student Amy Adams Calculus 4\n" +
                       "Student Will Smith Calculus 4\n" +
                       "Student Brad Pitt Physics 6\n" +
                       "Student Will Smith Physics 6\n" +
                       "Professor Dmitri Mendeleev Chemistry 6\n" +
                       "TA Carl Gauss Calculus 4\n" +
                       "Student Amy Adams Economics 3\n" +
                       "Professor Adam Smith Economics 3\n" +
                       "TA Marie Curie Chemistry 6\n" +
                       "Student Brad Pitt Chemistry 6\n" +
                       "Student Will Smith Chemistry 6";
        
        // Maximum number of people we might have
        Person[] people = new Person[20];
        int peopleCount = 0;
        
        // Process the input
        String[] lines = input.split("\n");
        for (String line : lines) {
            String[] parts = line.split(" ");
            
            String title = parts[0];
            String firstName = parts[1];
            String lastName = parts[2];
            // Ignore the course name at parts[3]
            int courseHours = Integer.parseInt(parts[4]);
            
            // Find if the person already exists or create a new one
            Person person = findPerson(people, peopleCount, title, firstName, lastName);
            if (person == null) {
                switch (title) {
                    case "Professor":
                        person = new Professor(firstName, lastName);
                        break;
                    case "TA":
                        person = new TA(firstName, lastName);
                        break;
                    case "Student":
                        person = new Student(firstName, lastName);
                        break;
                }
                people[peopleCount++] = person;
            }
            
            // Add the course hours to the person's total
            person.addCourseHours(courseHours);
        }
        
        // Print the results
        System.out.println("Title FirstName LastName TotalHours");
        for (int i = 0; i < peopleCount; i++) {
            Person person = people[i];
            System.out.println(person.getTitle() + " " + 
                             person.getFirstName() + " " + 
                             person.getLastName() + " " + 
                             person.getTotalHours());
        }
    }
    

    private static Person findPerson(Person[] people, int count, String title, String firstName, String lastName) {
        for (int i = 0; i < count; i++) {
            Person person = people[i];
            if (person.getFirstName().equals(firstName) && 
                person.getLastName().equals(lastName) && 
                person.getTitle().equals(title)) {
                return person;
            }
        }
        return null;
    }
}