package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();

        valueData.add();  // 이제 필드의 멤버 변수 뿐만 아니라 메서드도 사용 가능
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 = " + valueData.value);
    }
}
