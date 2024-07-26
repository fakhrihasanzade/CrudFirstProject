public class Main {
    public static void main(String[] args) {

        StudentService student=new StudentService();
        student.create();
        student.read();
        student.update();
        student.delete();

        TeacherService teacher=new TeacherService();
        teacher.create();
        teacher.read();
        teacher.update();
        teacher.delete();

    }
}