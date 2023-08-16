import java.util.Scanner;

public class Ques18 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int star=1;
    int speace=n/2;
    for(int rows=1;rows<=n;rows++){
        for(int csp=1;csp<=speace;csp++){
            System.out.print("\t");
        }
        for(int stars=1;stars<=star;stars++){
            System.out.print("*\t");
        }


        if(rows>n/2){
           speace++;
           star-=2;
        }else{
        speace--;
        star+=2;
        }

      
       
        System.out.println();
    
        
        
    }
    }
}
