package final2;

public class PersonFinalExample {
    public static void main(String[] args) {
        // 기본형 변수에 final 적용
        final int age = 20;
        // age = 30;  // 오류 발생 (값 변경 불가)

        // 참조형 변수1 -> final 선언x
        Person person1 = new Person("김가원");
        System.out.println("person1 name is = " + person1.name);

        person1 = new Person("김호준");
        System.out.println("person1 name is = " + person1.name);

        // 참조형 변수2 -> final 선언o
        final Person person2 = new Person("김진교");
        System.out.println("person2 name is = " + person2.name);

        // person2 = new Person("김승찬");  -> 오류 발생(참조값 변경 불가)
        person2.name = "김승찬";  // -> 그러나 객체 내부 속성은 변경 가능
        System.out.println("person2 name is = " + person2.name);

        // final 은 기본형에서는 "값 변경 불가", 참조형에서는 "참조값 변경 불가"
    }
}
