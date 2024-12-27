package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"허준", "김영웅", "김가원"};
        int[] studentAges = {26, 26, 26};
        int[] studentGrades = {90, 20, 56};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrades[i]);
        }
    }
}
