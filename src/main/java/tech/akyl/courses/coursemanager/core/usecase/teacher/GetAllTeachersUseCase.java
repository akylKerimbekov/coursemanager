package tech.akyl.courses.coursemanager.core.usecase.teacher;

import tech.akyl.courses.coursemanager.core.domain.Teacher;

import java.util.List;

public class GetAllTeachersUseCase {

    private TeacherRepository repository;

    public GetAllTeachersUseCase(TeacherRepository repository) {
        this.repository = repository;
    }

    public List<Teacher> getAll() {
        return repository.getAll();
    }
}
