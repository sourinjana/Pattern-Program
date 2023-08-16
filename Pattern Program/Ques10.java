import java.util.Scanner;

public class Ques10 {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp=0;
        int st=n*2-1;
        for(int rno=1;rno<=n;rno++){
           for (int i = 1; i <=sp; i++) {
            System.out.print("\t");
           }
           for (int i = 1; i <=st; i++) {
            System.out.print("*\t");
           }
           sp++;
           st-=2;
           System.out.println();
        }
    }
}
