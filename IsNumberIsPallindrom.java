package GeneralMath;

public class IsNumberIsPallindrom {
    public static void main(String[] args) {
        int n = 12321;
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            int lastD = temp % 10;
            rev = rev * 10 + lastD;
            temp = temp / 10;

        }
        if (rev == n) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

}
