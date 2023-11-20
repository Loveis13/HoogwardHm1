package school.Hogwargs.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.Hogwargs.model.Faculty;
import school.Hogwargs.model.Student;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Collection<Student> findAllByAge(int age);

    Collection<Student> findByAgeBetween(int minAge,int maxAge);
    Collection<Student> findAllByNameIgnoreCaseOrColorIgnoreCase(String name);
}
