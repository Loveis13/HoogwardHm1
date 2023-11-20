package school.Hogwargs.service;

import school.Hogwargs.model.Student;

import java.util.Collection;

public interface StudentService {

    Student creat(Student student);

    void read(Long id);

    Student read(long id);

    Student update(Student student);

    Student delete(long id);

    Collection<Student> readByAge(int age);

    Collection<Student> readByAgeBetWeen(int minAge, int maxAge);
}
