import java.util.*;
public class user {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email id: ");
        String email=scan.nextLine();
        int a=email.indexOf("@");
        Random rand=new Random();
        int id=rand.nextInt(100,999);
        String user=email.substring(0,a);
        System.out.println("Suggested user id is:"+ user + id);

        scan.close();
    }
    
}
