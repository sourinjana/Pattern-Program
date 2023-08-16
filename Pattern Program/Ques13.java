import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int Rmax=n*2-1;
        int st=1;
        for(int rno=1;rno<=Rmax;rno++){
            for (int i = 1; i <=st; i++) {
                System.out.print("* ");
            }
            if(rno<n){
                st++;
            }else{
                st--;
            }
           
            System.out.println();
           
        }
    }
}
