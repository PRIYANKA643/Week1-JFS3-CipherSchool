// how long is your burrppp
// ask the user to enter burp length
//depend on the input provided burp will beprovidd
// eg 5:burrrrrp
import java.util.Scanner;
public class test4 {
    public static void main(String args[])
    
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How Long is your burp");
        int burplength = sc.nextInt();
        String msg="";
        for (int i=1;i <=burplength; i++){
            msg=msg+"r";//msg+="r"
        }
        System.out.println("Bu"+msg+"p");
    }
    
}
