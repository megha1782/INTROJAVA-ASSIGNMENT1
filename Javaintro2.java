import java.util.*;
import java.util.Scanner;
public class Javaintro2 {
    
    public static void ReadUser()
    { 
        Scanner sc = new Scanner(System.in);
        List<String> arr= new ArrayList<>();
        while(true)
        {
            String n =sc.nextLine();

            if(n.equals("XDONE"))
            { System.out.println(arr);
              break;
            }
        else arr.add(n);
        }

    }
    public static void main(String[] args)
    {
    Javaintro2.ReadUser();
}
}