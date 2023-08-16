import java.util.Scanner;

public class Ques05 {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sp=0;
        int st=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=sp; j++) {
                System.out.print("  ");
            }
            for (int j = st; j <=n; j++) {
                System.out.print("* ");
            }
            sp++;
            st++;
            System.out.println();
        }
    }
}
