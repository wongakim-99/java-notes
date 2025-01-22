package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();  // 둘이 같은 패키지 안에 있으면 클래스를 불러서 사용해도 된다.
        pack.a.User user = new pack.a.User();
    }
}
