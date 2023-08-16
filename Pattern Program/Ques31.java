import java.util.Scanner;

public class Ques31 {
        public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int col=n;
        for(int rno=1;rno<=n;rno++){
            int numPrint=n;
            for (int i = 1; i <=n; i++) {
                if(col==i){
                    System.out.print("*\t");
                    col--;
                }else{
                System.out.print(numPrint+"\t");
                }
                numPrint--;
            }
            System.out.println();
        }
    }
}
