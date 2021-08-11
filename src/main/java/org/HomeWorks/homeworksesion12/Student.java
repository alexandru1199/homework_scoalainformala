package org.HomeWorks.homeworksesion12;

import java.time.LocalDate;

public class Student {
    private String firstName,lastName,ID,gender;
    private LocalDate dob;



    public Student(String firstName, String lastName, String ID, String gender, LocalDate dob) {

   if(ID.isEmpty()){
       throw  new IllegalArgumentException("the id cant be empty");
   }
   else {
       this.ID = ID;
   }
        if(firstName.isEmpty()|| lastName.isEmpty()){
            throw new IllegalArgumentException("the name and last name shouldnt be empty!");
        }
        else{
            this.firstName = firstName;
            this.lastName = lastName;
        }
        if(gender.equalsIgnoreCase("M")||gender.equalsIgnoreCase("F")){
         this.gender=gender;
        }
        else{
            throw new IllegalArgumentException("the gender must be M or F");
        }
        if(dob.getYear()<1900||dob.getYear()>LocalDate.now().getYear()-18)
            throw new ArithmeticException("The student must be 18 years old");
            else {
            this.dob = dob;
        }
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
    public  int getAge(){
        return LocalDate.now().getYear()-getDob().getYear();
    }
}
