//get user division and print rank
import java.util.Scanner;
public class test3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your division: ");
        int div = sc.nextInt();
        switch(div){
        case 1:
            System.out.println("First Rank");
            break;
        case 2:
            System.out.println("Second Rank");
            break;
        case 3:
            System.out.println("Third Rank");
            break;

        default:
            System.out.println("No Rank");
        }
        


    }
    
}
