package oopKodlamaIoApp.dataAccess;

import oopKodlamaIoApp.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Öğretmen Hiberbate ile veri tabanına eklendi.");
    }
}
