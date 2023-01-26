import java.util.Scanner;

public class code1 {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
            System.out.println("Enter basic salary ");
        
             double bp = sc.nextInt();
             double hra=0,da=0;
            if(bp>=5000){
                hra= bp*0.1;
                da=bp*0.2;
            }
            else if (bp<=5000){
                hra= bp*0.2;
                da=bp*0.3;
            }
            System.out.println(hra+" "+da);
 
            System.out.println(bp+hra+da);
        }
    }