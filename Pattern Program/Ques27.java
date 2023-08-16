import java.util.Scanner;

public class Ques27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp=n-1;
        int st=1;
        
        for(int rno=1;rno<=n;rno++){
            int col=1;
           for (int i = 1; i <=sp; i++) {
            System.out.print("\t");
            col++;
           }
          int numPrint=1;
           for (int i = 1; i <=st; i++) {

            if(col>=n){
                System.out.print(numPrint+"\t");
                numPrint--;
                col++;
            }else{
                System.out.print(numPrint+"\t");
                numPrint++;
                col++;
            }
        }
           sp--;
           st+=2;
           System.out.println();
        }
    }
}

