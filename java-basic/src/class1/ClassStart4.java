package class1;

public class ClassStart4 {
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

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);
        System.out.println("이름 : " + students[2].name + " 나이 : " + students[2].age + " 성적 : " + students[2].grade);
    }
}
