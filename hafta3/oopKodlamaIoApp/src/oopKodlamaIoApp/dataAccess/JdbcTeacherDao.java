package oopKodlamaIoApp.dataAccess;

import oopKodlamaIoApp.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Öğretmen JDBC ile veri tabanına eklendi.");
    }
}
