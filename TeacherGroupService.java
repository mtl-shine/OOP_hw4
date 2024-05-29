import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherGroupService<T extends TeacherGroup> {
    private T teacherGroup;

    public TeacherGroupService(T teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public List<Teacher> getSortedTeacherGroup() {
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
        Collections.sort(teacherList);
        return teacherList;
    }

    public List<Teacher> getSortedTeacherGroupByFIO() {
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
        teacherList.sort(new UserComparator<Teacher>());
        return teacherList;
    }

}
