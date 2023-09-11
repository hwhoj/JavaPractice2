package PracticeJava;

public class BooleanTest1 {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;

        flag1 = 10 > 5;
        flag2 = 10 < 5;
        flag3 = 10 >= 10;
        flag4 = 10 <= 10;
        flag5 = 10 == 10;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);

        boolean blag1 = false;
        boolean blag2 = false;
        boolean blag3 = false;
        boolean blag4 = false;
        boolean blag5 = false;
        boolean blag6 = false;

        blag1 = 10 > 5 && 5 < 20;
        blag2 = 10 > 5 & 5 < 20;
        blag3 = 10 >= 10 || 5 > 6;
        blag4 = 10 >= 10 | 5 > 6;
        blag5 = 10 == 10 ^ 5 == 4;
        blag6 = !blag5;

        System.out.println(blag1);
        System.out.println(blag2);
        System.out.println(blag3);
        System.out.println(blag4);
        System.out.println(blag5);
        System.out.println(blag6);
    }
}
