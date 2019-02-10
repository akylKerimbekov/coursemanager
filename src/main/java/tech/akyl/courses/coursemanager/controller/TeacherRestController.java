package tech.akyl.courses.coursemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.akyl.courses.coursemanager.data.entity.Teacher;
import tech.akyl.courses.coursemanager.data.repository.TeacherRepository;

import java.util.List;

@RestController
public class TeacherRestController {
    private TeacherRepository repository;

    public TeacherRestController(TeacherRepository repository) {
        this.repository = repository;
    }

    @GetMapping("api/v1/teachers")
    public List<Teacher> getAll() {
        return (List<Teacher>) repository.findAll();
    }
}
