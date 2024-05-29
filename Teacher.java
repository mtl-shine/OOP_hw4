public class Teacher extends User implements Comparable<Teacher> {
    private int teacherId;

    public Teacher(int teacherId, String secondName, String firstName, String lastName) {
        super(secondName, firstName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher [teacherId=" + teacherId + " " + super.toString() + "]";
    }

    @Override
    public int compareTo(Teacher o) {
        return Integer.compare(teacherId, o.getTeacherId());
    }

}