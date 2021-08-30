import java.util.Scanner;

public class lvl5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = { 0, 0, 0, 0, 0, 0, 0, 0, 0,0};
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a * b * c;
        int temp = 0;
        for (int i = 0; i < String.valueOf(sum).length(); i++) {
            for (int j = 0; j < 10; j++) {
                temp = String.valueOf(sum).charAt(i)-'0';
                if (temp == j) {
                    num[j]++;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
}