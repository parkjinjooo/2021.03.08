package day0308;
// 별찍기 2번

import java.util.Scanner;

public class StarPriner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("별찍기 2번");
        System.out.println("출력할 줄 수를 입력하시오.");
        System.out.print("> ");
        int userNumber = sc.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();

            for (int j = userNumber; j >= i; j--) {

                stars += "*";

            }
            // for(int j =i; j<= useNumber ; j++){
            // star += "*"
            //}
            System.out.println(stars);
        }
        sc.close();
    }
}
