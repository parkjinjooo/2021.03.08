package day0308;
// 별찍기 3번
// 공백따로, 별 따로 변수에 담아서!

import java.util.Scanner;

public class StarPrinter03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("별찍기 3번");
        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = sc.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();

            // 공백을 담당하는 j for 문
            
            for (int j = 1; j <= userNumber-i; j++) {
                stars += " ";
                
            }
            
            // 별을 담당하는 j for 문
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
                
            System.out.println(stars);
        }
        sc.close();
    }
}
