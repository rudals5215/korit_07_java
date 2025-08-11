package ch16_objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String school;

    // AllArgsConstructor 정의
    public Teacher(String name, String school) {
        this.name = name;
        this.school = school;
    }

    // getter / setter 정의
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(school, teacher.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, school);
    }
}
