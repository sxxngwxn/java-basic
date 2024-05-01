package ref;

public class Method {
    public static void main(String[] args) {
        Student student1 = createStuedent("학생1", 15, 90);
        Student student2 = createStuedent("학생2", 16, 80);

        System.out.println(student1.name);
        System.out.println(student2.name);
    }

    static Student createStuedent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }
}
