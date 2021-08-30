import java.util.Scanner;

public class lvl5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        double rs = 0;
        double sum = 0;
        double sub[] = new double[n];
        for (int i = 0; i < sub.length; i++) {
            sub[i] = sc.nextInt();
        }
        for (int i = 1; i < sub.length; i++) {
            if (sub[i] > sub[max]) {
                max = i;
            }
        }
        for (int i = 0; i < sub.length; i++) {
            rs = sub[i] / sub[max] * 100;
            sum += rs;
        }
        System.out.println(sum/n);
    }
}
