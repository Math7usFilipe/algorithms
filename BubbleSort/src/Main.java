public class Main {
    public static void main(String[] args) {
        int[] arr = {8,20, -2, 4, -6};
        bubbleSort(arr);
        System.out.println(arr);
        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length -1; i++) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }while (swapped);
    }


}