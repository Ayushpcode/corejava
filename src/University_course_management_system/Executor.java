package University_course_management_system;

public class Executor {
    public static void main(String[] args) {
     Course course = new Course(4012,"Bachlor of computer application");
     Professor professor = new Professor("Subham sir", "Digital electronics");
     TeacherAssistant teacherAssistant = new TeacherAssistant("Sd sir" , "all in one");

     Student student1 = new Student(1001 , "Aryan");
     Student student2 = new Student(1003 , "Shreyoshi");

     course.enrollStudent(student1);
     professor.assignGrade(student1,85.6);
     teacherAssistant.assistStudent(student2);
    }
}
