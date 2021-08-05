package lvl3;

import java.util.Scanner;

public class lvl3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        while (n <= 100000) {
            System.out.println(cnt);
            cnt++;
            if (cnt > n) {
                break;
            }
        }
    }
}
