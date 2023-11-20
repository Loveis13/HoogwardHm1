package school.Hogwargs.controller;

import org.springframework.web.bind.annotation.*;
import school.Hogwargs.model.Student;
import school.Hogwargs.service.StudentService;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentService.creat(student);
    }

    @GetMapping("/{id}")
    public Student read(@PathVariable long id) {
        return studentService.read(id);
    }

    @PutMapping
    public Student update(@RequestBody Student student) {
        return studentService.update(student);
    }

    @DeleteMapping("/{id}")
    public Student delete(@PathVariable long id) {
        return studentService.delete(id);
    }

    @GetMapping("/age")
    public Collection<Student> readByAgeBetWeen(@RequestParam int minAge,int maxAge){
        return studentService.readByAgeBetWeen(minAge,maxAge);
    }

    @GetMapping
    public Collection<Student> readByAge(@RequestParam int age) {
        return studentService.readByAge(age);
    }
}


