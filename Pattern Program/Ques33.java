import java.util.Scanner;

public class Ques33 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int rno=n;rno>=1;rno--){
              
            for (int i = 1; i <rno ; i++) {
                System.out.print("\t");
            }
            for (int i = rno; i <n; i++) {
                System.out.print(i+"\t");
            }
            System.out.print("0\t");
            for (int i = n-1; i>=rno; i--) {
                System.out.print(i+"\t");
            }

            System.out.println();
        }
    }
}
