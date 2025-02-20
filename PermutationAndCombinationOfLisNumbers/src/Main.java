import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3};
        permutation(list);
        System.out.println("---------");
        combination(list, 2);
    }

    //permutation
    public static void permutation(int[] list) {
        permutation(list, 0);
    }
    private static void permutation(int[] list, int position) {
        if (position == list.length - 1) {
            System.out.println(Arrays.toString(list));
        } else {
            for (int i = position; i < list.length; i++) {
                replace(list, position, i);
                permutation(list, position + 1);
                replace(list, position, i);
            }
        }
    }
    public static void replace(int[] list, int position1, int position2) {
        int temp = list[position1];
        list[position1] = list[position2];
        list[position2] = temp;
    }

    //combination
    public static void combination(int[] list, int size) {
        combination(list, size, 0, new int[size]);
    }
    private static void combination(int[] list, int size, int position, int[] combination) {
        if (position == size) {
            System.out.println(Arrays.toString(combination));
        }else {
            for (int i = 0; i < list.length; i++) {
                combination[position] = list[i];
                combination(list, size, position + 1, combination);
            }
        }
    }
}