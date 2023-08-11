package University_course_management_system;

public class Course {
    private int code;
    private String title;
    //private List<Student> enrollStudent;


    public Course(int code, String title) {
        this.code = code;
        this.title = title;
        //this.enrollStudent = new ArrayList<>();
    }

    public void enrollStudent(Student student){
        //enrollStudent.add(student);
    }
}
