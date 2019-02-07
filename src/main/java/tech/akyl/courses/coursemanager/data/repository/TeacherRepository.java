package tech.akyl.courses.coursemanager.data.repository;

import org.springframework.data.repository.CrudRepository;
import tech.akyl.courses.coursemanager.data.entity.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}
