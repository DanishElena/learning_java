package com.helena;


public class Student {
    public int id;
    public String lastName;
    public String firstName;
    public String middleName;
    public int yearBirth;
    public String address;
    public int course;
    public String group;
    public String phoneNumber;
    public String faculty;
    public int[] rating;


    public Student(int id, String firstName, String middleName, String lastName, int yearBirth, String address, String phoneNumber, String faculty, int course, String group, int[] rating) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.yearBirth = yearBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.rating = rating;


        setId(id);
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setYearBirth(yearBirth);
        setPhoneNumber(phoneNumber);
        setFaculty(faculty);
        setCourse(course);
        setGroup(group);
        setAddress(address);
        setRating(rating);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int [] getRating() {
        return rating;
    }

    public void setRating(int rating []) {
        this.rating = rating;
    }



    public String toString() {
        return "Student id = " + id + ", ФИО: " + lastName + " " + firstName + " " +  middleName;
    }
}










