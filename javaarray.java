import java.util.Scanner;

import java.util.*;
public class javaarray {
    public static void main(String[] args){
        int[][] numbers= new int[2][3];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter values of an array(in integers): ");
                numbers[i][j]=scan.nextInt();
        }
        }
        System.out.println("values of an array(in integers):");
        for(int i=0;i<2;i++){
            System.out.println("");
            for(int j=0;j<3;j++){
                System.out.print(numbers[i][j]+ "  ");
                
        }
        }
        scan.close();
        int k=numbers.length;
        System.out.println(k);
    }
}
