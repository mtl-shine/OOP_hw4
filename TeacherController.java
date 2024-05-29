import java.util.ArrayList;

public class TeacherController implements UserController<Teacher> {
    TeacherGroup mathTeachers = new TeacherGroup(new ArrayList<>());
    TeacherView<Teacher> teacherview = new TeacherView<Teacher>();
    TeacherGroupService<TeacherGroup> service = new TeacherGroupService<TeacherGroup>(mathTeachers);

    @Override
    public void create(String secondName, String firstName, String lastName) {
        int maxId = 1;
        if (!mathTeachers.getTeacherList().isEmpty()) {
            maxId = mathTeachers.getTeacherList().size() + 1;
        }
        Teacher teacher = new Teacher(maxId, secondName, firstName, lastName);
        mathTeachers.addTeacher(teacher);
    }

    public void change(int teacherId, String secondName, String firstName, String lastName) {
        Teacher newFIO = new Teacher(teacherId, secondName, firstName, lastName);
        mathTeachers.getTeacherList().set(teacherId - 1, newFIO);
    }

    void printTeacherList() {
        teacherview.sendOnConsole(mathTeachers.getTeacherList());
    }

    void printSortedTeacherList() {
        teacherview.sendOnConsole(service.getSortedTeacherGroupByFIO());
    }

}
