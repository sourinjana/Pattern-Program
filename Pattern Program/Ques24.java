import java.util.Scanner;

public class Ques24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp=n-1;
        int st=1;
        int numPrint=1;
        for(int rno=1;rno<=n;rno++){
           for (int i = 1; i <=sp; i++) {
            System.out.print("  ");
           }

           for (int i = 1; i <=st; i++) {
            System.out.print(numPrint+" ");
           }

           sp--;
           st+=2;
           numPrint++;
           System.out.println();
        }
    }
}
