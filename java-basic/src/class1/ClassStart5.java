package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "허준";
        student1.age = 26;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "김승찬";
        student2.age = 25;
        student2.grade = 20;

        Student student3 = new Student();
        student3.name = "한민제";
        student3.age = 27;
        student3.grade = 14;

        Student[] students = { student1, student2, student3 };

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }

        for (Student s : students) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }
}
