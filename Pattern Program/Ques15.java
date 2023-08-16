import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int Rmax=n*2-1;
        int st=n;
        int sp=0;
        for(int rno=1;rno<=Rmax;rno++){
            for (int i = 1; i <=sp; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= st; i++) {
                System.out.print("*\t");
            }

            if(rno>=n){
                st++;
                sp-=2;
            }else{
               st--;
               sp+=2;
            }
            
           
            System.out.println();
           
        }
}

}