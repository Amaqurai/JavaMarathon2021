package day6;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public String getLesson() {
        return lesson;
    }

    public void evaluate(Student student) {
        int random = (int) (Math.random() * (6 - 2)) + 2;
        String grade = null;

        switch (random) {
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "отлично";
                break;
        }

        System.out.printf("Преподаватель %s " +
                        "оценил студента с именем %s " +
                        "по предмету %s на оценку %s.",
                getName(), student.getName(), getLesson(), grade);
    }
}
