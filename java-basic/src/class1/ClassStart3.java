package class1;

public class ClassStart3 {
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

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);
        System.out.println("이름 : " + student3.name + " 나이 : " + student3.age + " 성적 : " + student3.grade);
    }
}
