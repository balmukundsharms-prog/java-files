
import java.util.*;
public class madlibs{
    public static void main(String[] args){
        String adjective1;
        String noun1;
        String verb;
        String noun2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter an adjective: ");
        adjective1=scanner.nextLine();
        System.out.println("enter a noun: ");
        noun1=scanner.nextLine();
        System.out.println("enter an activity: ");
        verb=scanner.nextLine();
        System.out.println("enter a noun: ");
        noun2=scanner.nextLine();
        System.out.print("Today was a "+ adjective1 + " day.");
        System.out.println("A "+ noun1 + " came to my house.");
        System.out.println("We went out to "+ verb +". ");
        System.out.println("I saw  "+ noun2 +" there.");
        System.out.println("This may not make any sense.");
        scanner.close();
    }

}
