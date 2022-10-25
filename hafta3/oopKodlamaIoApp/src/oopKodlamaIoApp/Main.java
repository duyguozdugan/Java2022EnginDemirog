package oopKodlamaIoApp;

import oopKodlamaIoApp.business.CategoryManager;
import oopKodlamaIoApp.business.CourseManager;
import oopKodlamaIoApp.business.TeacherManager;
import oopKodlamaIoApp.core.logging.DatabaseLogger;
import oopKodlamaIoApp.core.logging.FileLogger;
import oopKodlamaIoApp.core.logging.Logger;
import oopKodlamaIoApp.dataAccess.HibernateCourseDao;
import oopKodlamaIoApp.dataAccess.JdbcCategoryDao;
import oopKodlamaIoApp.dataAccess.JdbcTeacherDao;
import oopKodlamaIoApp.entities.Category;
import oopKodlamaIoApp.entities.Course;
import oopKodlamaIoApp.entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {

        Course course = new Course("Java", 120);
        Course course1= new Course("Java",230);
        Category category = new Category("Programlama");
        Teacher teacher = new Teacher();
        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course);
        courseManager.add(course1);
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category);
        TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers);
        teacherManager.add(teacher);

    }
}
