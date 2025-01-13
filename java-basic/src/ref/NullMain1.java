package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);  // data = null

        data = new Data();
        System.out.println("2. data = " + data);  // 새로운 객체를 생성했으니 가리키는 참조값이 있을 것이다.

        data = null;
        System.out.println("3. data = " + data);
    }
}
