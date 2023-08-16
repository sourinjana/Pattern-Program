import java.util.Scanner;

public class Ques30 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int rno=1;rno<=n;rno++){
            int numPrint=n;
            for (int i = 1; i <=n; i++) {
                System.out.print(numPrint+"\t");
                numPrint--;
            }
            System.out.println();
        }
    }
}
