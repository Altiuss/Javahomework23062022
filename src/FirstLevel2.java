//Implement a method that returns the index of the biggest element
// of a given array of int{10, 33, 3, 5, -9} -> 1


public class FirstLevel2 {
    public static void main(String[] args) {

        int[] array = {10, 33, 3, 5, -9,};


        System.out.println(returnBigestElement(array));


    }

    private static int returnBigestElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
//
            }
        }
        return max;
    }

}
