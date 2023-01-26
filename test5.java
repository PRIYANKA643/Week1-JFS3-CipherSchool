/*Assuming you r ridding  Bike and Police officer Stops you
 * Police officer Asking you to provide 2 details
 * your current speed
 * if it is your Birthday today?
 
 * the police officier will Calculate find based on following parameters
 * if it is your birthday your will be waived off(exempted) with 
 * 5Miles/hour
 * if it is not your birthday no exemption will be given
 * if yourspeed is grester than 80 ticket raised will be 'high ticket'
 * if your speed is between 60 ticket raised will be'Mid ticket'
 * if your speed is below 60 ticket raised will be no ticket.
 * // find the ticket!!
 */
import java.util.Scanner;

public class test5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Speed: ");
        int speed=sc.nextInt();

        System.out.println("Today is your birthday:");
        boolean isbirthday=sc.nextBoolean();

        if(isbirthday==true)
        {
            speed-=5;
        }
        {
        if(speed>80)
        System.out.printf("High ticket");
       
        else if(speed>=60)
        System.out.printf("Mid ticket");
        else 
        System.out.printf("No ticket");
        }
    }

}
