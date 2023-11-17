package school.Hogwargs.service;

import school.Hogwargs.model.Student;

import java.util.Collection;

public interface StudentService {

    Student creat(Student student);

    Student read(Long id);

    Student update(Student student);

    Student delete(long id);

    Collection<Student> readByAge(int age);
}
