import java.util.List;

public class TeacherView <T extends Teacher> { 
// т.к. необходимо было сделать именно TeacherView, то здесь используется допущение, что у Teacher будут наследники, вроде TeacherBiology
    void sendOnConsole(List<T>teachers){
        for (T teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
