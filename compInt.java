import java.util.*;
public class compInt {
    public static void main(String[] args){
        double amt;
        double prin;
        double rate;
        double years;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter princial amount:  ");
        prin=scan.nextDouble();
        System.out.print("Enter rate of interest:  ");
        rate=scan.nextDouble();
        boolean calcPer;
        System.out.print("Interst is compounded once per year(true/false):  ");
        calcPer=scan.nextBoolean();
        if(calcPer){
            System.out.println("Enter no. of years: ");
            years=scan.nextDouble();
            amt=prin*Math.pow((1+(rate/100)),years);
            System.out.printf("Total amunt compounded is: %,.4f",amt);
        }
        else{
            System.out.println("Enter no. of times per year interest is calculated: ");
            double n=scan.nextDouble();
            System.out.println("Enter no. of years: ");
            years=scan.nextDouble();
            amt=prin*Math.pow((1+(rate/(100*n))),(n*years));
            System.out.printf("Total amunt compounded is: %,.4f",amt);
        }
        scan.close();

    }
}
