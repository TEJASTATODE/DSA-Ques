package Arrays;

public class addingone{
    public static int[] addOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
    
    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] result1 = addOne(digits1);
        System.out.print("Output for {1,2,3}: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int[] digits2 = {9, 9, 9};
        int[] result2 = addOne(digits2);
        System.out.print("Output for {9,9,9}: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}