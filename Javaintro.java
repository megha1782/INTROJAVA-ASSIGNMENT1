
import java.util.Scanner;
public class Javaintro {
    public static String Firstname="megha";
        public static String Lastname="kumari";
        public static int age=20;
    
    public static void Print()
    {
        System.out.println(Firstname);
        System.out.println(Lastname);
        System.out.println(age);

    }
    public static void ReadUser()
    { 
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String n =sc.nextLine();
            
            if(n.equals("XDONE"))
            { System.out.println(n);
            break;
        }
        }
    }
    public static void main(String[] args)
    {
    Javaintro.Print();
    Javaintro.ReadUser();
}
}