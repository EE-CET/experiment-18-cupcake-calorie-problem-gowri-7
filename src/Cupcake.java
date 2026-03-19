
import java.util.*;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        long miles = 0;
        long power = 1;

        for (int i = n - 1; i >= 0; i--) {
            miles += arr[i] * power;
            power *= 2;
        }

        System.out.println(miles);
    }
}
