import java.util.Scanner;

public class Ques04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sp=n-1;
        int st=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=sp; j++) {
                System.out.print("  ");
            }
            for (int j = st; j <=i; j++) {
                System.out.print("* ");
            }
            sp--;
            System.out.println();
        }
    }
}
