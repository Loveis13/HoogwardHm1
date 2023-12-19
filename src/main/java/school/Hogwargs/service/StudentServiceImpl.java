package school.Hogwargs.service;

import org.springframework.stereotype.Service;
import school.Hogwargs.exception.StudentNotFoundException;
import school.Hogwargs.model.Student;
import school.Hogwargs.respository.StudentRepository;

import java.util.Collection;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }



    @Override
    public Student creat(Student student) {
       return repository.save(student);
        }

    @Override
    public void read(Long id) {

    }


    @Override
    public Student read(long id) {
       return repository.findById(id).orElseThrow(()->
                new StudentNotFoundException("Студент с id" + id + "не найден в хранилище"));
    }


    @Override
    public Student update(Student student) {
         read(student.getId());
         return repository.save(student);
    }

    @Override
    public Student delete(long id) {
        Student student = read(id);
        repository.delete(student);
        return student;
    }

    @Override
    public Collection<Student> readByAge(int age) {
        return repository.findAllByAge(age);

    }
    @Override
    public Collection<Student> readByAgeBetWeen(int minAge, int maxAge){
        return repository.findByAgeBetween(minAge,maxAge);
    }
}
