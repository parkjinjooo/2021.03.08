package day0308;
// 별찍기 08

import java.util.Scanner;

public class StarPrinter08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("별찍기 8번");
        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = sc.nextInt();

        for (int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = new String();

            if (i < userNumber) {
                // 윗부분

                // 공백을 담당할 j for 문
                for (int j = 1; j <= userNumber - i; j++) {
                    stars += " ";
                }
                // 별을 담당하는 j for 문
                for (int j = 1; j <= i; j++) {
                    stars += "*";
                }

            } else {
                // 아랫부분
                // else에 왔다는 것은
                // i 가 userNumber보다 크거나 같다는 아야기이다.
                // 즉, userNumber가 5일때
                // i가 5~9는 여기로 들어오게 된다.

                // 하지만 기존의 우리 j for문은 항상
                // i가 1~5의 기준으로 진행이 됬었다.
                // 그렇기 때믄에 기존 j for 문을 그대로 쓰면?
                // 모양이 일그러지게 된다.

                // 그 상황에선 우리가 두가지 해법이 있다.

                // 1. 여기 else 로 들어오는 i를 기준으로 해서
                // j for문의 내용을 고친다.

                // 공백을 담당하는 j for 문
                for (int j = 1; j <= i - userNumber; j++) {
                    stars += " ";
                }

                // 1번의 단점은, 코드가 매우 복잡해진다. 그리고 기존의 썼던 j for 문을 거의 새로 만드는 것과 똑같다.

                // 2. else 에서 쓸 1부터 시작하는 새로운 변수를 만들어서 i와 userNumber로
                // 1, 2, 3, .... userNumber까지 증가 되게 만들어서
                // j for문에서 활용해준다!
                // (i를 1로 다시 만들어 주는 방법! 1~4번째줄)

                int lowerI = i - userNumber + 1;

                // 별을 담당하는 j for 문

                for (int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }
                // 2번의 단점은 우리에게 허락된 메모리가 48kb이고 그리고 우리 메모리가 다 쓰게 되면 우주선이 터지기 때문에 마음껏 못만든다 --> 우린
                // 이 세대가 아님.

            }

            System.out.println(stars);
        }
        sc.close();

    }
}
