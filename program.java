abstract class Doctor{
    abstract void treatpatient();
}

class Physician extends Doctor{

    @Override
    void treatpatient() {
        System.out.println("hi!I am physician \n I treat patients using medicines."); 
    }

}

class Surgeon extends Doctor{

    @Override
    void treatpatient() {
        System.out.println("hi! i am Suregeon \n I treat patients using Surgery!");  
    }
}

class Dentist extends Doctor{

    @Override
    void treatpatient() {
        System.out.println("hi! i am dentist \n i treat patients teeth");    
    }
}
public class program{

    public static void main(String[] args) 
    {
        System.out.println("hi!i am lucy !Receptionist  max care");
        System.out.println("who you are looking for?");
        System.out.println("press1. physician\n2 surgeon\n3 dentist");

        int choice = new java.util.Scanner(System.in).nextInt();
        
        Doctor doc =null ;
        switch(choice) {

        case 1: 
            doc = new Physician();
        break;
        case 2:
            doc =new Surgeon();
        break;
        case 3: 
            doc = new Dentist();
         break;
        
        default :
            System.out.println("A oh! Invalid choice");
            break;
        }
        if( choice<=0 || choice>3)
        {
        System.exit(0);
        }
        else {
            doc.treatpatient();
        }
        }
}