import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class lvl5_1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            int max = -1000001;
            int min = 1000001;
            for (int i = 0; i < n; i++) {
                if (min > Integer.parseInt(str[i])) {
                    min = Integer.parseInt(str[i]);
                }
                if (max < Integer.parseInt(str[i])) {
                    max = Integer.parseInt(str[i]);
                }
            }
           
             bw.write(min + " " + max);
             bw.flush();
             bw.close();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
