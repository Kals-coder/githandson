package git;
import java.util.*;

public class string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the User Details :");
        System.out.println("Enter the id :");
        int id = sc.nextInt();
        System.out.println("Enter the name :");
        String name = sc.next();
        System.out.println("Enter the username :");
        String user = sc.next();
        System.out.println("Enter the password :");
        String password = sc.next();
        System.out.println("Enter the mobilenumber :");
        String mobile = sc.next();
        System.out.println("Enter the rating :");
        double rating = sc.nextDouble();
        
        System.out.println("User details are :");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Username : "+user);
        System.out.println("Mobile Number : "+mobile);
        System.out.println("Rating : "+rating);
    }
}