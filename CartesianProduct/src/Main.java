import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3,4,5};

        List<int[]> result = cartesianProduct(arr1, arr2);

        for (int[] pair : result) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }
    }

    public static List<int[]> cartesianProduct(int[] arr, int[] arr2) {
        List<int[]> result = new  ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                result.add(new int[]{arr[i], arr2[j]});
            }
        }
        return result;
    }
}