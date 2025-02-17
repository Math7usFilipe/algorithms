public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-5,2,4,6,10}, 10));
    }

    public static int binarySearch(int[] arr, int target) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = (int) Math.floor((leftIndex + rightIndex) / 2);
            if(target == arr[middleIndex]) {
                return middleIndex;
            }
            if(target < arr[middleIndex]) {
                rightIndex = middleIndex - 1;
            } else {
                leftIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}