import java.util.Arrays;

/**
 * Find min and max in int array
 */

public class MinMax {

    public static void main(String[] args) {

        final int[] intArray = {4,2,7,0,1,2,3,5,-1,10,3,4};
        // Cycle array and compare to min and max values
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int element : intArray) {
            if (element < minVal)
                minVal = element;
            if (element > maxVal)
                maxVal = element;
        }
        System.out.println("Min = " + minVal);
        System.out.println("Max = " + maxVal);

        /* Looks compact but O(N*log(N)) complexity
        Arrays.sort(intArray);
        System.out.println("Min = " + intArray[0]);
        System.out.println("Max = " + intArray[intArray.length - 1]);
        */

    }
}
