package day0308;

// 별찍기 10번
import java.util.Scanner;

public class StarPrinter10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("별찍기 10번");
        System.out.println("출력할 줄 수를 입력하시오.");
        System.out.print("> ");
        int userNumber = sc.nextInt();

        for (int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = new String();
            
            // 폭이 전부 9칸
            // if 사용해서 1,10의 경우에는 공백이 없다. 그냥 별만
            // 그 외 i가 userNumber보다 작으면 else if
            // 그 외 i가 userNumber보다 크면 else if --> 담기  
            
            
            
            
            
            

            System.out.println(stars);
        }

        sc.close();
    }
}
