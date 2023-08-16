import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          int n=scanner.nextInt();
          int sp=n-1;
          int st=1;
          for (int rno = 1; rno <=n; rno++) {
            for (int i = 1; i <=sp; i++) {
                System.out.print("\t");
            }

            for (int i = 1; i <=st; i++) {
                if(i%2==0){
                    System.out.print("\t");
                }else{
                     System.out.print("*\t");
                }
                
            }

            sp--;
            st+=2;
            System.out.println();
          }
    }
}
