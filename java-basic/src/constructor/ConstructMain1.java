package constructor;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 객체 생성과 동시에 생성자 호출
        MemberConstructor member1 = new MemberConstructor("김영웅", 26, 80);
        MemberConstructor member2 = new MemberConstructor("김가원", 36, 90);

        MemberConstructor[] members = {member1, member2};

        for (MemberConstructor s: members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
