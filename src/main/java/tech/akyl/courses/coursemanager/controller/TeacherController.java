package tech.akyl.courses.coursemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.akyl.courses.coursemanager.data.repository.TeacherRepository;

@Controller
public class TeacherController {

    private TeacherRepository repository;

    @Autowired
    public TeacherController(TeacherRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/teachers")
    public String getTeachers(Model model) {

        model.addAttribute("teachers", repository.findAll());

        return "teachers";
    }
}
