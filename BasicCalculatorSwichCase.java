package GeneralMath;

public class BasicCalculatorSwichCase {
    public static void main(String[] args) {
        int i =0;
    }
    static int calculator(char ch, int a, int b)
    {
        // your code here
        int i = 0;
        switch(ch){
            case'/':
                i=a/b;
                break;
            case'*':
                i=a*b;
                break;
            case'+':
                i=a+b;
                break;
            case'-':
                i=a-b;
                break;
        }
        return (i);
    }
}
