public class Main {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{2,1,2,3,4}, 1));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}