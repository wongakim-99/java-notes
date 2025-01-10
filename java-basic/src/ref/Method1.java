package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();   // x001
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();  // x002
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;  //x001.name  or  x002
        student.age = age;  //x001.age  or  x002
        student.grade = grade;  //x001.grade  or  x002
    }

    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}
