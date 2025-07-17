import java.util.Scanner;

public class bt2document {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                int l = (i - 1 >= 0)? a[i - 1] : 0;
                int r = (i + 1 < n) ? a[i + 1] : 0;
                a[i] += Math.abs(r - l);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
}
