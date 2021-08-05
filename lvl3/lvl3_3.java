package lvl3;

import java.util.Scanner;

public class lvl3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        for (int i = 1; i < n + 1; i++) {
            r += i;
        }
        System.out.println(r);
    }
}
