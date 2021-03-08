package day0308;
// 별찍기 6번 어려운 버전 

import java.util.Scanner;

public class StarPrinter06Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("출력할 줄 수를 입력하시오.");
        System.out.println("> ");
        int userNumber = sc.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();

            // 공백을 담당하는 j for 문
            for (int j = 1; j <= i - 1; j++) {
                stars += " ";
            }
            // 별을 담당하는 j for 문
            for (int j = 1; j <= 2 * userNumber - 2 * i + 1; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }
        sc.close();
    }

}
