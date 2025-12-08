package NumberLogic;

public class ReverseInteger {
    
    public static void main(String[] args) {
        System.out.println(reverseInt(1234));
    }

    private static int reverseInt(int num) {

        int rev = 0;

        while (num != 0) {

            int pop = num % 10;   // get last digit
            num = num / 10;       // remove last digit

            // Check overflow for positive range
            if (rev > Integer.MAX_VALUE / 10 || 
                (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            // Check overflow for negative range
            if (rev < Integer.MIN_VALUE / 10 || 
                (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;  // push digit
        }

        return rev;
    }
}
