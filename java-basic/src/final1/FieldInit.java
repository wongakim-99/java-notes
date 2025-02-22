package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 10;

    public FieldInit() {
        // this.value = value;  // 컴파일 에러! -> 파이널은 값이 한번 세팅되면 그걸로 끝
    }
}
