package lvl1;
import java.util.Scanner;

public class Lvl1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] c = (b+"").split("");
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.println(a * Integer.parseInt(c[i]));
        }
        System.out.println(a*b);
    }
}
