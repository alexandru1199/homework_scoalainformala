package org.HomeWorks.homeworksesion12;

import java.time.LocalDate;

public class Student {
    private String firstName,lastName,ID,gender;
    private LocalDate dob;



    public Student(String firstName, String lastName, String ID, String gender, LocalDate dob) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.gender = gender;
        this.dob = dob;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
