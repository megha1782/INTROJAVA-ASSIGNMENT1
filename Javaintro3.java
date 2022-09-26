import java.util.*;
import java.util.Scanner;
public class Javaintro3{
    Scanner sc = new Scanner(System.in);

    public static void Area(int r)
        {
            System.out.println("Calculate Area of Circle");
            double z = 3.14*r*r;
            System.out.println(z);

        }
        public static void Circumference(int r)
        {
            System.out.println("Calculate Circumference of a Circle");
            double g= 2*3.14*r;
            System.out.println(g);

        }
    
    public static void SwitchUser()
    {   Scanner sc = new Scanner(System.in);

        int ch= sc.nextInt();
        

        switch(ch)
        { 
            case 1: int r = sc.nextInt();
                    Javaintro3.Area(r);
                    break;
            case 2: int rl = sc.nextInt();
                    Javaintro3.Circumference(rl);
                    break;
            case 3: break;
        }

    }
    public static void main(String[] args)
    {
    Javaintro3.SwitchUser();
}
}