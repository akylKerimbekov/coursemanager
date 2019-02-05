package tech.akyl.courses.coursemanager.core.usecase.teacher;

import tech.akyl.courses.coursemanager.core.domain.Teacher;

import java.util.List;

public interface TeacherRepository {

    List<Teacher> getAll();

    List<Teacher> searchByName(String name);

    Teacher getById(Long id);
}
