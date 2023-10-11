package org.example.srp;

public class Student {
    private String name;
    private String email;
    private String start;
    private String averagePrice;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(String averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Student(String email, String start, String averagePrice) {
        this.email = email;
        this.start = start;
        this.averagePrice = averagePrice;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{email='%s', start='%s', averagePrice='%s'}".
        formatted(email, start, averagePrice);
    }
}

