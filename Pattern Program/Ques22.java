import java.util.Scanner;

public class Ques22 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st=n;
        int sp=1;
        for(int rno=1;rno<=n;rno++){
              for (int i = 1; i <=st; i++) {
                System.out.print("*\t");
              } 
             if(rno!=1){
            for (int i = 1; i <=sp; i++) {
                System.out.print("\t");  
            }
             sp+=2;
              } 
          for (int i=1; i<=st; i++) {
            if (rno==1 && i==1) {
              continue;
            }
            System.out.print("*\t");
            }
         st--;
           System.out.println();
        }
}
}
