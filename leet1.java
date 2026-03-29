import java.util.*;
class question{
    public void required(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter vslue of target: ");
        int target=scan.nextInt();
        int[] num={2,3,5,6,7,8};
        for(int i=0;i<6; i++){
            for(int j=i+1; j<6;j++){
                if(num[i]+num[j]==target){
                    System.out.println("required indices are: "+i+" "+j);
                }
            }
        }

    }
}
public class leet1{
    public static void main(String[] args) {
        question obj1=new question();
        obj1.required();
    }

}
