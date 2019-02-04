package tech.akyl.courses.coursemanager.core.domain;

import java.util.List;

public class Teacher {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Skill> skills;
    private List<Schedule> schedules;
}
