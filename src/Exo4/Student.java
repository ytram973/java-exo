package Exo4;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> grades;

    public Student(String firstName, String lastName, ArrayList<Double> grades) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (grades != null) {
            this.grades = new ArrayList<>(grades);
        } else {
            this.grades = new ArrayList<>();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Double> getGrades() {
        return new ArrayList<>(grades);
    }

    public double getAverage() {
        return GradesUtils.average(grades);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | Average: " + String.format("%.2f", getAverage());
    }
}
