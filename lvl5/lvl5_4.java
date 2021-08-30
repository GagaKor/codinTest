import java.util.HashSet;
import java.util.Scanner;


public class lvl5_4 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[10];
       for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt()%42;
       }
       HashSet<Integer> hash = new HashSet<>();
       for (int i = 0; i < arr.length; i++) {
           hash.add(arr[i]);
       }
       System.out.println(hash.size());
   }
}
