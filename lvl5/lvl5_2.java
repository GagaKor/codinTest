import java.util.Scanner;

public class lvl5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int temp = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (temp < arr[i]) {
                temp = (arr[i]);
                cnt = i+1;
            }
        }
        System.out.println(temp);
        System.out.println(cnt);
    }
}
