package PracticeJava;

public class MyProfile {
    //클래스 이름은 대문자로 시작되어야 한다.
    public static void main(String[] args) {
        //메인메소드 = 프로그램 시작점.
        //JVM(자바가상머신)은 main 메소드 안의 내용을 한 줄 씩 차례대로 실행하게된다.

        //System.out.println();
        //클래스는 필드와 메소드를 가질 수 있다.
        //System은 대문자로 시작하므로 클래스, out은필드, println()은 메소드이다.
        //System.out은 System이 가지고있는 out이라는 의미이다.
        //out.println은 out이 가지고 있는 println이라는 의미이다.
        //println 뒤에 ()가 붙어있는데 println 메소드라고 한다

        System.out.println("황호영");
        System.out.println("hwhoj1@gmail.com");
        System.out.println("남자");

        System.out.print("황호영");
        System.out.print("hwhoj1@gmail.com");
        System.out.println("남자");

       /* 너비가 별 10개, 높이가 10개인 사각형을 출력하시오
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");*/

        //위의 문제에서 높이가 200인 사각형을 출력하라고 한다면?
        //만약 200~10000 이상의 사각형을 출력하라고 한다면 코드를 만줄을 적는것은 비효율적이다.
        //컴퓨터가 가장 잘 하는 일은 반복하는 일이다.

        //for문을 활용
        for (int i = 0; i < 10; i++){
            System.out.println("**********");
        }

        System.out.println("----------------------------------------");

        //while문을 활용
        int i = 1;
        while (i <= 10){
            System.out.println("**********");
            i = i + 1;
        }
    }
}
