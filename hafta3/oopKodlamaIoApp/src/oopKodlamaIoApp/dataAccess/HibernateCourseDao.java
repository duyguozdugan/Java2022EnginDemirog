package oopKodlamaIoApp.dataAccess;

import oopKodlamaIoApp.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Kurs Hiberbate ile veri tabanına eklendi.");
    }
}
