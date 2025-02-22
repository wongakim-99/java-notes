package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructorInit constructorInit1 = new ConstructorInit(10);
        ConstructorInit constructorInit2 = new ConstructorInit(20);
        ConstructorInit constructorInit3 = new ConstructorInit(10);

        System.out.println(constructorInit1.value);
        System.out.println(constructorInit2.value);
        System.out.println(constructorInit3.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수
        System.out.println("상수");
        System.out.println(fieldInit1.CONST_VALUE);
    }
}
