//Implement a method that returns the sum of elements of the given array of int{10, 3, 23, 5, -9} -> 32

public class FirstLevel3 {
    public static void main(String[] args) {

        System.out.println(returnSum(new int[] {10, 3, 23, 5, -9}));
    }

    private static int returnSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
