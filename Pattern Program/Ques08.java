import java.util.Scanner;

public class Ques08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st=n;
        for(int rno=1;rno<=n;rno++){
            for(int cno=1;cno<=n;cno++){ 
                if(rno == cno|| cno==st){            //rno == n-cno+1
                    System.out.print("*\t");
                    if (cno==st) {
                        st--;
                    }
                    
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        
    }
}
