package oopKodlamaIoApp.entities;

public class Course {
    private String courseName;
    private int price;

    public Course() {
    }

    public Course(String courseName, int price) {
        this.courseName = courseName;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
