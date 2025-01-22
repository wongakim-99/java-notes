package pack;

import pack.a.*;

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();  // 둘이 같은 패키지 안에 있으면 클래스를 불러서 사용해도 된다.
        User user = new User();
        User2 user2 = new User2();
    }
}
