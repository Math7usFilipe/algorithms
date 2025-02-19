public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 20, -2, 4, -6};
        mergeSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] arr) {
        int size = arr.length;
        int[] aux = new int[size];

        for (int i = 1; i < size; i *= 2) {
            for (int j = 0; j < size; j += 2 * i) {
                int start = j;
                int middle = Math.min(j + i, size);
                int end = Math.min(j + 2 * i, size);

                merge(arr, aux, start, middle, end);
            }
        }
    }

    private static void merge(int[] arr, int[] aux, int start, int middle, int end) {
        System.arraycopy(arr, start, aux, start, end - start);

        int i = start;
        int j = middle;
        int k = start;

        while (i < middle && j < end) {
            if(aux[i] <= aux[j]) {
                arr[k] = aux[i];
                i++;
            } else {
                arr[k] = aux[j];
                j++;
            }
            k++;
        }

        while (i < middle) {
            arr[k] = aux[i];
            i++;
            k++;
        }

        while (j < end) {
            arr[k] = aux[j];
            j++;
            k++;
        }
    }
}