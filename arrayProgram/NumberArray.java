package arrayProgram;

public class NumberArray {

    static int[] makeSubArray(int i, int j, int[] array) {
        
        int subArray[] = new int[((j-i) + 1)];
        for (int index = 0; i<=j; index++) {
            subArray[index] = array[i];
            i++;
        }
        return subArray;
    }

    static int findSecondHighest(int[] a) {
        int high1 = Integer.MIN_VALUE, high2 = Integer.MIN_VALUE;
        for (int i : a) {
            if (high1 < i) {
                high2 = high1;
                high1 = i;
            }       
        }
        return high2;
    }
    public static void main(String[] args) {
        
        
        int firstArray [] = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};

        int subArray [] = makeSubArray(2, 6, firstArray);

        int secondHighest = findSecondHighest(subArray);

        for (int i : subArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nSecond Highest Number in Sub Array: " + secondHighest);

    }
}
