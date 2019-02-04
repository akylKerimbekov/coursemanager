package tech.akyl.courses.coursemanager.core.domain;

import javax.validation.constraints.Size;
import java.util.List;

public class Company {
    private Long id;
    private String name;
    private List<Teacher> stuff;
}
