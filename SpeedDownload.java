package GeneralMath;

import java.util.Scanner;

public class SpeedDownload {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c=a*8/b;
        System.out.println(c);
    }
}
