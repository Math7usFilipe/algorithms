import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Array original: " + Arrays.toString(arr));

        int[] sortedArray = quickSort(arr);
        System.out.println("Array ordenado: " + Arrays.toString(sortedArray));
    }

    public static int[] quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int pivot = arr[arr.length - 1];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < pivot) {
                left.add(arr[i]);
            } else {
                right.add(arr[i]);
            }
        }

        int[] sortedLeft = quickSort(left.stream().mapToInt(i -> i).toArray());
        int[] sortedRight = quickSort(right.stream().mapToInt(i -> i).toArray());

        return concatenate(sortedLeft, pivot, sortedRight);
    }

    public static int[] concatenate(int[] left, int pivot, int[] right) {
        int[] result = new int[left.length + 1 + right.length];

        System.arraycopy(left, 0, result, 0, left.length);
        result[left.length] = pivot;
        System.arraycopy(right, 0, result, left.length + 1, right.length);

        return result;
    }
}