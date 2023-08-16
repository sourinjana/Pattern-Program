import java.util.Scanner;

public class Ques32 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int numPrint=1;
        int col=1;
        for(int rno=1;rno<=n*2-1;rno++){
            
            for (int i = 1; i <=col; i++) {
                if(i%2==0){
                    System.out.print("*\t");
                }else{
                       System.out.print(numPrint+"\t");
                }
                
            }

            if(rno<n){
              numPrint++;
              col+=2;
            }else{
               numPrint--;
               col-=2;
            }
            
              
            

            System.out.println();
        }
     }
}
