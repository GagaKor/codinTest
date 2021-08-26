import java.util.Scanner;

public class lvl4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String str = "";
        int a = 0;
        int b = 0;
        int tempInt = q;
        int n = 0;

        while (true) {
            str = tempInt + "";
            if (tempInt > 9) {
                a = Integer.parseInt(str.split("")[0]);
                b = Integer.parseInt(str.split("")[1]);
                if ((a + b) > 9) {
                     str = b+""+((a + b) + "").split("")[1];
                } else {
                     str =  b+""+ (a+b);
                }
                tempInt = Integer.parseInt(str);
                
            } else {
                str = tempInt + "" + tempInt;
                tempInt = Integer.parseInt(str);
            }
            n++;
            if (q == tempInt) {
                break;
            }
        }
        System.out.println(n);
    }
}
