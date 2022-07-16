package GeneralMath;

import java.util.Scanner;

public class FIZZBUZZ {

        public static void main (String[] args) {
            // Your code here
            Scanner sc=new Scanner(System.in);
            int N= sc.nextInt();
            for (int i=1; i<=N;i++){
                if (i%3==0 && i%5==0){
                    System.out.print("FIZZBuzz ");

                }
                if (i%3==0){
                    System.out.print("FIZZ ");

                }
                if (i%5==0){
                    System.out.print("Buzz ");

                }
                else{
                    System.out.print(i+" ");
                }
        }


    }

}
