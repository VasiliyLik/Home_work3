import java.util.Date;

public class Student extends BaseEntity {
    private final String firstName;
    private final String surName;

    public Student(String firstName, String surName, Date birthDate) {
        super(birthDate);
        this.firstName = firstName;
        this.surName = surName;
        //this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}

