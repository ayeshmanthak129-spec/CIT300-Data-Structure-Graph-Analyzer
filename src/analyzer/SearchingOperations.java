
package analyzer;

import java.util.Arrays;

public class SearchingOperations {

    public int linearSearch(int[] array, int target) {
        int steps = 0;
        long startTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            steps++;

            if (array[i] == target) {
                printResult("Linear Search", target, i, steps,
                        System.nanoTime() - startTime);
                return i;
            }
        }

        printResult("Linear Search", target, -1, steps,
                System.nanoTime() - startTime);
        return -1;
    }

    public int binarySearch(int[] array, int target) {
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);

        int low = 0;
        int high = sorted.length - 1;
        int steps = 0;
        long startTime = System.nanoTime();

        while (low <= high) {
            steps++;
            int mid = low + (high - low) / 2;

            if (sorted[mid] == target) {
                printResult("Binary Search", target, mid, steps,
                        System.nanoTime() - startTime);
                return mid;
            } else if (sorted[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        printResult("Binary Search", target, -1, steps,
                System.nanoTime() - startTime);
        return -1;
    }

    private void printResult(String algorithm, int target,
                             int index, int steps, long time) {
        System.out.println("\n" + algorithm);
        System.out.println("Target: " + target);
        System.out.println("Result: "
                + (index == -1 ? "Not found" : "Found"));
        System.out.println("Index: " + index);
        System.out.println("Steps: " + steps);
        System.out.println("Execution time: " + time + " ns");
    }
}
