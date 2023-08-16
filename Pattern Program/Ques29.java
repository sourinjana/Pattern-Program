import java.util.Scanner;

public class Ques29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp=n-1;
        int st=1;
        int numPrint=1;
        int x=3;
        for(int rno=1;rno<=n;rno++){
            for (int i = 1; i <=sp; i++) {
                System.out.print("\t");
            }
         for (int i = 1; i<=st; i++) {
            if(i==1 || i==st){
             System.out.print(numPrint+"\t");
            }
            else{
                System.out.print("0\t");
            }
            
               }
               st+=2;
               sp--;
               numPrint++;
           System.out.println();
        }
    }
}
