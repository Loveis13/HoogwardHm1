package school.Hogwargs.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.Hogwargs.model.Faculty;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {
    Collection<Faculty> findAllByColor(String color);
    Collection<Faculty> findAllByNameIgnoreCaseOrColorIgnoreCase(String name,String color);
}
