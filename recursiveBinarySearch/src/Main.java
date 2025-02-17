
public class Main {
    public static void main(String[] args) {
        System.out.println(recursiveBinarySearch(new int[]{-5,2,4,6,10}, 10));
    }

    public static int recursiveBinarySearch(int[] arr, int target) {
        return search(arr, target, 0, arr.length);
    }

    private static int search(int[] arr, int target, int left, int right) {
        if(left > right) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        if (arr[middle] == target) {
            return middle;
        }
        if(arr[middle] < target) {
            return search(arr, target, middle + 1, right);
        }else {
            return search(arr, target, left, middle - 1);
        }
    }
}