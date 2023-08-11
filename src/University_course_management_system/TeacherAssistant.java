package University_course_management_system;

public class TeacherAssistant extends Faculty{
    private String course;

    public TeacherAssistant(String name, String course) {
        super(name);
        this.course = course;
    }

    public void assistStudent(Student student){
    }
}
