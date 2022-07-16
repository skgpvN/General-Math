package GeneralMath;

import java.util.Scanner;

public class SPDEmergency {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner (System.in);
        int P1 = sc.nextInt();
        int P2 = sc.nextInt();
        int P3 = sc.nextInt();
        int P4 = sc.nextInt();
        int P5 = sc.nextInt();
        int sum1=P2+P3+P4+P5;
        int sum2=P1+P3+P4+P5;
        int sum3=P1+P2+P4+P5;
        int sum4=P1+P2+P3+P5;
        int sum5=P1+P2+P3+P4;
        if (P1<sum1 && P2<sum2 && P3<sum3 && P4<sum4 && P5<sum5){
            System.out.println("Stable");
        }

        else{
            System.out.println("SPD Emergency");
        }

    }
}
