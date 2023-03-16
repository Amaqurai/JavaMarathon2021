package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Fox", "philosophy");
        Teacher teacher = new Teacher("Skally", "chemistry");
        System.out.println(student.getGroupName());
        student.printInfo();
        System.out.println(teacher.getSubjectName());
        teacher.printInfo();
    }
}
