import java.util.Scanner;

public class Ques17 {
       public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st=n/2;
        int sp=1;
        for(int rno=1;rno<=n/2+1;rno++){
              for (int i = 1; i <=st; i++) {
                System.out.print("*\t");
              } 

            for (int i = 1; i <=sp; i++) {
                System.out.print("\t");  
              } 
            sp+=2;
          for (int i=1; i<=st; i++) {
            System.out.print("*\t");
            }
            st--;
            System.out.println();
        }
         sp-=4;
         int st1=1;
        for(int rno=1;rno<=n/2;rno++){
              for (int i = 1; i <=st1; i++) {
                System.out.print("*\t");
              } 
            
            for (int i = 1; i <=sp; i++) {
                System.out.print("\t");  
            }
             sp-=2;
              
          for (int i=1; i<=st1; i++) {
            System.out.print("*\t");
            }
         st1++;
           System.out.println();
        }
    }
}
