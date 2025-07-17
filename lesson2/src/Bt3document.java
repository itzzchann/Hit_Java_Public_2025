import java.util.Scanner;

public class Bt3document {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        int l=0;
        int r=n-1;
        int b=n-1;
        int gt=1;
        int [][]a=new int [n][n];
        while(gt<=n*n){
            for(int i=l;i<=r;i++){
                a[t][i]=gt;
                gt++;
            }
            t++;
            for(int i=t;i<=b;i++){
                a[i][r]=gt;
                gt++;
            }r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    a[b][i]=gt;
                    gt++;
                }b--;
            }if(l<=r){
                for(int i=b;i>=t;i--){
                    a[i][l]=gt;
                    gt++;
                }l++;
            }
        }for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
