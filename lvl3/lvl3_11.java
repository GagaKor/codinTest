import java.util.Scanner;

public class lvl3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        String rs = "";
        if (n >= 1 && x <= 10000) {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < x && i != arr.length - 1) {
                    rs += arr[i] + " ";
                } else if (arr[i] < x && i == arr.length - 1) {
                    rs += arr[i];
                }
            }
            System.out.println(rs);
        }
        
    }
}
