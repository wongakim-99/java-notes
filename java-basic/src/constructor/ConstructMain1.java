package constructor;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstructor member1 = new MemberConstructor("김영웅", 19, 90);
        MemberConstructor member2 = new MemberConstructor("자르반 4세", 55, 90);

        MemberConstructor[] members = {member1, member2};

        for (MemberConstructor s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
