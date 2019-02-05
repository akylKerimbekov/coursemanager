package tech.akyl.courses.coursemanager.core.usecase.teacher;

import tech.akyl.courses.coursemanager.core.domain.Teacher;

import java.util.List;

public class SearchByNameTeacherUseCase {

    private TeacherRepository repository;

    public SearchByNameTeacherUseCase(TeacherRepository repository) {
        this.repository = repository;
    }

    public List<Teacher> searchByName(String name) {
        return repository.searchByName(name);
    }
}
