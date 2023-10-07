import java.util.Scanner;
class Mains
{
    public static void main(String args[]) throws InterruptedException
    {
        Scanner s=new Scanner(System.in);
        int choice=0;
        while(choice!=8008)
        {
        String name="Amritanshu";
        String pass="246";
        System.out.println("======================");
        System.out.println("Enter Your Username");
        String username=s.next();
        System.out.println("Enter Your Password");
        String password=s.next();
        if(username.equals(name))
        {
            if(password.equals(pass))
            {
                choice=8008;
                loading anim=new loading();
                anim.Animation();
                Types_Of_Numbers noob=new Types_Of_Numbers();
                noob.Num();
                System.exit(0);
            }
        }
        else 
            System.out.println("");
            System.out.println("(っ◔◡◔)っ -: Invalid Username Or Password :- ");
            System.out.println("");
        }
    }
}