public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 20, -2, 4, -6};
        insertionSort(arr);

        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int numberToInsert = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > numberToInsert) {
                arr[j + 1] = arr[j];
                j = j -1;
            }
            arr[j+1] = numberToInsert;
        }
    }

}